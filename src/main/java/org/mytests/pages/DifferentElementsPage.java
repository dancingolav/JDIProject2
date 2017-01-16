package org.mytests.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.complex.ITextList;
import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.components.DiffElemDropDown;
import org.mytests.components.DiffElemPageCheckList;
import org.mytests.components.DiffElemPageRadioButtons;
import org.openqa.selenium.support.FindBy;


public class DifferentElementsPage extends WebPage {


   public DiffElemPageRadioButtons diffElemPageMetals = new DiffElemPageRadioButtons(
            "//div[@class='checkbox-row']/label[@class='label-radio']",
            "/input");


    public DiffElemPageCheckList diffElemPageNature = new DiffElemPageCheckList(
            "//div[@class='checkbox-row']/label[@class='label-checkbox']",
            "/input");

    public DiffElemDropDown dropDown = new  DiffElemDropDown("//select[@class='uui-form-element']",
            "/option");

    @FindBy(xpath = "//button[@name='Default Button']")
    public IButton defaultButton;

    @FindBy(xpath = "//input[@type='button']")
    public IButton button;

    @FindBy(xpath="//ul[@class='panel-body-list logs'] /li[1]")
    public IText lastLogRecorg;



    public boolean doesLastLogRecordContain(String ... partsOfStringsWeAreLooking) {


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
