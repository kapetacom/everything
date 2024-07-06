/**
 * GENERATED SOURCE - DO NOT EDIT
 */
package com.kapeta.everything.config.jwt;

import com.kapeta.spring.config.providers.TestConfigProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestAuthjwtconsumerConsumerConfig {

    @Bean
    public TestConfigProvider.TestConfigurationAdjuster jwtAuthjwtconsumerConsumerConfig() {
        return provider ->
            provider.withServiceAddress(
                "authjwtconsumer",
                "http",
                "http://localhost:8080"
            );
    }
}
