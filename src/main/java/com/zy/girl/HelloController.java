package com.zy.girl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



@Autowired
private GirlPropties GirlPropties;

    @RequestMapping(value = {"/hello/{id}","/hel"},method = RequestMethod.GET)
    public  String say(@PathVariable(value = "id",required = false) String id){
        return id+"ss";
    }


}