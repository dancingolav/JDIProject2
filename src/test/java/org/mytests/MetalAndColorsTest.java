package org.mytests;

import com.epam.web.matcher.junit.Assert;
import org.mytests.entities.Plate;
import org.mytests.entities.User;
import org.mytests.testdata.PlateData;
import org.testng.annotations.Test;


import static com.epam.web.matcher.testng.Assert.assertTrue;
import static org.mytests.EpamTestSite.homePage;
import static org.mytests.EpamTestSite.metalsAndColorsPage;



/**
 * Created by AlexSh on 20.11.2016.
 */
public class MetalAndColorsTest extends InitTests{

    public void prepareEvironmentForMetalAndColorTest() {

        homePage.isOpened();

        if (!homePage.isLogged()) {
            //Set Login Form In Proper State
            homePage.setLoginFormInProperState();
            //Attempt to Login
            homePage.userLoginForm.login(User.DEFAULT_USER);
        }
    }

    @Test( dataProviderClass=PlateData.class, dataProvider="dataforplateform")
    public void plateTest(Plate plate) {



        prepareEvironmentForMetalAndColorTest();

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.plateForm.submit(plate);
        assertTrue(metalsAndColorsPage.checkCalculate(plate),"The result (sum) is wrong");
        assertTrue(metalsAndColorsPage.checkColors(plate),"The color is wrong");
        assertTrue(metalsAndColorsPage.checkMetals(plate),"The metal is wrong");
        assertTrue(metalsAndColorsPage.checkVegetables(plate),"The vegetables are wrong");
        assertTrue (metalsAndColorsPage.checkElements(plate),"The elements are wrong");



      /*try {
            Thread.sleep(15000);
        } catch (Exception e) {

        }*/



    }

}
