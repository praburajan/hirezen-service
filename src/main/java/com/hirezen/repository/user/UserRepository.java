package com.hirezen.repository.user;

import com.hirezen.resource.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by praburajan on 08/06/15.
 */
public interface UserRepository extends MongoRepository<User, String> {
    public User findByEmail(String email);
    public User findByName(String name);
}
