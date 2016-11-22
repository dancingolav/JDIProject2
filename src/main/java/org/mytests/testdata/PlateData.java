package org.mytests.testdata;

import org.mytests.entities.Plate;
import org.mytests.entities.User;
import org.testng.annotations.DataProvider;

/**
 * Created by AlexSh on 21.11.2016.
 */
public class PlateData {
    @DataProvider(name="dataforplateform")
    public static Object [][] createDataForPlateForm() {
        return new Object[][] {
                //String odD "1","3","5","7"
                //String eveN "2","4","6","8"
                //String[] elementS {"Water", "Earth", "Wind", "Fire"}
                //String coloR "Colors","Red","Yellow","Green","Blue"
                //String metaL "Col","Gold","Silver","Bronze","Selen" And it can have any text since it's combo box
                //String vegetableS {"Salad","Cucumber","Tomato","Onion"}

                //Plate(String odD, String eveN, String[] elementS, String coloR, String metaL, String[] vegetableS)
                { new Plate("1","2", new String[] {}, "Yellow","Silver",new String[] {})},
                { new Plate("1","2", new String[] {}, "Yellow","Silver",new String[] {"Tomato"})},
                { new Plate("3","6", new String[] {"Fire"}, "Red","Silver",new String[] {"Salad","Cucumber"})},
                { new Plate("5","8", new String[] {"Earth", "Wind"}, "Green","Gold",new String[] {"Onion","Cucumber","Tomato"})},
                { new Plate("1","8", new String[] {"Water", "Earth", "Wind", "Fire"}, "Green","Gold",new String[] {"Onion","Cucumber","Tomato","Salad"})}

        };


    }

}
