package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionReal {
    @Test
    public void login()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ycce.adcclms.com/");
        WebElement usernametxt = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div[3]/div[2]/div[1]/div/form[1]/div[1]/input"));
        WebElement passwordtxt = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div[3]/div[2]/div[1]/div/form[1]/div[2]/input"));
        Assert.assertTrue(usernametxt.isDisplayed());
usernametxt.sendKeys("pranitt");
Assert.assertTrue(passwordtxt.isDisplayed());
passwordtxt.sendKeys("password");
driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div[3]/div[2]/div[1]/div/form[1]/input")).click();
String Exptitle = "ADCC LMS";
Assert.assertEquals(Exptitle,driver.getTitle());




    }
}
