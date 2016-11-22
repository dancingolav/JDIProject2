package org.mytests.components;

import com.epam.jdi.uitests.core.interfaces.complex.ICheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.mytests.enums.Nature;
import org.openqa.selenium.support.FindBy;

/**
 * Created by AlexSh on 20.11.2016.
 */
public class Elements extends Section{
    @FindBy(css = "#elements-checklist label")
    public ICheckList<Nature> nature;
}
