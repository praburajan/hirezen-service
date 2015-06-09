package com.hirezen.controller.user;

import com.hirezen.repository.user.UserRepository;
import com.hirezen.resource.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by praburajan on 09/06/15.
 * REST Controller for users
 */
@RestController
@RequestMapping("/hirezen/users")
public class UserController {
    @Autowired
    private UserRepository repo;

    @RequestMapping(method= RequestMethod.GET)
    public List getAll() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public User getUser(@PathVariable String id) {
        return repo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        User find = repo.findByEmail(user.getEmail());
        User created = null;
        if(find == null) {
            created = repo.save(user);
        }
        return created;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable String id) {
        repo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public User update(@PathVariable String id, @RequestBody User user) {
        User toUpdate = repo.findOne(id);
        if(user.getName() != null) {
            toUpdate.setName(user.getName());
        }
        if(user.getEmail() != null) {
            toUpdate.setEmail(user.getEmail());
        }
        if(user.getPassword() != null) {
            toUpdate.setPassword(user.getPassword());
        }
        //TODO: set team information
        toUpdate.setTeam(user.getTeam());
        return repo.save(toUpdate);
    }
}
