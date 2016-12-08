package org.mytests.components;

import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import org.mytests.enums.Nature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import java.util.List;

/**
 * Created by AlexSh on 07.12.2016.
 */
public class DiffElemPageCheckList extends CheckList<Nature> {

    private String inputLocatorString;
    private String locatorString;

    public DiffElemPageCheckList(String locatorString, String inputLocatorString) {
        super(By.xpath(locatorString));
        this.inputLocatorString = locatorString + inputLocatorString;
        this.locatorString = locatorString;

    }


    public List<WebElement> getInputElements() {
        return getDriver().findElements(By.xpath(inputLocatorString));
    }


    public List<String> getSelected() {
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

    public boolean wereSelectedRightCheckBoxes( String[] wantedCheckBoxValues) {
        boolean bln = true;
        List<String> realSelectedList = getSelected();
        for (String selected : wantedCheckBoxValues) {
            bln = bln && realSelectedList.contains(selected);

        }

        return bln;
    }
}
