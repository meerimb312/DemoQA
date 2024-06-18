package com.demoqa.enums;

import lombok.Getter;

public enum SidePanelMenu {

    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time"),
    RECRUITMENT("Recruitment"),
    MYINFO("My Info"),
    PERFORMANCE("Performance"),
    DASHBOARD("Dashboard"),
    DIRECTORY("Directory"),
    MAINTENANCE("Maintenance"),
    CLAIM("Claim"),
    BUZZ("Buzz");


    @Getter
    String menu;

    SidePanelMenu(String menu) {
        this.menu = menu;
    }

}
