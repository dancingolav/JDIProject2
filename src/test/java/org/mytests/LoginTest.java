package org.mytests;

import org.mytests.entities.User;
import org.mytests.pages.DifferentElementsPage;
import org.mytests.testdata.LoginData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.mytests.EpamTestSite.*;
import static org.mytests.enums.HeaderMenu.CAREERS;
import static org.testng.Assert.assertTrue;


public class LoginTest extends InitTests {


    @Test(priority=1)
    public void simpliestTest() {
        homePage.isOpened();
        homePage.checkOpened();
    }


    @Test(priority=2,  dataProviderClass=LoginData.class, dataProvider="dataforlogin")
    public void tryLogin(boolean testType, User user) {

        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }

        //Set Login Form In Proper State
        homePage.setLoginFormInProperState();

        //Attempt to Login
        homePage.userLogin.login(user);


        //Did the user log in ?
        //Is login succeed? It has to be...  Is login failed? It has to be...
        assertTrue (testType ? homePage.isLoginSucceed(): homePage.isLoginFailed());


    }



    @Test(priority=3)
    public void oneActionTest() {
        //headerMenu.select(CAREERS);
        differentElementsPage.checkOpened();
    }

}
