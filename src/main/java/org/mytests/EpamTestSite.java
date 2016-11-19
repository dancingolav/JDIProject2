package org.mytests;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.enums.HeaderMenu;
import org.mytests.pages.DifferentElementsPage;
import org.mytests.pages.HomePage;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 8/30/2015.
 */
@JSite(domain = "https://jdi-framework.github.io/tests/")
class EpamTestSite extends WebSite {

    @JPage(url = "/index.htm", title = "Index Page")
    public static HomePage homePage;

 /*   @FindBy(css = ".tile-menu>li>a")
    public static Menu<HeaderMenu> headerMenu;*/

    @JPage(url = "/page8.hml", title = "Different Element ")
    public static DifferentElementsPage differentElementsPage;
}
