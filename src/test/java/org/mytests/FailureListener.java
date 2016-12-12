package org.mytests;

import com.epam.jdi.uitests.web.settings.WebSettings;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;


/**
 * Created by AlexSh on 27.10.2016.
 */
public class FailureListener extends TestListenerAdapter {


    @Override
    public void onTestFailure(ITestResult tr) {
        try {
             makeScreenshot();
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }

   @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] makeScreenshot() {
    try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
          return ((TakesScreenshot) WebSettings.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

 }
