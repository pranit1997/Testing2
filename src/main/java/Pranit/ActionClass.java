package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Actions actions = new Actions(driver);
      WebElement admin =  driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
       WebElement usermanage = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
        WebElement user =  driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));

       /* actions.moveToElement(admin).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(usermanage).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(user).click().build().perform();
        Thread.sleep(2000);*/
        actions.moveToElement(admin).moveToElement(usermanage).moveToElement(user).click().build().perform();
        driver.close();
    }
}
