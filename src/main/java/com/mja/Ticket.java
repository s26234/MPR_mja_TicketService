package com.mja;

public class Ticket {

    private int id;
    private String about;
    private String answer;

    public Ticket ticket(id, String about, String answer) {
        this.id = id;
        this.about = about;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getAbout() {
        return about;
    }

    public String getAnswer() {
        return answer;
    }


}
