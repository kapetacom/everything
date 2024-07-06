package com.kapeta.everything.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Base configurations
 * */
@Configuration
public class BaseConfig {

    @Bean
    protected ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
