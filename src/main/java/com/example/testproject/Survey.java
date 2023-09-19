package com.example.testproject;

import com.example.testproject.Enum.HowHear;

public class Survey {
    private User user;
    private HowHear hh;
    private Contact contact;

    public Survey(User user, HowHear hh, Contact contact) {
        this.user = user;
        this.hh = hh;
        this.contact = contact;
    }

    public User getUser() {
        return user;
    }

    public Contact getContact() {
        return contact;
    }

    public HowHear getHh() {
        return hh;
    }
}
