package com.madfat.polls.service;

import com.madfat.polls.model.Poll;
import com.madfat.polls.payload.PagedResponse;
import com.madfat.polls.payload.PollRequest;
import com.madfat.polls.payload.PollResponse;
import com.madfat.polls.payload.VoteRequest;
import com.madfat.polls.security.UserPrincipal;

public interface PollService {
    PagedResponse<PollResponse> getAllPolls(UserPrincipal currentUser, int page, int size);
    PagedResponse<PollResponse> getPollsCreatedBy(String username, UserPrincipal currentUser, int page, int size);
    PagedResponse<PollResponse> getPollsVotedBy(String username, UserPrincipal currentUser, int page, int size);
    Poll createPoll(PollRequest pollRequest);
    PollResponse getPollById(String id, UserPrincipal currentUser);
    PollResponse castVoteAndGetUpdatedPoll(String pollId, VoteRequest voteRequest, UserPrincipal currentUser);
}
