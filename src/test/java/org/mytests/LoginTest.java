package org.mytests;

import org.mytests.entities.User;
import org.mytests.testdata.LoginData;
import org.testng.annotations.Test;

import static org.mytests.EpamTestSite.*;
import static org.testng.Assert.assertTrue;


public class LoginTest extends InitTests {


    @Test(priority=1)
    public void checkHomePageOpenTest() {
        homePage.isOpened();
        homePage.checkOpened();
    }


    @Test(priority=2,  dataProviderClass=LoginData.class, dataProvider="dataforloginform")
    public void tryLogin(boolean testType, User user) {


        //Set Login Form In Proper State
        homePage.setLoginFormInProperState();

        //Attempt to Login
        homePage.userLoginForm.login(user);


        //Did the user log in ?
        //Is login succeed? It has to be...  Is login failed? It has to be...
        assertTrue (testType ? homePage.isLoginSucceed(): homePage.isLoginFailed());


    }


/*
    @Test(priority=3)
    public void oneActionTest() {
        //headerMenu.select(CAREERS);
        differentElementsPage.checkOpened();
    }*/

}
