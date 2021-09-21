package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.switchTo().frame(0);
    WebElement slider =  driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
        Actions slide = new Actions(driver);
        slide.moveToElement(slider).dragAndDropBy(slider , 300 , 0).build().perform();
        slide.moveToElement(slider).dragAndDropBy(slider , -300 , 0).build().perform();
    }
}
