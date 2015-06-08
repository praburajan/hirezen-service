package com.hirezen.resource.candidate;

import org.springframework.data.annotation.Id;

/**
 * Created by praburajan on 08/06/15.
 * Separate collection
 */
public class Status {
    @Id
    private String id;
    private String name;

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
}
