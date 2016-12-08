package org.mytests;


import com.epam.web.matcher.testng.Assert;
import org.testng.annotations.Test;
import static com.epam.web.matcher.testng.Assert.assertTrue;
import static org.mytests.EpamTestSite.metalsAndColorsPage;
import static org.mytests.MetalAndColorsTest.prepareEvironmentForMetalAndColorTest;


/**
 * Created by AlexSh on 20.11.2016.
 */
public class MetalAndColorsPaginationTest extends InitTests{

    @Test
    public void paginationFirstTest(){

        prepareEvironmentForMetalAndColorTest();

        metalsAndColorsPage.epamPagination.first();
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page1.htm");


    }



    @Test
    public void paginationButton2Test(){

       prepareEvironmentForMetalAndColorTest();

       metalsAndColorsPage.epamPagination.page2.click();
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page2.htm");
    }



    @Test
    public void paginationButtonNextButton2Test() {

        prepareEvironmentForMetalAndColorTest();


        metalsAndColorsPage.epamPagination.page2.click();
        metalsAndColorsPage.epamPagination.next();
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page3.htm");

    }


    @Test
    public void paginationButtonPreviousButton2Test() {

        prepareEvironmentForMetalAndColorTest();


        metalsAndColorsPage.epamPagination.page2.click();
        metalsAndColorsPage.epamPagination.previous();
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page1.htm");

    }


    @Test
    public void paginationLastAfterButton4Test() {

        prepareEvironmentForMetalAndColorTest();
        metalsAndColorsPage.epamPagination.page4.click();
        metalsAndColorsPage.epamPagination.last();
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page8.htm");


}

    @Test
    public void paginationNextAndLastButton8Test() {

        prepareEvironmentForMetalAndColorTest();
        metalsAndColorsPage.epamPagination.page8.click();
        //Button "Next" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.next);
        //Button "Last" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.last);

    }

    @Test
    public void paginationPreviousAndFirstButton1Test() {

        prepareEvironmentForMetalAndColorTest();
        metalsAndColorsPage.epamPagination.page1.click();
        //Button "Next" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.prev);
        //Button "Last" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.first);

    }



}
