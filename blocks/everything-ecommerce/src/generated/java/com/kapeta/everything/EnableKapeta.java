/**
 * GENERATED SOURCE - DO NOT EDIT
 */
package com.kapeta.everything;

import com.kapeta.spring.annotation.KapetaEnablePostgres;
import com.kapeta.spring.annotation.KapetaEnableRestClient;
import com.kapeta.spring.annotation.KapetaEnableRestResource;
import com.kapeta.spring.annotation.KapetaEnableSecurityConsumerConfig;
import com.kapeta.spring.annotation.KapetaSpringApplication;
import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@KapetaSpringApplication
@KapetaEnableRestClient
@KapetaEnableRestResource
@KapetaEnablePostgres
@KapetaEnableSecurityConsumerConfig
public @interface EnableKapeta {
}
