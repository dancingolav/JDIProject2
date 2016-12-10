package org.mytests.pages;



import com.epam.jdi.uitests.web.selenium.elements.base.Clickable;
import com.epam.jdi.uitests.web.selenium.elements.base.Element;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.components.UserLoginForm;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.FindBy;



public class HomePage extends WebPage {


    @FindBy(xpath = "//div[@class='profile-photo']")
    public  Clickable openLoginOrLogoutMenu;

    //LogoutButton
    @FindBy (xpath="//button[@type='submit']/span[text()='Logout']")
    public  Button logoutButton;

    //LoginLogout Menu Open
    @FindBy (xpath="//li[@class='dropdown uui-profile-menu open']")
    public  Element menuOpen;

    //LoginLogout Menu Closed
    @FindBy(xpath=("//li[@class='dropdown uui-profile-menu']"))
    public  Element menuClosed;

    //We will use the message to check that login is failed
    @FindBy(xpath="//span[@class='login-txt'][text()='* Login Faild']")
    public  Text loginFailed;

    @FindBy(xpath="//form[@class='form-horizontal']")
    public  UserLoginForm userLoginForm;

    public  boolean isLoginOrLogoutMenuOpen() {

       try  { return  menuOpen.isDisplayed(); }
       catch (Exception ex) {return false;}
       catch (Error er ) {return false;}

    }

     public  boolean doesLogoutButtonExist() {
        try  { return  logoutButton.isDisplayed(); }
        catch (Exception ex) {return false;}
        catch (Error er  ) {return false;}
    }

    public  void  openLoginOrLogoutMenu() {
        try {
        openLoginOrLogoutMenu.click();}
        catch (Exception ex) {}
        catch (Error er  ) {}

    }

    public void logout() {
        logoutButton.click();
    }

    public  boolean isLogoutMenuOpen() {
        return isLoginOrLogoutMenuOpen() && doesLogoutButtonExist();

    }

    public  boolean isLoginFailed (){
        try  { return loginFailed.isDisplayed(); }
        catch (Exception ex) {return false;}
        catch (Error er  ) {return false;}

    }

    public  boolean isLoginSucceed(){
        try  { return logoutButton.isDisplayed(); }
        catch (Exception ex) {return false;}
        catch (Error er ) {return false;}
    }

    public  boolean isLogged(){

        try  {
            openLoginOrLogoutMenu.click();
            return isLoginSucceed();}

        catch (Exception ex) {return false;}
        catch (Error er  ) {return false;}


    }



    public  void setLoginFormInProperState() {

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


