package org.mytests.components;

import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Colors;

/**
 * Created by AlexSh on 14.12.2016.
 */
public class DiffElemDropDown extends Dropdown<Colors> {


    private String locatorString;
    private String optionLocatorString;


    public DiffElemDropDown(String locatorString, String optionLocatorString) {
        super(By.xpath(locatorString),By.xpath(locatorString), By.xpath(locatorString + optionLocatorString));
        this.optionLocatorString = locatorString + optionLocatorString;
        this.locatorString = locatorString;

    }


        @Override
        protected String getTextAction () {

            WebElement select = getDriver().findElement(By.xpath(locatorString));
            String color = (String)((JavascriptExecutor)getDriver()).executeScript("var select = arguments[0]; return select.options[select.selectedIndex].text", select );

        return color;
    }


}
