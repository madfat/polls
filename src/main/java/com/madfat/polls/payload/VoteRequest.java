package com.madfat.polls.payload;

import javax.validation.constraints.NotNull;

public class VoteRequest {
    @NotNull
    private String choiceId;

    public String getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId;
    }
}
