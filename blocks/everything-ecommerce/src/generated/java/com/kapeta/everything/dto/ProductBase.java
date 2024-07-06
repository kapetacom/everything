/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;

@Data
public class ProductBase {

    @NotNull
    private String id;

    private String sku;

    @NotNull
    private double price;

    private double tax;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private String categoryId;

    @NotNull
    private List<String> tags;
}
