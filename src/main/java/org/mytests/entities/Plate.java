package org.mytests.entities;

import java.util.Arrays;

/**
 * Created by AlexSh on 19.11.2016.
 */
public class Plate {


    public static final Plate DEFAULT_PLATE = new Plate();

    public String odD ;
    public String eveN;
    public String[] elementS;
    public String colorS;
    public String metalS;
    public String[] vegetableS;




    public Plate() {

        this.odD = "1";
        this.eveN = "2";
        this.elementS = new String[] {"Water"};
        this.colorS="Colors";
        this.metalS= "Col";
        this.vegetableS= new String[] {"Salad"};
    }

    public Plate(String odD, String eveN, String[] elementS, String colorS, String metalS, String[] vegetableS) {
        this.odD = odD;
        this.eveN = eveN;
        this.elementS = elementS;
        this.colorS=colorS;
        this.metalS=metalS;
        this.vegetableS=vegetableS;
    }



    @Override
    public String toString() {
        return odD +","+eveN+","+Arrays.toString(elementS)+","+colorS+","+metalS+","+Arrays.toString(vegetableS);
    }
}
