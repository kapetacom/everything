/**
 * GENERATED SOURCE - DO NOT EDIT
 */
package com.kapeta.everything.config.postgres;

import com.kapeta.spring.config.providers.TestConfigProvider;
import com.kapeta.spring.config.providers.types.ResourceInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestCmsConfig {

    @Bean
    public TestConfigProvider.TestConfigurationAdjuster postgresCmsConfig() {
        return provider ->
            provider.withResourceInfo(
                "cms",
                "postgres",
                new ResourceInfo()
                    .withHost("localhost")
                    .withPort("5432")
                    .withCredential("username", "root")
                    .withCredential("password", "root")
                    .withResource("cms")
            );
    }
}
