package com.store.api.module.essential.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DefaultErrorResponseDto {
    private String detailMessage;
}
