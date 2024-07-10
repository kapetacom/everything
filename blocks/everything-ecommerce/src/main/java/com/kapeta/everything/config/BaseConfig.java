package com.kapeta.everything.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Base configurations
 * */
@Configuration
public class BaseConfig {

    @Bean
    protected BCryptPasswordEncoder getBCrypptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    protected ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
