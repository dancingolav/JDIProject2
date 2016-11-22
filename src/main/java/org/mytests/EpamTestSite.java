package org.mytests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.pages.DifferentElementsPage;
import org.mytests.pages.HomePage;
import org.mytests.pages.MetalsAndColorsPage;

import static com.epam.jdi.uitests.web.selenium.elements.composite.CheckPageTypes.CONTAINS;

@JSite(domain = "https://jdi-framework.github.io/tests/")
class EpamTestSite extends WebSite {

    @JPage(url = "/index.htm", title = "Index Page", urlCheckType = CONTAINS, titleCheckType= CONTAINS)
    public static HomePage homePage;

 /*   @FindBy(css = ".tile-menu>li>a")
    public static Menu<HeaderMenu> headerMenu;*/

    @JPage(url = "/page2.htm", title = "Metal and Colors", urlCheckType = CONTAINS, titleCheckType= CONTAINS)
    public static MetalsAndColorsPage metalsAndColorsPage;

    @JPage(url = "/page8.hml", title = "Different Element ", urlCheckType = CONTAINS, titleCheckType= CONTAINS )
    public static DifferentElementsPage differentElementsPage;
}
