package org.mytests;


import org.mytests.entities.User;
import org.mytests.enums.Preconditions;
import org.mytests.testdata.LoginData;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.mytests.EpamTestSite.*;
import static org.mytests.enums.Preconditions.SET_LOGIN_FORM_IN_PROPER_STATE;
import static org.testng.Assert.assertTrue;
import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;



public class LoginTest extends InitTests {


    @Test( dataProviderClass=LoginData.class, dataProvider="dataforloginform")
    public void tryLogin(boolean testType, User user) {


        homePage.isOpened();
        homePage.checkOpened();

        //Set Login Form In Proper State: the same is "homePage.setLoginFormInProperState()";

        isInState(SET_LOGIN_FORM_IN_PROPER_STATE);

        //Attempt to Login
        homePage.userLoginForm.login(user);


        //Did the user log in ?
        //Is login succeed? It has to be...  Is login failed? It has to be...
        assertTrue (testType ? homePage.isLoginSucceed(): homePage.isLoginFailed());


    }

}
