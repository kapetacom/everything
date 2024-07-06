/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;

@Data
public class PageBase {

    @NotNull
    private String id;

    @NotNull
    private String title;

    @NotNull
    private String type;

    @NotNull
    private String slug;

    @NotNull
    private String description;

    @NotNull
    private Date created;

    @NotNull
    private Date updated;
}
