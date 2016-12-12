package org.mytests;


import org.mytests.entities.User;
import org.mytests.testdata.LoginData;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.mytests.EpamTestSite.*;
import static org.testng.Assert.assertTrue;



public class LoginTest extends InitTests {


    @Test( dataProviderClass=LoginData.class, dataProvider="dataforloginform")
    public void tryLogin(boolean testType, User user) {


        homePage.isOpened();
        homePage.checkOpened();

        //Set Login Form In Proper State
        homePage.setLoginFormInProperState();

        //Attempt to Login
        homePage.userLoginForm.login(user);


        //Did the user log in ?
        //Is login succeed? It has to be...  Is login failed? It has to be...
        assertTrue (testType ? homePage.isLoginSucceed(): homePage.isLoginFailed());


    }

}
