package com.hirezen.controller.candidate;

import com.hirezen.repository.candidate.CandidateRepository;
import com.hirezen.resource.candidate.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by praburajan on 09/06/15.
 * REST Controller for candidates
 */
@RestController
@RequestMapping("/hirezen/candidates")
public class CandidateController {
    @Autowired
    private CandidateRepository repo;

    @RequestMapping(method= RequestMethod.GET)
    public List getAll() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Candidate create(@RequestBody Candidate candidate) {
        return repo.save(candidate);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable String id) {
        repo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public Candidate update(@PathVariable String id, @RequestBody Candidate candidate) {
        Candidate toUpdate = repo.findOne(id);
        toUpdate.setName(candidate.getName());
        toUpdate.setEmail(candidate.getEmail());
        toUpdate.setExperience(candidate.getExperience());
        toUpdate.setLocation(candidate.getLocation());
        toUpdate.setMobileNumber(candidate.getMobileNumber());
        toUpdate.setNoticePeriod(candidate.getNoticePeriod());
        toUpdate.setOpenToRelocate(candidate.isOpenToRelocate());
        toUpdate.setSkills(candidate.getSkills());
        toUpdate.setSalaryDetails(candidate.getSalaryDetails());
        toUpdate.setTeam(candidate.getTeam());
        return repo.save(toUpdate);
    }
}
