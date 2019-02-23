package com.zy.girl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

//根据id查询Girl类
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    /**
     * 自定义更新操作，更新某个字段
     * @param girl
     * @return
     */
   @Modifying
   @Transactional
   @Query("update Girl  set age= :#{#girl.age} where id= :#{#girl.id}")
   Integer updateGirl(@Param("girl") Girl girl);
}
