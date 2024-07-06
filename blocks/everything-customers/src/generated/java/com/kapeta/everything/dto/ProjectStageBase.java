/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;

@Data
public class ProjectStageBase {

    @NotNull
    private String id;

    @NotNull
    private String name;

    @NotNull
    private float confidenceLevel;
}
