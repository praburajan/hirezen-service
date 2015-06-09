package com.hirezen.constants;

/**
 * Created by praburajan on 09/06/15.
 */
public interface Constants {
    public static enum Status {
        RECRUITER_SUBMITTED,
        IN_PROGRESS,
        REJECTED,
        HIRING_MANAGER_APPROVED,
        OFFER_APPROVAL_IN_PROGRESS,
        OFFER_APPROVED,
        OFFER_REJECTED
    }

    public static enum ActivityType {
        CANDIDATE_CREATED,
        CANDIDATE_PROFILE_UPDATED,
        CANDIDATE_INTERVIEW_SCHEDULED,
        CANDIDATE_INTERVIEW_RESCHEDULED,
        CANDIDATE_REJECTED,
        CANDIDATE_FEEDBACK_ENTERED,
        REQUIREMENT_CREATED,
        CANDIDATE_REASSIGNED,
        CANDIDATE_
    }
}

