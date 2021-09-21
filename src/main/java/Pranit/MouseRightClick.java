package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().window().minimize();
        Thread.sleep(5000);
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
       WebElement button =  driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
    actions.contextClick(button).build().perform();
    driver.findElement(By.xpath("//body/ul[1]/li[3]/span[1]")).click();
   System.out.println( driver.switchTo().alert().getText());  //get text from alert box
   driver.switchTo().alert().accept(); //Close alert box
driver.close();
    }
}
