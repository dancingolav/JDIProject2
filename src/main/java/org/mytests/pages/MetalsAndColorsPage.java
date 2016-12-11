package org.mytests.pages;

import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.Pagination;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import org.mytests.components.EpamPagination;
import org.mytests.components.PlateForm;
import org.mytests.entities.Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.epam.web.matcher.testng.Assert.assertTrue;
import static com.epam.web.matcher.testng.Assert.waitTimeout;
import static java.lang.System.setProperty;
import static org.mytests.EpamTestSite.metalsAndColorsPage;

/**
 * Created by AlexSh on 20.11.2016.
 */
public class MetalsAndColorsPage extends WebPage {
    @FindBy(xpath="//div[@class='main-content-hg']/form[@class='form']")
    public PlateForm plateForm;

    @FindBy(css = ".summ-res")
    public Text calculateText;

    @FindBy(css=".col-res")
    public Text colorsText;


    @FindBy(css=".met-res")
    public Text metalsText;

    @FindBy(css=".sal-res")
    public Text vegetablesText;

    @FindBy(css=".elem-res")
    public Text elementsText ;

    @FindBy(xpath="//ul[@class='uui-pagination']")
    public EpamPagination epamPagination;

    public boolean checkCalculate(Plate plate) {

    int sum = Integer.parseInt(plate.eveN) + Integer.parseInt(plate.odD);
    String trm = calculateText.getText().trim();

    //We have default values for eveN and odD so the result can not be empty
    if (trm.isEmpty()) return false;
    //We always have two "words" in the result's string. "Summary:" and $number
    int wc = trm.split("\\s+").length;

    //System.out.println(trm+" "+wc+" "+ trm.contains(String.valueOf(sum)));
    return wc==2 && trm.contains("Summary:") && trm.contains(String.valueOf(sum));
}

public boolean checkColors (Plate plate) {
    String clr = plate.colorS;
    String trm = colorsText.getText().trim();
    //We have default value for "color" so the result can not be empty
    if (trm.isEmpty()) return false;
    //We always have two words in the result's string. "Color:" and $color
    int wc = trm.split("\\s+").length;

    return wc==2 && trm.contains("Color:") && trm.contains(clr);
}

public boolean checkMetals (Plate plate) {

    String clr = plate.metalS;

    //We have default value for "metal" but the result can be empty since
    //value can be empty string
    if (clr.equals(""))
       try {

            if ((!metalsText.isDisplayed()) || metalsText.getText().equals("") ||  metalsText.getText().trim().equals("Metal:"))
                return true;
           else return false;
      }
        catch (Exception e){
            return true;
        }
        catch (Error e) {
            return true;
        }
    String trm = metalsText.getText().trim();
    //We always have two words in the result's string. "Metal:" and $metal
    int wc = trm.split("\\s+").length;

    return wc==2 && trm.contains("Metal:") && trm.contains(clr);

}

public boolean checkVegetables (Plate plate) {

    if (plate.vegetableS.length == 0) {

        try {
            if ((!vegetablesText.isDisplayed()) || vegetablesText.getText().equals("") ||vegetablesText.getText().trim().equals("Vegetables:"))
                return true;
            else return false;
       }
        catch (Exception e){
            return true;
        }
        catch (Error e) {
            return true;
        }
    }

    String trm = vegetablesText.getText();

    System.out.println(trm);

    int wc = trm.split("\\s+").length;
    String [] clr = plate.vegetableS;
    boolean chk = true;
    if (clr.length != 0)
        for (String str: clr) {
            System.out.println(str);
            chk = chk && trm.contains(str);
    }

    return chk && (wc==clr.length+1) && trm.contains("Vegetables:");
}

public boolean checkElements (Plate plate) {
    if (plate.elementS.length == 0) {
   try {
            if (elementsText.getText().isEmpty() || elementsText.getText().trim().equals("Elements:"))
                return true;
            else return false;}
        catch (Exception e) {
            return true;
        }
        catch (Error e) {
            return true;
        }
    }
    String trm =elementsText.getText().trim();
    int wc = trm.split("\\s+").length;
    String [] clr = plate.elementS;
    boolean chk = true;
    if (clr.length != 0)
        for (String str: clr) {
            chk = chk && trm.contains(str);
        }

    return chk && (wc==clr.length+1) && trm.contains("Elements:");
}


}
