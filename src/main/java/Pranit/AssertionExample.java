package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExample {
WebDriver driver;
    @BeforeClass
            void setup()
    {
    driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
}
@Test
void logotest()
{
    WebElement logo = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='divLogin']/div[@id='divLogo']/img[1]"));
Assert.assertFalse(logo.isDisplayed(),"Logo displayed on the page");
}
@Test
    void homepagetitle()
{String title = driver.getTitle();
Assert.assertEquals(title,"OrangeHRM","Title is not matched");
}
@AfterClass
    void teardown()
{driver.quit();}
}

