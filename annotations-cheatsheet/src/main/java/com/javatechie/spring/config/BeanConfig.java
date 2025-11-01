package com.javatechie.spring.config;

import com.javatechie.spring.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration//spring ioc expect couple of @Bean annotation which will return the object
//spring ioc searches @Bean annotation
//once spring ioc get @Bean then spring ioc will create object of TestBean and maintains the life cycle.
public class BeanConfig {

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }

}
