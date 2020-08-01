package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/myconfig/myconfig.properties")
public class SpringDemoApplication {
	//xmÐÞ¸ÄÁË´úÂë
	//李四修改了代码
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
