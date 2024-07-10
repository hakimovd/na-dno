package com.hakimov.nadno;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:person.properties")
public class PersonConfig {
    @Bean
    public Person spongeBob() {
        Person spongeBob =  new Person();
        spongeBob.setName(@Value("${spongeBob.name}"));
        spongeBob.setAge(@Value("${spongeBob.age}"));
        return spongeBob;
    }
}
