/**
 * GENERATED SOURCE - DO NOT EDIT
 */
package com.kapeta.everything.repositories.cms;

import com.kapeta.spring.postgres.AbstractPostgresConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
    basePackages = { "com.kapeta.everything.repositories.cms" }
)
public class CmsConfig extends AbstractPostgresConfig {

    public CmsConfig() {
        super("cms");
    }
}
