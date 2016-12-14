package org.mytests;



import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.mytests.EpamTestSite.metalsAndColorsPage;



/**
 * Created by AlexSh on 20.11.2016.
 */


public class MetalAndColorsPaginationTests extends InitTests{

    @Test
    public void paginationFirstTest(){

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.first();
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page1.htm");


    }


    @Test
    public void paginationButton2Test(){

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.selectPage(2);
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page2.htm");
    }



    @Test
    public void paginationButtonNextButton2Test() {

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.selectPage(2);
        metalsAndColorsPage.epamPagination.next();
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page3.htm");

    }


    @Test
    public void paginationButtonPreviousButton2Test() {

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.selectPage(2);
        metalsAndColorsPage.epamPagination.previous();
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page1.htm");

    }


    @Test
    public void paginationLastAfterButton4Test() {

        metalsAndColorsPage.isOpened();
        metalsAndColorsPage.epamPagination.selectPage(4);
        metalsAndColorsPage.epamPagination.last();
        metalsAndColorsPage.epamPagination.checkPageOpenned("/page8.htm");


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
        //Button "Next" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.prev);
        //Button "Last" has not to be active
        metalsAndColorsPage.epamPagination.checkNotActive(metalsAndColorsPage.epamPagination.first);

    }

}
