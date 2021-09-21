package BatchTesting;

import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void loginbyemail() {
        System.out.println("this is login by mail");
    }

    @Test
    public void loginbyfacebook() {
        System.out.println("this is login by facebook");
    }

    @Test
    public void loginbytwitter() {
        System.out.println("this is login by twitter");
    }


}
