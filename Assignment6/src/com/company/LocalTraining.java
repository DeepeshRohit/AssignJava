package com.company;


public class LocalTraining extends Training {

    private int participants;

    public LocalTraining (int id, String subject, int fees,int participants) {
        super(id,subject,fees);
        this.participants = participants;
    }

    public int getParticipants() {

        return participants;
    }

    public void setParticipants(int participants) {

        this.participants = participants;
    }

    public int getOrderValue() {

        return( getFees() * getParticipants());
    }
}
