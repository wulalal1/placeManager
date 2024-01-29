package com.example.common.enums;

public enum LikesMoudleEnum {
    BLOG("博客");
    private String value;

    public String getValue() {
        return value;
    }

    LikesMoudleEnum(String value) {
        this.value = value;
    }
}
