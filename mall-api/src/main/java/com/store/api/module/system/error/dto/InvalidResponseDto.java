package com.store.api.module.system.error.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class InvalidResponseDto {
    private List<String> globalErrors;
    private List<String> fieldErrors;
}
