package com.example.common.enums;

public enum StatusEnum {
    CHECKING("待审核"),
    CHECK_OK("审核通过"),
    CHECK_NO("审核未通过"),


    ;

    public String status;

    StatusEnum(String status) {
        this.status = status;
    }
}
