/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;

@Data
public class ProductCategoryBase {

    @NotNull
    private String id;

    @NotNull
    private String parentId;

    @NotNull
    private String name;

    @NotNull
    private String description;
}
