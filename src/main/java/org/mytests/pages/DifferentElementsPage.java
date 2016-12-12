package org.mytests.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.core.interfaces.complex.ISelector;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.complex.Selector;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.components.DiffElemPageCheckList;
import org.mytests.components.DiffElemPageRadioButtons;
import org.mytests.enums.Colors;
import org.mytests.enums.Metals;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


public class DifferentElementsPage extends WebPage {


   public DiffElemPageRadioButtons diffElemPageMetals = new DiffElemPageRadioButtons(
            "//div[@class='checkbox-row']/label[@class='label-radio']",
            "/input");


    public DiffElemPageCheckList diffElemPageNature = new DiffElemPageCheckList(
            "//div[@class='checkbox-row']/label[@class='label-checkbox']",
            "/input");

    @FindBy(xpath = "//button[@name='Default Button']")
    public IButton defaultButton;

    @FindBy(xpath = "//input[@type='button']")
    public IButton button;

    @FindBy(xpath="//ul[@class='panel-body-list logs'] /li[1]")
    public IText lastLogRecorg;




    public boolean isLastLogRecordContains(String ... partsOfStringsWeAreLooking) {


        boolean hasAllSubStrings =true;

        if (lastLogRecorg.isDisplayed()) {

            for (String partOfString : partsOfStringsWeAreLooking) {
                          hasAllSubStrings = hasAllSubStrings &&
                        (lastLogRecorg.getText().contains(partOfString));
            }

            return hasAllSubStrings;
        }
        else
            return false;


    }



}
