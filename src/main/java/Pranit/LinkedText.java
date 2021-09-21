package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/link.html");
       System.out.println(driver.findElement(By.linkText("click here")).isDisplayed());
        driver.findElement(By.linkText("click here")).click();
        driver.navigate().back();
    }
}
