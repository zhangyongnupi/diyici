package com.zy.girl;


import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class GirlController {


    @Resource
    private GirlRepository girlRepository;

    @GetMapping(value = "/getGirlList")
    public List<Girl> getGirlList() {
        return girlRepository.findAll();
    }

    /**
     * 添加女生
     *
     * @return
     */
    @GetMapping(value = "/addGirl")
    public Girl getGirlList(@RequestParam("cupSize") String cupSize,
                            @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    /**
     * 根据id查询女生
     *
     * @return
     */
    @GetMapping(value = "/findGirlById")
    public Girl getGirlList(@RequestParam("id") Integer id){
    return girlRepository.findById(id).get();
    }

    /**
     * 更新女生(部分字段)
     */
    @GetMapping(value = "/updateGirl")
    public Integer updateGirlList(@RequestParam("id") Integer id,
                            @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        return girlRepository.updateGirl(girl);
    }
    /**
     * 删除女生
     */
    @GetMapping(value = "/deleteGirl")
    public void updateGirlList(@RequestParam("id") Integer id) {
       girlRepository.deleteById(id);
    }

}