package org.mytests.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.components.PlateForm;
import org.openqa.selenium.support.FindBy;

/**
 * Created by AlexSh on 20.11.2016.
 */
public class MetalsAndColorsPage extends WebPage {
    @FindBy(xpath="//div[@class='main-content-hg']/form[@class='form']")
    public PlateForm plateForm;


}
