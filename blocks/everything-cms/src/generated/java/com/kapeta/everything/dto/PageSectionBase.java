/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;

@Data
public class PageSectionBase {

    @NotNull
    private String pageId;

    @NotNull
    private String type;

    @NotNull
    private String content;
}
