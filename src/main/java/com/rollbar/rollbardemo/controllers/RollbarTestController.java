package com.rollbar.rollbardemo.controllers;

import com.rollbar.rollbardemo.services.error.ExternalErrorHandlerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/rollbar-test")
@AllArgsConstructor
@Tag(name = "RollbarTestController", description = "Send request to rollbar")
public class RollbarTestController {

    private final ExternalErrorHandlerService rollbarErrorHandlerService;
    private final String message = "Sending %s to roll bar at time : " + new Date().getTime();
    private final String description = "This is test %s notification to rollbar";

    @GetMapping("/send/error")
    public ResponseEntity<String> sendError() {
        String error = String.format(message, "error");
        rollbarErrorHandlerService.sendError(new RuntimeException(error));
        return ResponseEntity.of(Optional.of(error));
    }

    @GetMapping("/send/error-desc")
    public ResponseEntity<String> sendErrorWithDesc() {
        String error = String.format(message, "error");
        rollbarErrorHandlerService.sendError(new RuntimeException(error), String.format(description, "error"));
        return ResponseEntity.of(Optional.of(error));
    }

    @GetMapping("/send/info")
    public ResponseEntity<String> sendInfo() {
        String error = String.format(message, "info");
        rollbarErrorHandlerService.sendInfo(new RuntimeException(error));
        return ResponseEntity.of(Optional.of(error));
    }

    @GetMapping("/send/info-desc")
    public ResponseEntity<String> sendInfoWithDesc() {
        String error = String.format(message, "info");
        rollbarErrorHandlerService.sendInfo(new RuntimeException(error), String.format(description, "info"));
        return ResponseEntity.of(Optional.of(error));
    }

    @GetMapping("/send/debug")
    public ResponseEntity<String> sendDebug() {
        String error = String.format(message, "debug");
        rollbarErrorHandlerService.sendDebug(new RuntimeException(error));
        return ResponseEntity.of(Optional.of(error));
    }

    @GetMapping("/send/debug-desc")
    public ResponseEntity<String> sendDebugWithDesc() {
        String error = String.format(message, "debug");
        rollbarErrorHandlerService.sendDebug(new RuntimeException(error), String.format(description, "debug"));
        return ResponseEntity.of(Optional.of(error));
    }

}
