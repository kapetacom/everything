/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;

@Data
public class CustomerProjectBase {

    @NotNull
    private String id;

    @NotNull
    private String customerId;

    @NotNull
    private String name;

    @NotNull
    private String description;

    private double revenuePotential;

    @NotNull
    private String stageId;
}
