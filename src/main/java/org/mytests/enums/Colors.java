package org.mytests.enums;

/**
 * Created by Roman_Iovlev on 9/21/2015.
 */
public enum Colors {
    COLORS("Colors"), RED("Red"), GREEN("Green"), BLUE("Blue"), YELLOW("Yellow");

    public String value;

    Colors(String value) {
        this.value = value;
    }
}
