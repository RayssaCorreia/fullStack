package dev.rayssacorreia.Application.controller;

import dev.rayssacorreia.Application.models.requets.LockRequest;
import dev.rayssacorreia.Application.models.responses.LockResponse;
import dev.rayssacorreia.Application.services.LockService;
import dev.rayssacorreia.Application.services.implementation.LockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@RestController(value = "/")

public class LockController {

    @Autowired
    private LockService lockService;

    @PostMapping
    public LockResponse saveLock(@RequestBody LockRequest lockRequest) {

        return lockService.saveLock(lockRequest);
    }

    @GetMapping("/{lockId}")
    public LockResponse getLock(@PathVariable String lockId) {
        return lockService.getLock(lockId);
    }

}
