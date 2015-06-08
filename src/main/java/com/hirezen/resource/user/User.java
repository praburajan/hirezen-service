package com.hirezen.resource.user;

import org.springframework.data.annotation.Id;

/**
 * Created by praburajan on 08/06/15.
 */
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String team; //id of the team

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
