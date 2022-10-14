package dev.rayssa.webcidades.user.domains;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <InfoUsers, String>{


}
