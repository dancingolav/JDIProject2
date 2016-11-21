package org.mytests.enums;

/**
 * Created by Maksim_Palchevskii on 10/6/2015.
 */
public enum Metals {
    COL("Col"), GOLD("Gold"), SILVER("Silver"), BRONZE("Bronze"), SELEN("Selen");

    public String value;

    Metals(String value) {
        this.value = value;
    }

}
