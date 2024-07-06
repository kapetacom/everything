/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;

@Data
public class TokenWithPasswordBase {

    @NotNull
    private String token;

    @NotNull
    private String password;
}
