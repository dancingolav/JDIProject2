package org.mytests;


import org.junit.Assert;
import org.mytests.entities.Plate;
import org.mytests.entities.User;
import org.mytests.testdata.CheckBoxButtonsData;
import org.mytests.testdata.PlateData;
import org.mytests.testdata.RadioButtonsData;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.epam.web.matcher.testng.Assert.assertTrue;
import static org.mytests.EpamTestSite.differentElementsPage;
import static org.mytests.EpamTestSite.homePage;
import static org.mytests.EpamTestSite.metalsAndColorsPage;

/**
 * Created by AlexSh on 20.11.2016.
 */
public class DifferentElementsTest extends InitTests{


    @Test (dataProviderClass=CheckBoxButtonsData.class, dataProvider="checkboxbuttons")
    public void NatureCheckBoxButtonsDifferentElementsPageTest(String [] wantedCheckBoxValues) {

        prepareEvironmentForDifferentElementsTest();

        differentElementsPage.diffElemPageNature.select(wantedCheckBoxValues);

         Assert.assertTrue("Wrong checkboxes are selected",
                differentElementsPage.diffElemPageNature.wereSelectedRightCheckBoxes(wantedCheckBoxValues)) ;
    }

    @Test (dataProviderClass=RadioButtonsData.class, dataProvider="radiobuttons")
    public void radioButtonsDifferentElementsPageTest(String radioButtonName) {

        prepareEvironmentForDifferentElementsTest();
        differentElementsPage.diffElemPageMetals.select(radioButtonName);

        Assert.assertTrue("Wrong radiobutton selected",
                differentElementsPage.diffElemPageMetals.wasSelectedRightRadioButton(radioButtonName));
    }

    @Test
    public void buttonSDifferentElementsPageTest() {

        prepareEvironmentForDifferentElementsTest();
        differentElementsPage.button.click();
        Assert.assertTrue("A button 'BUTTON' does not work properly",
                differentElementsPage.isLastLogRecordContains("button:button clicked"));

        differentElementsPage.defaultButton.click();
        Assert.assertTrue("A button 'DEFAULT BUTTON' does not work properly",
                differentElementsPage.isLastLogRecordContains("Default Button:button clicked"));

        differentElementsPage.button.click();
        Assert.assertTrue("A button 'BUTTON' does not work properly",
                differentElementsPage.isLastLogRecordContains("button:button clicked"));

    }


    public static void prepareEvironmentForDifferentElementsTest() {

        homePage.open();

        if (!homePage.isLogged()) {
            //Set Login Form In Proper State
            homePage.setLoginFormInProperState();
            //Attempt to Login
            homePage.userLoginForm.login(User.DEFAULT_USER);

        }

        differentElementsPage.open();

    }



}
