package com.madfat.polls.model;

public class ChoiceVoteCount {
    private String choiceId;
    private Long voteCount;

    public String getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }

    public ChoiceVoteCount() {
    }

    public ChoiceVoteCount(String choiceId, Long voteCount) {
        this.choiceId = choiceId;
        this.voteCount = voteCount;
    }
}
