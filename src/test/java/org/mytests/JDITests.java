package org.mytests;

import com.epam.web.matcher.testng.Assert;
import org.mytests.entities.Plate;
import org.mytests.entities.User;
import org.mytests.testdata.LoginData;
import org.mytests.testdata.PlateData;
import org.testng.annotations.Test;

import static org.mytests.EpamTestSite.homePage;
import static org.mytests.EpamTestSite.metalsAndColorsPage;
import static org.testng.Assert.assertTrue;


public class JDITests extends InitTests {


    @Test( dataProviderClass=LoginData.class, dataProvider="dataforloginform")
    public void tryLogin(boolean testType, User user) {

        homePage.isOpened();
        homePage.checkOpened();

        //Set Login Form In Proper State
        homePage.setLoginFormInProperState();

        //Attempt to Login
        homePage.userLoginForm.login(user);


        //Did the user log in ?
        //Is login succeed? It has to be...  Is login failed? It has to be...
        assertTrue (testType ? homePage.isLoginSucceed(): homePage.isLoginFailed());


    }

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
        Assert.assertTrue(metalsAndColorsPage.checkCalculate(plate),"The result (sum) is wrong");
        Assert.assertTrue(metalsAndColorsPage.checkColors(plate),"The color is wrong");
        Assert.assertTrue(metalsAndColorsPage.checkMetals(plate),"The metal is wrong");
        Assert.assertTrue(metalsAndColorsPage.checkVegetables(plate),"The vegetables are wrong");
        Assert.assertTrue (metalsAndColorsPage.checkElements(plate),"The elements are wrong");


    }


}
