package com.user.management.model;

import lombok.Getter;

@Getter
public enum FlagEnum {

    DELETE("delete"),
    UPDATE("update"),
    ADD("add");

    private final String value;

    FlagEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static FlagEnum fromString(String flagName) {
        for(FlagEnum flag : FlagEnum.values()) {
            if(flag.getValue().equals(flagName)) {
                return flag;
            }
        }
        throw new IllegalArgumentException("存在していないフラグ: " + flagName);
    }
}
