package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
       WebElement resize =  driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));
        Actions act = new Actions(driver);
        act.moveToElement(resize).dragAndDropBy(resize, 50,75).build().perform();
        Thread.sleep(5000);
        act.moveToElement(resize).dragAndDropBy(resize, -50,50).build().perform();



    }
}
