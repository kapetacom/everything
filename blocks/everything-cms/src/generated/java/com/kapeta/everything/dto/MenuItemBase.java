/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;
import org.springframework.data.domain.Page;

@Data
public class MenuItemBase {

    @NotNull
    private String id;

    @NotNull
    private String parentId;

    @NotNull
    private String name;

    private PageDTO page;
}
