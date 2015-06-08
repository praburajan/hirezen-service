package com.hirezen.resource.candidate;

import com.hirezen.resource.user.User;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;

/**
 * Created by praburajan on 08/06/15.
 * This will be a separate collection
 */
public class Interview {
    @Id
    private String id;
    private int roundNumber;
    private User interviewer; //id of the user who did the interview
    private List<Feedback> feedback;
    private boolean decision;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public User getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(User interviewer) {
        this.interviewer = interviewer;
    }

    public List<Feedback> getFeedback() {
        return feedback;
    }

    public void setFeedback(List<Feedback> feedback) {
        this.feedback = feedback;
    }

    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    class Feedback {
        private String criteria;
        private String feedback;
        private String document;

        public String getCriteria() {
            return criteria;
        }

        public void setCriteria(String criteria) {
            this.criteria = criteria;
        }

        public String getFeedback() {
            return feedback;
        }

        public void setFeedback(String feedback) {
            this.feedback = feedback;
        }

        public String getDocument() {
            return document;
        }

        public void setDocument(String document) {
            this.document = document;
        }
    }
}
