package com.store.api.module.member.controller.v1;

import com.store.api.module.system.ApiResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserInfoControllerV1 {

    @GetMapping
    public ResponseEntity<ApiResponseDto<?>> getUser() {
        return ResponseEntity.ok(new ApiResponseDto<>("Hello"));
    }

}
