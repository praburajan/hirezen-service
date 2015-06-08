package com.hirezen.repository.candidate;

import com.hirezen.resource.candidate.Candidate;
import com.hirezen.resource.candidate.Status;
import com.hirezen.resource.user.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by praburajan on 08/06/15.
 */
public interface CandidateRepository extends MongoRepository<Candidate, String> {
    public Candidate findByEmail(String email);
    public Candidate findByName(String name);
    public List<Candidate> findByTeam(Team team);
    public List<Candidate> findByStatus(Status status);
}
