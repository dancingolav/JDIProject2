package org.mytests.pages;


import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import com.epam.jdi.uitests.core.interfaces.base.IElement;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.components.UserLoginForm;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.FindBy;



public class HomePage extends WebPage {


    @FindBy(xpath = "//div[@class='profile-photo']")
    private IClickable openLoginOrLogoutMenu;

    //LogoutButton
    @FindBy (xpath="//button[@type='submit']/span[text()='Logout']")
    private IButton logoutButton;

    //LoginLogout Menu Open
    @FindBy (xpath="//li[@class='dropdown uui-profile-menu open']")
    private IElement menuOpen;

    //LoginLogout Menu Closed
    @FindBy(xpath=("//li[@class='dropdown uui-profile-menu']"))
    private IElement menuClosed;

    //We will use the message to check that login is failed
    @FindBy(xpath="//span[@class='login-txt'][text()='* Login Faild']")
    private IText loginFailed;

    @FindBy(xpath="//form[@class='form-horizontal']")
    public UserLoginForm userLoginForm;

    public boolean isLoginOrLogoutMenuOpen() {

       try  { return  menuOpen.isDisplayed(); }
       catch (StaleElementReferenceException se) {return false;}
       catch (NoSuchElementException ns ) {return false;}

    }

     public boolean doesLogoutButtonExist() {
        try  { return  logoutButton.isDisplayed(); }
        catch (StaleElementReferenceException se) {return false;}
        catch (NoSuchElementException ns ) {return false;}
    }

    public void  openLoginOrLogoutMenu() {
        openLoginOrLogoutMenu.click();
    }

    public void logout() {
        logoutButton.click();
    }

    public boolean isLogoutMenuOpen() {
        return isLoginOrLogoutMenuOpen() && doesLogoutButtonExist();

    }

    public boolean isLoginFailed (){
        try  { return loginFailed.isDisplayed(); }
        catch (StaleElementReferenceException se) {return false;}
        catch (NoSuchElementException ns ) {return false;}

    }

    public boolean isLoginSucceed(){
        try  { return logoutButton.isDisplayed(); }
        catch (StaleElementReferenceException se) {return false;}
        catch (NoSuchElementException ns ) {return false;}
    }


    public void setLoginFormInProperState() {

        //-------------------------------------------Set login form in proper state
        //if login or logout menu is closed we will open it
        if (!(isLoginOrLogoutMenuOpen())) {
            openLoginOrLogoutMenu();
        }

        //if we've opened logout menu (but we want login menu, look at the code above)
        // we have to log out since we were in "logged in" state
        //and we just have not input fields for our users' data to log in
        if  (isLogoutMenuOpen()) {
            logout();
         //It will automatically open a new login form after logout
        }
        //--------------------------------------------------------------------------

    }

}


