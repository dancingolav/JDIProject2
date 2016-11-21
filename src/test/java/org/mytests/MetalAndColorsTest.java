package org.mytests;

import com.epam.jdi.uitests.core.interfaces.complex.IDropList;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.mytests.entities.User;
import org.mytests.enums.Vegetables;
import org.testng.annotations.Test;



import static org.mytests.EpamTestSite.homePage;
import static org.mytests.EpamTestSite.metalsAndColorsPage;



/**
 * Created by AlexSh on 20.11.2016.
 */
public class MetalAndColorsTest {

    @Test(priority=3)
    public void beforeMetalAndColorTest() {
        homePage.open();
        //Set Login Form In Proper State
        homePage.setLoginFormInProperState();
        //Attempt to Login
        homePage.userLoginForm.login(User.DEFAULT_USER);
        metalsAndColorsPage.open();
    }

    @Test(priority=4)
    public void plateTest() {
        metalsAndColorsPage.plateForm.summary.odds.select("1");
        metalsAndColorsPage.plateForm.summary.even.select("6");
        metalsAndColorsPage.plateForm.elements.nature.uncheckAll();
        metalsAndColorsPage.plateForm.elements.nature.select("Water","Earth");
        metalsAndColorsPage.plateForm.colors.expand();
        metalsAndColorsPage.plateForm.colors.select("Green");
        metalsAndColorsPage.plateForm.metals.expand();
        metalsAndColorsPage.plateForm.metals.select("Gold");
        metalsAndColorsPage.plateForm.vegetables.uncheckAll();
        metalsAndColorsPage.plateForm.vegetables.select("Tomato");


        try {
            Thread.sleep(9000);
        } catch (Exception e) {

        }

    }

}
