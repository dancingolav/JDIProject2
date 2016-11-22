package org.mytests.components;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import com.epam.jdi.uitests.core.interfaces.base.IElement;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ILabel;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.complex.ICheckList;
import com.epam.jdi.uitests.core.interfaces.complex.IComboBox;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.core.interfaces.complex.IDropList;
import com.epam.jdi.uitests.web.selenium.elements.base.Element;
import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.ComboBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.DropList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.mytests.entities.Plate;

import org.mytests.enums.Colors;
import org.mytests.enums.Metals;
import org.mytests.enums.Nature;
import org.mytests.enums.Vegetables;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;




public class PlateForm extends Form<Plate> {

    @FindBy(id = "summary-block")
    public Summary summary;

    @FindBy(id= "elements-block")
    public Elements elements;


    public IDropDown<Colors> colors = new Dropdown<>(By.cssSelector(".colors .caret"), By.cssSelector(".colors .filter-option"),
            By.cssSelector(".colors li span"));


    @FindBy(xpath="//button[@id='submit-button'][@type='submit'][text()='Submit']")
    public IButton submit;


    public IComboBox<Metals> metals =
            new ComboBox<Metals>(By.cssSelector(".metals .caret"), By.cssSelector(".metals li span"), By.cssSelector(".metals input")) {
                @Override
                protected String getTextAction() {
                    return new Text(By.cssSelector(".metals .filter-option")).getText();
                }
            };


    public IDropList<Vegetables> vegetables = new DropList<Vegetables>(By.cssSelector(".form-group .salad .caret"),By.cssSelector(".salad .dropdown-toggle"),By.cssSelector(".salad li .checkbox label"))

    {
        @Override
        protected String getTextAction() {
            return new Text(By.cssSelector(".salad .dropdown-toggle")).getText();
        }

    };

    @Override
    public void submit(Plate plate) {

        summary.odds.select(plate.odD);
        summary.even.select(plate.eveN);


        elements.nature.uncheckAll();
        elements.nature.select(plate.elementS);

        colors.expand();
        colors.select(plate.colorS);
        metals.expand();
        metals.select(plate.metalS);

        //"Salad" is a value by default  I will clear the value in very ugly but a simple way. KISS.
        vegetables.select("Salad");
        //And set the new values for vegetables
        vegetables.select(plate.vegetableS);

        submit.click();
    }



}



