package com.blog.api.module.system.error.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DefaultErrorResponseDto {
    private String detailMessage;
}
