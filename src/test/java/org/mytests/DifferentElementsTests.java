package org.mytests;


import org.junit.Assert;
import org.mytests.testdata.CheckBoxButtonsData;
import org.mytests.testdata.RadioButtonsData;
import org.testng.annotations.Test;
import static org.mytests.EpamTestSite.differentElementsPage;

/**
 * Created by AlexSh on 20.11.2016.
 *
 */

public class DifferentElementsTests extends InitTests{



    @Test (dataProviderClass=CheckBoxButtonsData.class, dataProvider="checkboxbuttons")
    public void NatureCheckBoxButtonsDifferentElementsPageTest(String [] wantedCheckBoxValues) {

        differentElementsPage.isOpened();

        differentElementsPage.diffElemPageNature.select(wantedCheckBoxValues);

         Assert.assertTrue("Wrong checkboxes were selected",
                differentElementsPage.diffElemPageNature.wereSelectedRightCheckBoxes(wantedCheckBoxValues)) ;
    }

    @Test (dataProviderClass=RadioButtonsData.class, dataProvider="radiobuttons")
    public void radioButtonsDifferentElementsPageTest(String radioButtonName) {

        differentElementsPage.isOpened();

        differentElementsPage.diffElemPageMetals.select(radioButtonName);

        Assert.assertTrue("Wrong radiobutton were selected",
                differentElementsPage.diffElemPageMetals.wasSelectedRightRadioButton(radioButtonName));
    }

    @Test
    public void buttonSDifferentElementsPageTest() {

        differentElementsPage.isOpened();

        differentElementsPage.button.click();
        Assert.assertTrue("The button 'BUTTON' does not work properly",
                differentElementsPage.isLastLogRecordContains("button:button clicked"));

        differentElementsPage.defaultButton.click();
        Assert.assertTrue("The button 'DEFAULT BUTTON' does not work properly",
                differentElementsPage.isLastLogRecordContains("Default Button:button clicked"));

        differentElementsPage.button.click();
        Assert.assertTrue("The button 'BUTTON' does not work properly",
                differentElementsPage.isLastLogRecordContains("button:button clicked"));

    }




}
