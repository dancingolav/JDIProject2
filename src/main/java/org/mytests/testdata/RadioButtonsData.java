package org.mytests.testdata;
import org.testng.annotations.DataProvider;
/**
 * Created by AlexSh on 17.10.2016.
 */



public class RadioButtonsData {
      @DataProvider(name="radiobuttons")
       public static Object [][] createDataForRadioButtons() {
           return new Object[][] {
                   {"Gold" }, {"Silver"}, {"Bronze" }, {"Selen" },
                   {"Selen" }, {"Bronze"}, {"Silver"}, {"Gold" },
                   {"Silver" }

           };


       }
}
