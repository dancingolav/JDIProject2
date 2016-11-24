package org.mytests.components;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Pagination;
import org.openqa.selenium.support.FindBy;

/**
 * Created by AlexSh on 24.11.2016.
 */
public class EpamPagination extends Pagination{

        @FindBy(css = "[class=next]  a")
        public Button next;
        @FindBy(css = "[class=prev]  a")
        public Button prev;
        @FindBy(css = "[class=first] a")
        public Button first;
        @FindBy(css = "[class=last]  a")
        public Button last;
        @FindBy(css = ".uui-pagination li")
        public Button page;
    }

