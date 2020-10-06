package com.company;

public class Training {

    private  int id;
    private  String subject;
    private  int fees;

    public Training(int id, String subject, int fees) {
        super();
        this.id = id;
        this.subject = subject;
        this.fees = fees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }


}