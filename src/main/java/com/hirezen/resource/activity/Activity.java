package com.hirezen.resource.activity;

import com.hirezen.resource.user.User;
import org.springframework.data.annotation.Id;

import java.util.Calendar;
import java.util.List;

/**
 * Created by praburajan on 08/06/15.
 * Separate collection
 */
public class Activity {
    @Id
    private String id;
    private Calendar time;
    private List<User> recipients;
    private User updatedBy;
    private String activityType;
    private String description;
    private boolean notification;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public List<User> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<User> recipients) {
        this.recipients = recipients;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }
}
