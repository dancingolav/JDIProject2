package org.mytests.components;



import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Pagination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

import static com.epam.web.matcher.testng.Assert.assertTrue;


/**
 * Created by AlexSh on 24.11.2016.
 */
public class EpamPagination extends Pagination {

        public static int count;
        public static double timeSpentSeconds;

        @FindBy(css = "[class='next']  a")
        public Button next;
        @FindBy(css = "[class='prev']  a")
        public Button prev;
        @FindBy(css = "[class='first'] a")
        public Button first;
        @FindBy(css = "[class='last']  a")
        public Button last;


        public void checkNotActive(Button btn) {
                assertTrue(!btn.isDisplayed());
        }

        public void checkPageOpened(String htmlPage) {
                assertTrue(getDriver().getCurrentUrl().contains(htmlPage));
        }

        @Override
        public void selectPage (int numb) {


                String partOfXPath = "//li/a[contains(@href,'page') and contains(text(),'";
                String tailOfXPath = "')]";
                String fullXPath = partOfXPath + numb +tailOfXPath;

                long milliStartTime = System.currentTimeMillis();
                        getDriver().findElement(By.xpath(fullXPath)).click();
                long milliEndTime = System.currentTimeMillis();

                timeSpentSeconds += (milliEndTime - milliStartTime) / 1000.0;
                count++;

        }
}


