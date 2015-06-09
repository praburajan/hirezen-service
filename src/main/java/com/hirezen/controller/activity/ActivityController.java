package com.hirezen.controller.activity;

import com.hirezen.repository.activity.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by praburajan on 09/06/15.
 */
@RestController
@RequestMapping("/hirezen/teams")
public class ActivityController {
    @Autowired
    private ActivityRepository repo;


}
