package org.mytests;

import com.epam.jdi.uitests.core.interfaces.MapInterfaceToElement;
import com.epam.jdi.uitests.core.interfaces.complex.IPagination;
import com.epam.jdi.uitests.core.settings.JDISettings;
import com.epam.jdi.uitests.web.selenium.elements.composite.Pagination;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.mytests.components.EpamPagination;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils.killAllRunWebDrivers;
import static org.mytests.EpamTestSite.homePage;


public class InitTests extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws Exception {
        WebSite.init(EpamTestSite.class);

        //JDISettings.driverFactory.driversPath = "C:\\Selenium";

        JDISettings.initFromProperties();
        Verify.getFails();
        logger.info("Run Tests");
    }




  @AfterSuite(alwaysRun = true)
  public void tearDown()
  {
      killAllRunWebDrivers();
      Verify.getFails();
      logger.info("End Tests");
  }


}
