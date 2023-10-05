package org.example.config;

import org.example.domain.Horse;
import org.example.domain.Pair;
import org.example.domain.Rider;
import org.example.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfiguration {
    @Bean
    public Horse horse1() {
        return new Horse("Horse1");
    }

    @Bean
    public Horse horse2() {
        return new Horse("Horse2");
    }

    @Bean
    public Horse horse3() {
        return new Horse("Horse3");
    }


    @Bean
    public Rider rider1() {
        return new Rider("Rider1", 20);
    }

    @Bean
    public Rider rider2() {
        return new Rider("Rider2", 21);
    }

    @Bean
    public Rider rider3() {
        return new Rider("Rider3", 22);
    }


    @Bean
    public Pair pair1(Horse horse1, Rider rider1) {
        return new Pair(horse1, rider1);
    }

    @Bean
    public Pair pai2(Horse horse2, Rider rider2) {
        return new Pair(horse2, rider2);
    }

    @Bean
    public Pair pair3(Horse horse3, Rider rider3) {
        return new Pair(horse3, rider3);
    }

    @Bean
    public User user() {
        return new User();
    }
}
