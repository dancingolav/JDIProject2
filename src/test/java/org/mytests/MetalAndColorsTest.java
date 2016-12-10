package org.mytests;


import org.mytests.entities.Plate;
import org.mytests.testdata.PlateData;
import org.testng.annotations.Test;
import static com.epam.web.matcher.testng.Assert.assertTrue;
import static org.mytests.EpamTestSite.*;

/**
 * Created by AlexSh on 20.11.2016.
 */
public class MetalAndColorsTest extends InitTests{




    @Test( dataProviderClass=PlateData.class, dataProvider="dataforplateform")
    public void plateTest(Plate plate) {


        metalsAndColorsPage.isOpened();

        metalsAndColorsPage.plateForm.submit(plate);
        assertTrue(metalsAndColorsPage.checkCalculate(plate),"The result (sum) is wrong");
        assertTrue(metalsAndColorsPage.checkColors(plate),"The color is wrong");
        assertTrue(metalsAndColorsPage.checkMetals(plate),"The metal is wrong");
        assertTrue(metalsAndColorsPage.checkVegetables(plate),"The vegetables are wrong");
        assertTrue (metalsAndColorsPage.checkElements(plate),"The elements are wrong");

    }



}
