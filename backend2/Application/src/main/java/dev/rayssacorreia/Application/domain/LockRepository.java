package dev.rayssacorreia.Application.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockRepository extends MongoRepository <Lock, String> {

    java.util.concurrent.locks.Lock findByLockId(String lockId);
}
