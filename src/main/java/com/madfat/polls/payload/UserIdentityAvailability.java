package com.madfat.polls.payload;

public class UserIdentityAvailability {
    private Boolean available;
    private String extraMessage;

    public UserIdentityAvailability(Boolean available) {
        this.available = available;
    }

    public UserIdentityAvailability(Boolean available, String msgExtra) {
        this.available = available;
        this.extraMessage = msgExtra;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getExtraMessage() {
        return extraMessage;
    }

    public void setExtraMessage(String extraMessage) {
        this.extraMessage = extraMessage;
    }
}
