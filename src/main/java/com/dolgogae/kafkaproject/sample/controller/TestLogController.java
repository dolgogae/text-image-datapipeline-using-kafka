package com.dolgogae.kafkaproject.sample.controller;

import com.dolgogae.kafkaproject.sample.service.TestLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/log")
@RequiredArgsConstructor
@Slf4j
public class TestLogController {

    private final TestLogService testLogService;

    @Operation(summary = "slack 로그 전송", description = "slack에 로그가 전송됩니다.", tags = {"Test Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @GetMapping("slack")
    public String slackLog(){
        testLogService.logging();
        return "Success sent to slack";
    }
}
