package com.hirezen.repository.team;

import com.hirezen.resource.user.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by praburajan on 09/06/15.
 */
public interface TeamRepository extends MongoRepository<Team,String> {
    public Team findByName(String name);
}
