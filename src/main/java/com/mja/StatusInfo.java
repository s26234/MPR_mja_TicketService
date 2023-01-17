package com.mja;
import java.time.LocalDate;

public class StatusInfo {
    private String solution;
    private LocalDate startDate;


    public StatusInfo(String solution, LocalDate startDate) {
        this.solution = solution;
        this.startDate = startDate;
    }

    public String getSolution() {
        return solution;
    }
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}

