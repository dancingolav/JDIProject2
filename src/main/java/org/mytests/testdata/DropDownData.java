package org.mytests.testdata;
import org.testng.annotations.DataProvider;
import org.testng.annotations.DataProvider;

/**
 * Created by AlexSh on 10.10.2016.
 */



public class DropDownData {
    @DataProvider(name="dropdowndata")
    public static Object [][] createDataForRadioButtons() {
        return new Object[][] {
                {"Red" }, {"Green"}, {"Blue" }, {"Yellow" },


        };

    }
}
