package BatchTesting;

import org.testng.annotations.Test;

public class SignupTest {
    @Test
    public void signupbymail() {
        System.out.println("This is signup by mail");
    }

    @Test
    public void signupbyfacebook() {
        System.out.println("This is signup by facebook");
    }

    @Test
    public void signupbytwitter() {
        System.out.println("This is signup by twitter");
    }

}
