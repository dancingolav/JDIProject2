package org.mytests.components;

import com.epam.jdi.uitests.core.interfaces.base.IElement;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ILabel;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.complex.ICheckList;
import com.epam.jdi.uitests.core.interfaces.complex.IComboBox;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.web.selenium.elements.base.Element;
import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.complex.ComboBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.mytests.entities.Plate;

import org.mytests.enums.Colors;
import org.mytests.enums.Metals;
import org.mytests.enums.Nature;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


/**
 * Created by AlexSh on 19.11.2016.
 */
public class PlateForm extends Form<Plate> {

    @FindBy(id = "summary-block")
    public Summary summary;

    @FindBy(id = "calculate-button")
    public ILabel calculate;

    @FindBy(id = "calculate-button")
    public IButton calculateButton;

    @FindBy(id = "calculate-button")
    public ILabel calculateLabel;

    public IDropDown<Colors> colors = new Dropdown<>(By.cssSelector(".colors .filter-option"),
            By.cssSelector(".colors li span"));

    @FindBy(css = ".summ-res")
    public IText calculateText;

    @FindBy(css = "#elements-checklist label")
    public ICheckList<Nature> nature;

    @FindBy(xpath = "//*[@id='elements-checklist']//*[label[text()='%s']]/label")
    public ICheckList<Nature> natureTemplate;


    @FindBy(xpath = "//*[@id='elements-checklist']//*[text()='Water']")
    public CheckBox cbWater = new CheckBox() {
        @Override
        protected boolean isCheckedAction() {
            return new Element(By.xpath("//*[@id='elements-checklist']//*[*[text()='Water']]/input"))
                    .getInvisibleElement().getAttribute("checked") != null;
        }
    };

    public IComboBox<Metals> comboBox =
            new ComboBox<Metals>(By.cssSelector(".metals .caret"), By.cssSelector(".metals li span"), By.cssSelector(".metals input")) {
                @Override
                protected String getTextAction() {
                    return new Text(By.cssSelector(".metals .filter-option")).getText();
                }
            };
}
