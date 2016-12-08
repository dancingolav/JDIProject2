package org.mytests.components;



  import com.epam.jdi.uitests.core.interfaces.common.IButton;
  import com.epam.jdi.uitests.core.interfaces.complex.ISelector;
  import org.mytests.enums.Even;
  import org.mytests.enums.Odds;
  import com.epam.jdi.uitests.web.selenium.elements.complex.Selector;
  import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
  import org.openqa.selenium.support.FindBy;


public class Summary extends Section {

    @FindBy(css = "#odds-selector p")
    public ISelector<Odds> odds;

    @FindBy(css = "#even-selector p")
    public ISelector<Even> even;

    @FindBy(id = "calculate-button")
    public IButton calculate;

}