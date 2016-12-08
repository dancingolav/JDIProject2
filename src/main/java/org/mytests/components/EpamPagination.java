package org.mytests.components;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Pagination;
import org.openqa.selenium.support.FindBy;
import static com.epam.web.matcher.testng.Assert.assertTrue;


/**
 * Created by AlexSh on 24.11.2016.
 */
public class EpamPagination extends Pagination {


        @FindBy(css = "[class='next']  a")
        public Button next;
        @FindBy(css = "[class='prev']  a")
        public Button prev;
        @FindBy(css = "[class='first'] a")
        public Button first;
        @FindBy(css = "[class='last']  a")
        public Button last;

        //Template does not work...
       /* @FindBy(xpath="//li/a[text()='%s']")
        public Button  page;*/


        @FindBy(xpath="//li/a[text()='1']")
        public Button page1;
        @FindBy(xpath="//li/a[text()='2']")
        public Button page2;
        @FindBy(xpath="//li/a[text()='3']")
        public Button page3;
        @FindBy(xpath="//li/a[text()='4']")
        public Button page4;
        @FindBy(xpath="//li/a[text()='5']")
        public Button page5;
        @FindBy(xpath="//li/a[text()='6']")
        public Button page6;
        @FindBy(xpath="//li/a[text()='7']")
        public Button page7;
        @FindBy(xpath="//li/a[text()='8']")
        public Button page8;

        public void checkNotActive(Button btn) {
             assertTrue(!btn.isDisplayed());
        }

        public void checkPageOpenned (String htmlPage){
             assertTrue(getDriver().getCurrentUrl().contains(htmlPage));
        }



}

