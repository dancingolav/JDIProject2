package org.mytests;

import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.mytests.entities.User;
import org.testng.annotations.Test;

import static org.mytests.EpamTestSite.homePage;
import static org.mytests.EpamTestSite.metalsAndColorsPage;


/**
 * Created by AlexSh on 20.11.2016.
 */
public class MetalAndColorsTest {

    @Test(priority=3)
    public void plateTest() {
        homePage.open();
        //Set Login Form In Proper State
        homePage.setLoginFormInProperState();
        //Attempt to Login
        homePage.userLoginForm.login(User.DEFAULT_USER);
        metalsAndColorsPage.open();
        metalsAndColorsPage.plateForm.summary.odds.select("1");
        metalsAndColorsPage.plateForm.summary.even.select("6");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }

    }

}
