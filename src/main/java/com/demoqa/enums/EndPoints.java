package com.demoqa.enums;

import lombok.Getter;

public enum EndPoints {
    ALERT("/alerts"),
    FRAMES("/frames"),
    TEXTBOX("/text-box"),
    WEBTABLES("/webtables"),
    BUTTONS("/buttons"),
    MENU("/menu"),
    PROGRESSBAR("/progress-bar"),
    SELECT_MENU("/select-menu"),
    CHECKBOX("/checkbox"),
    PRACTICE_FORM("/automation-practice-form"),
    BROWSERHELPER("/browser-windows");

    @Getter
    String endpoint;

    EndPoints(String endpoint) {
        this.endpoint = endpoint;
    }
}
