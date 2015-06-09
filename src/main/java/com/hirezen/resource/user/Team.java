package com.hirezen.resource.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Created by praburajan on 08/06/15.
 * Separate collection
 */
public class Team {
    @Id
    private String id;
    private String name;
    @DBRef
    private User hiringManager;
    @DBRef
    private User director;

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

    public User getHiringManager() {
        return hiringManager;
    }

    public void setHiringManager(User hiringManager) {
        this.hiringManager = hiringManager;
    }

    public User getDirector() {
        return director;
    }

    public void setDirector(User director) {
        this.director = director;
    }
}
