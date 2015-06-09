package com.hirezen.repository.activity;

import com.hirezen.resource.activity.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by praburajan on 09/06/15.
 */

public interface ActivityRepository extends MongoRepository<Activity,String> {

}
