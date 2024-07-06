/**
 * GENERATED SOURCE - DO NOT EDIT
 */
package com.kapeta.everything.repositories.users;

import com.kapeta.spring.postgres.AbstractPostgresConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
    basePackages = { "com.kapeta.everything.repositories.users" }
)
public class UsersConfig extends AbstractPostgresConfig {

    public UsersConfig() {
        super("users");
    }
}
