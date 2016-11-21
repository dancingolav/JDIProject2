package org.mytests.enums;


public enum Even {
    TWO("2"), FOUR("4"), SIX("6"), EIGHT("8");

    public String value;

    Even(String value) {
        this.value = value;
    }
}