package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest {
    WebDriver driver;
    @Test
    void logotest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://ycce.adcclms.com/");

        WebElement logo = driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[3]/div[2]/div[2]/div[1]/img[1]"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }
@Test
    void homepagetitle() throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://ycce.adcclms.com/");

    Assert.assertEquals(driver.getTitle(), "ADCC LMS");
    Thread.sleep(5000);
}
@AfterMethod
@Test
    void teardown()
{
    driver.quit();

}

}
