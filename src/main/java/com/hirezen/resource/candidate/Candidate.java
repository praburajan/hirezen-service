package com.hirezen.resource.candidate;

import com.hirezen.resource.user.Team;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * Created by praburajan on 08/06/15.
 * Separate collection
 */
public class Candidate {
    @Id
    private String id;
    private String name;
    private String email;
    private String mobileNumber;
    private String location;
    private boolean openToRelocate;
    private List<String> skills;
    private Salary salaryDetails;
    private int noticePeriod;
    private float experience; //number of years of experience
    @DBRef
    private Status status;
    @DBRef
    private List<Interview> interviews;
    @DBRef
    private Team team;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOpenToRelocate() {
        return openToRelocate;
    }

    public void setOpenToRelocate(boolean openToRelocate) {
        this.openToRelocate = openToRelocate;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Salary getSalaryDetails() {
        return salaryDetails;
    }

    public void setSalaryDetails(Salary salaryDetails) {
        this.salaryDetails = salaryDetails;
    }

    public int getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(int noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    class Salary {
        private int current;
        private int expectedIncrease;

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }

        public int getExpectedIncrease() {
            return expectedIncrease;
        }

        public void setExpectedIncrease(int expectedIncrease) {
            this.expectedIncrease = expectedIncrease;
        }
    }
}
