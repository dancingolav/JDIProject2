package org.mytests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.pages.*;

import static com.epam.jdi.uitests.web.selenium.elements.composite.CheckPageTypes.CONTAINS;

@JSite(domain = "https://jdi-framework.github.io/tests/")
class EpamTestSite extends WebSite {

    @JPage(url = "/index.htm", title = "Index Page", urlCheckType = CONTAINS, titleCheckType= CONTAINS)
    public static HomePage homePage;

    @JPage(url = "/page2.htm", title = "Metal and Colors", urlCheckType = CONTAINS, titleCheckType= CONTAINS)
    public static MetalsAndColorsPage metalsAndColorsPage;

    @JPage(url = "/page8.hml", title = "Different Element ", urlCheckType = CONTAINS, titleCheckType= CONTAINS )
    public static DifferentElementsPage differentElementsPage;

    @JPage(url = "/page1.hml", title = "Contact Form", urlCheckType = CONTAINS, titleCheckType= CONTAINS )
    public static ContactFormPage contactFormPage;

    @JPage(url = "/page3.hml", title = "Support", urlCheckType = CONTAINS, titleCheckType= CONTAINS )
    public static SupportPage supportPage;

    @JPage(url = "/page4.hml", title = "Dates", urlCheckType = CONTAINS, titleCheckType= CONTAINS )
    public static DatesPage datesPage;

    @JPage(url = "/page6.hml", title = "Simple Table", urlCheckType = CONTAINS, titleCheckType= CONTAINS )
    public static SimpleTablePage simpleTablePage;

    @JPage(url = "/page7.hml", title = "Table with Pages ", urlCheckType = CONTAINS, titleCheckType= CONTAINS )
    public static TableWithPagesPage tableWithPagesPage;


}
