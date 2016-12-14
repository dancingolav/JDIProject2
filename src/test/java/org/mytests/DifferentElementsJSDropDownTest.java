package org.mytests;


import org.junit.Assert;
import org.mytests.testdata.DropDownData;
import org.testng.annotations.Test;

import static org.mytests.EpamTestSite.differentElementsPage;

/**
 * Created by AlexSh on 20.11.2016.
 *
 */

public class DifferentElementsJSDropDownTest extends InitTests{


        @Test(dataProviderClass=DropDownData.class, dataProvider="dropdowndata")
        public void dropdownDifferentElementsPageTest(String color){
            differentElementsPage.isOpened();
            differentElementsPage.dropDown.click();
            differentElementsPage.dropDown.select(color);
            System.out.println(differentElementsPage.dropDown.getText());
            Assert.assertTrue ("The color is wrong",differentElementsPage.dropDown.getText().equals(color));


        }



    }



