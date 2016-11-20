package org.mytests.components;

import org.mytests.entities.User;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
        import com.epam.jdi.uitests.core.interfaces.common.IButton;
        import com.epam.jdi.uitests.core.interfaces.common.ITextField;
        import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
        import org.openqa.selenium.support.FindBy;

public class UserLoginForm extends Form<User> {

    @FindBy(xpath="//input[@id='Login']")
    private ITextField login;
    @FindBy(xpath="//input[@id='Password']")
    private ITextField password;
    @FindBy(xpath="//button[@class='uui-button dark-blue btn-login'][@type='submit']/span[text()='Enter']")
    private IButton loginButton;


    @Override
    public void login(User user) {
        login.clear();
        password.clear();
        super.login(user);
    }
}