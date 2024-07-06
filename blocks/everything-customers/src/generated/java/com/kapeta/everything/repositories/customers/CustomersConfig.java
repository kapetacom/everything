/**
 * GENERATED SOURCE - DO NOT EDIT
 */
package com.kapeta.everything.repositories.customers;

import com.kapeta.spring.postgres.AbstractPostgresConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
    basePackages = { "com.kapeta.everything.repositories.customers" }
)
public class CustomersConfig extends AbstractPostgresConfig {

    public CustomersConfig() {
        super("customers");
    }
}
