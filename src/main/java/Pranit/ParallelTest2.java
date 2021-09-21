package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;
    @Test
    void Logintest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ycce.adcclms.com/");
        driver.findElement(By.name("email")).sendKeys("abc123");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div[3]/div[2]/div[1]/div/form[1]/input")).click();
        Assert.assertEquals(driver.getTitle(),"ADCC LMS");
        Thread.sleep(5000);
    }
    @AfterMethod
void teardown()
    {driver.quit();}
}
