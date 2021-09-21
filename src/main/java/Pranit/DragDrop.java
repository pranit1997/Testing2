package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement drag = driver.findElement(By.id("box1"));
        WebElement drop = driver.findElement(By.id("box101"));
        Actions actions = new Actions(driver);
       // actions.clickAndHold(drag).moveToElement(drop).release().build().perform();
        actions.dragAndDrop(drag,drop).build().perform();
        Thread.sleep(5000);
        driver.close();

    }
}
