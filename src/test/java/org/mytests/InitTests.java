package org.mytests;

import com.epam.jdi.uitests.core.interfaces.MapInterfaceToElement;
import com.epam.jdi.uitests.core.interfaces.complex.IPagination;
import com.epam.jdi.uitests.core.settings.JDISettings;
import com.epam.jdi.uitests.web.selenium.driver.SeleniumDriverFactory;
import com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils;
import com.epam.jdi.uitests.web.selenium.elements.composite.Pagination;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.mytests.components.EpamPagination;
import org.mytests.entities.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.function.Supplier;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils.killAllRunWebDrivers;
import static org.mytests.EpamTestSite.homePage;


public class InitTests extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws Exception {
        WebSite.init(EpamTestSite.class);

        String str = System.getProperty("browser","chrome");
        WebSettings.useDriver(str);


        Verify.getFails();
        logger.info("Run Tests");
    }

    @BeforeClass(alwaysRun = true)
    public static void  beforeClass() {

     homePage.open();
    //Set Login Form In Proper State
        homePage.setLoginFormInProperState();

    //Attempt to Login
        homePage.userLoginForm.login(User.DEFAULT_USER);
}


 @AfterClass(alwaysRun = true)
  public void tearDown()
  {   Verify.getFails();

      WebSettings.getDriverFactory().close();
      WebDriverUtils.killAllRunWebDrivers();
      logger.info("End Tests");

  }


}
