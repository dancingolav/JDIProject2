package org.mytests.testdata;

import org.testng.annotations.DataProvider;

/**
 *
 * Created by AlexSh on 17.10.2016.
 */


public class CheckBoxButtonsData {
    @DataProvider(name = "checkboxbuttons")
    public static Object[][] createDataForCheckBox() {
        return new Object[][]{
                {new String[] {"Water", "Earth", "Wind", "Fire"}},
                {new String[] {}},
                {new String[] {"Wind"}},
                {new String[] {"Water", "Earth"}}

        };

    }
}
