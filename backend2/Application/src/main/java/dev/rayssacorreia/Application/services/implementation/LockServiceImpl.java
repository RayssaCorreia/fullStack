package dev.rayssacorreia.Application.services.implementation;

import dev.rayssacorreia.Application.domain.LockRepository;
import dev.rayssacorreia.Application.models.requets.LockRequest;
import dev.rayssacorreia.Application.models.responses.LockResponse;
import dev.rayssacorreia.Application.services.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.locks.Lock;

@Service
public class LockServiceImpl implements LockService {

    @Autowired
    private LockRepository lockRepository;

    @Override
    public LockResponse saveLock(LockRequest lockRequest) {

        ModelMapper modelMapper = new ModelMapper();

        Lock lock = modelMapper.map(lockRequest, Lock.class);

        lock.setLockId(UUID.randomUUID().toString());

        Lock lockSaved = lockRepository.save(lock);

        return modelMapper.map(lockSaved, LockResponse.class);

    }

    @Override
    public LockResponse getLock(String lockId) {

        ModelMapper modelMapper = new ModelMapper();
        Lock lock = lockRepository.findByLockId(lockId);

        return modelMapper.map(lock, LockResponse.class);
    }

}
