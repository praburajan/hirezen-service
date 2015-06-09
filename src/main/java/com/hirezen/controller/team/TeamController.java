package com.hirezen.controller.team;

import com.hirezen.repository.team.TeamRepository;
import com.hirezen.resource.user.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by praburajan on 09/06/15.
 */
@RestController
@RequestMapping("/hirezen/teams")
public class TeamController {
    @Autowired
    private TeamRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    public List getAll() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Team getTeam(String id) {
        return repo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteTeam(String id) {
        repo.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Team createTeam(Team team) {
        return repo.save(team);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Team update(@PathVariable String id, Team team) {
        Team toUpdate = repo.findOne(id);
        if(toUpdate != null) {
            toUpdate.setName(team.getName());
            toUpdate.setDirector(team.getDirector());
            toUpdate.setHiringManager(team.getHiringManager());
        }
        return repo.save(toUpdate);
    }
}
