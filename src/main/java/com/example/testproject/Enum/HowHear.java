package com.example.testproject.Enum;

public enum HowHear {
    SEARCH_ENGINE("SE", "Search engine"),
    WORD_OF_MOUTH("WM", "Word of mouth"),
    SOCIAL_MEDIA("SM", "Social Media"),
    OTHER("O", "Other"),;

    String name;
    String display;
    HowHear(String name, String display) {
        this.name = name;
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public static HowHear getByName(String name) {
        for(HowHear how : HowHear.values()) {
            if (how.name.equals(name))
                return how;
        }
        return OTHER;
    }
}
