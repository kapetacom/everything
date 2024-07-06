package com.kapeta.everything.config;

import com.kapeta.spring.annotation.KapetaTestContext;
import org.springframework.context.annotation.Configuration;

/**
 * Base configurations for the test environment
 *
 * You can add beans or similar here if needed.
 *
 * @KapetaTestContext will provide the Kapeta SDK with the necessary information to configure the test environment
 *
 * Also see the com.kapeta.everything.config package for more test configuration
 */
@Configuration
@KapetaTestContext
public class TestBaseConfig {}
