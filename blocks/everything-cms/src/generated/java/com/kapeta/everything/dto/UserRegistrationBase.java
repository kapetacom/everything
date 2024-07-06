/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;

@Data
public class UserRegistrationBase {

    @NotNull
    private String email;

    @NotNull
    private String name;

    @NotNull
    private String password;
}
