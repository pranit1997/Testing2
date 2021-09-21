package Pranit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
@Test (priority = 1)
    void setup()
    {System.out.println("This is setup test");}

    @Test (priority = 2)
void login()
{
    Assert.assertEquals("hii","hey");
    System.out.println("This is login test");}

@Test (priority = 3)
    void teardown()
{System.out.println("Closing browser");}





}

