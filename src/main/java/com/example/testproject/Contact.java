package com.example.testproject;

import com.example.testproject.Enum.HowHear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contact {
    private String[] checked = {};
    private String contactMethod;

    public Contact(String[] checked, String contactMethod) {
        this.checked = checked;
        this.contactMethod = contactMethod;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public String[] getChecked() {
        return checked;
    }

    public String getCheck() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < getChecked().length; i++) {
            s.append(Checks.getByName(getChecked()[i]).displayName).append("; ");
        }
        return s.toString();
    }

    public ContactVia getContactVia() {
        return ContactVia.getByName(getContactMethod());
    }

    public String getContactViaString() {
        return getContactVia().displayName;
    }

    enum Checks {
        YES("YES","YES, I'd like that"),
        YES1("YES1","YES, please send me email announcements"),
        NULL("NULL","");

        String name;
        String displayName;
        Checks(String name, String display) {
            this.name = name;
            this.displayName = display;
        }
        public static Checks getByName(String name) {
            for(Checks how : Checks.values()) {
                if (how.name.equals(name))
                    return how;
            }
            return NULL;
        }
    }

    enum ContactVia {
        EMAIL("email","Email or postal mail"),
        PHONE("phone","Phone call"),
        NULL("NULL","");

        String name;
        String displayName;
        ContactVia(String name, String display) {
            this.name = name;
            this.displayName = display;
        }
        public static ContactVia getByName(String name) {
            for(ContactVia how : ContactVia.values()) {
                if (how.name.equals(name))
                    return how;
            }
            return NULL;
        }
    }


}
