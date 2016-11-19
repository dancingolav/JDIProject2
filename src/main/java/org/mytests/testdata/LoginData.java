package org.mytests.testdata;

import org.apache.commons.lang3.StringUtils;
import org.mytests.entities.User;
import org.testng.annotations.DataProvider;

/**
 * Created by AlexSh on 17.10.2016.
 */



public class LoginData {
      @DataProvider(name="dataforlogin")
       public static Object [][] createDataForLogin() {
           return new Object[][] {
                   { true, new User("epam", "1234")},
                   { false,  new User("epam", "")},
                   { false, new User ("", "")},
                   { false, new User ("", "1234")},
                   { false, new User (StringUtils.repeat("qwerty0987", 10), StringUtils.repeat("QWERTY1234",10))},
                   { false, new User("epam", "12345")},
                   { true, new User ("epam", "1234")},
                   { false, new User ("sldkfjsdlkfjds", "ds;fksd;kfsd;lkf")},
                   { true, new User ("epam", "1234")},
                   { true, new User("epam", "1234")}

           };


       }
}
