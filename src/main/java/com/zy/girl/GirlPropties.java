package com.zy.girl;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 获取yml配置文件中前缀是girl的属性
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlPropties {

    private String cupSize;

    private String ages;


    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getAge() {
        return ages;
    }

    public void setAge(String age) {
        this.ages = age;
    }
}
