package org.mytests.components;


import com.epam.jdi.uitests.web.selenium.elements.complex.Selector;
import org.mytests.enums.Metals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.epam.jdi.uitests.web.settings.WebSettings.getDriver;

/**
 * Created by AlexSh on 07.12.2016.
 */
public class DiffElemPageRadioButtons extends Selector<Metals> {

    private String inputLocatorString;
    private String locatorString;

    public DiffElemPageRadioButtons(String locatorString, String inputLocatorString) {
        super(By.xpath(locatorString));
        this.inputLocatorString = locatorString + inputLocatorString;
        this.locatorString = locatorString;

    }


    public List<WebElement> getInputElements() {
        return getDriver().findElements(By.xpath(inputLocatorString));
    }



    public List<String> whatIsSelected() {
        List<WebElement> lw = getInputElements();

        List<String> ls = new ArrayList<String>();
        int i = 0;
        for (WebElement e : lw) {
            i = i++;
            if (e.isSelected())
                ls.add(e.findElement(By.xpath("..")).getText());
        }
     return ls;
    }

    public boolean wasSelectedRightRadioButton(String wantedRadioButton) {

       List<String> realSelectedList = whatIsSelected();
       if  (realSelectedList.size()==0 && wantedRadioButton.equals(""))
           return true;
       return  realSelectedList.contains(wantedRadioButton);
    }
}
