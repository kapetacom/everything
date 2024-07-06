/**
 * GENERATED SOURCE - DO NOT EDIT
 */
package com.kapeta.everything.config;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("features")
@Data
public class FeaturesConfig {

    @NotNull
    private boolean selfRegistrationEnabled;
}
