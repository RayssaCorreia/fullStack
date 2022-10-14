package dev.rayssacorreia.Application.services;

import dev.rayssacorreia.Application.models.requets.LockRequest;
import dev.rayssacorreia.Application.models.responses.LockResponse;

public interface LockService {

    LockResponse saveLock(LockRequest lockRequest);

    LockResponse getLock(String lockId);
}
