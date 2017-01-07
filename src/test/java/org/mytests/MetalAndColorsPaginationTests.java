package org.mytests;



import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import org.mytests.pages.ContactFormPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.interfaces.complex.interfaces.CheckPageTypes.CONTAINS;
import static org.mytests.EpamTestSite.*;


/**
 * Created by AlexSh on 20.11.2016.
 */



public class MetalAndColorsPaginationTests extends InitTests{

    @Test
    public void paginationFirstTest(){

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.first();
        //metalsAndColorsPage.epamPagination.checkPageOpenned("/page1.htm");
        //Instead of "checkPageOpenned" It's better to use existing method
        //contactFormPage (page1.htm) has to be opened
        contactFormPage.checkOpened();



    }


    @Test
    public void paginationButton2Test(){

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.selectPage(2);
        //metalsAndColorsPage(page2.htm);
        metalsAndColorsPage.checkOpened();


    }



    @Test
    public void paginationButtonNextButton2Test() {

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.selectPage(2);
        metalsAndColorsPage.epamPagination.next();
        //supportPage(page3.htm) has to be opened
        supportPage.checkOpened();


    }


    @Test
    public void paginationButtonPreviousButton2Test() {

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.selectPage(2);
        metalsAndColorsPage.epamPagination.previous();
        //contactFormPage(page1.htm) has to be opened
        contactFormPage.checkOpened();


    }


    @Test
    public void paginationLastAfterButton4Test() {

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.selectPage(4);
        metalsAndColorsPage.epamPagination.last();
        //differentElementsPage (page8.htm) has to be opened
        differentElementsPage.checkOpened();


}

    @Test
    public void paginationNextAndLastButton8Test() {

        metalsAndColorsPage.isOpened();

        metalsAndColorsPage.epamPagination.selectPage(8);
        //Button "Next" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.next);
        //Button "Last" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.last);

    }

    @Test
    public void paginationPreviousAndFirstButton1Test() {

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.selectPage(1);
        //Button "Previous" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.prev);
        //Button "First" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.first);

    }

}
