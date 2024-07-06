/**
 * GENERATED SOURCE - DO NOT EDIT
 */

package com.kapeta.everything.dto;

import com.kapeta.everything.dto.UserDTO;
import jakarta.validation.constraints.NotNull;
import java.util.*;
import lombok.*;

@Data
public class PageCommentBase {

    @NotNull
    private String pageId;

    @NotNull
    private UserDTO author;

    @NotNull
    private String content;

    @NotNull
    private Date created;
}
