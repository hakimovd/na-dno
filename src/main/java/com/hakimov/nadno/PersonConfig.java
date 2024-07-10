package com.hakimov.nadno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    public Person spongeBob() {
        return new Person("Sponge Bob", 25);
    }

    @Bean
    public Person patrick() {
        return new Person("patrick", 23);
    }

    @Bean
    public Person squidward() {
        return new Person("squidward", 47);
    }

}
