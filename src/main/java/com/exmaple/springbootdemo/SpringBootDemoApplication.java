package com.exmaple.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootDemoApplication.class, args);

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springContext.xml");
        // 根据name获取bean，默认返回的是Object类型，可以强转一下
        SttUser user = (SttUser) applicationContext.getBean("user");
        System.out.println(user);
    }

}
