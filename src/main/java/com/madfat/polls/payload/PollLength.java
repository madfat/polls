package com.madfat.polls.payload;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PollLength {
    @NotNull(message = "please enter the days")
    @Max(7)
    private Integer days;

    @NotNull(message = "please enter the hours")
    @Max(23)
    private Integer hours;

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
