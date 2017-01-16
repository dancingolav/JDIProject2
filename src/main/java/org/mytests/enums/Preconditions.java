package org.mytests.enums;


import com.epam.commons.linqinterfaces.JAction;
import com.epam.jdi.uitests.web.selenium.preconditions.WebPreconditions;
import java.util.function.Supplier;
import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.alwaysMoveToCondition;
import static org.mytests.EpamTestSite.homePage;

public enum Preconditions implements WebPreconditions {

    //I am not using this API for now since I need more time and expertise and documentation to study it

    SET_LOGIN_FORM_IN_PROPER_STATE(()->true,()->homePage.setLoginFormInProperState())


//    HOME_PAGE("index.htm"),
//    CONTACT_FORM_PAGE("page1.htm"),
//    METALS_AND_COLORS_PAGE("page2.htm"),
//
//    DATES_PAGE("page4.htm"),
//    SUPPORT_PAGE("page3.htm", true),
//    SORTING_TABLE_PAGE("page7.htm"),
//    DYNAMIC_TABLE_PAGE("page5.htm"),
//    SIMPLE_TABLE_PAGE("page6.htm")

            ;



    public Supplier<Boolean> checkAction;
    public JAction moveToAction;




    Preconditions(Supplier<Boolean> checkAction, JAction moveToAction) {
        this.checkAction = checkAction;
        this.moveToAction = moveToAction;
        alwaysMoveToCondition = true;
    }

    Preconditions(String uri) {
        this(() -> WebPreconditions.checkUrl(uri), () -> WebPreconditions.openUri(uri));
    }

    Preconditions(String uri, boolean isStatic) {
        this(uri);
        alwaysMoveToCondition = !isStatic;
    }

    public Boolean checkAction() {
        return checkAction.get();
    }

    public void moveToAction() {
        moveToAction.invoke();
    }
    }