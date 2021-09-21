package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FileUploadAutoIt {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/upload");
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(driver.getWindowHandle());*/
       driver.findElement(By.id("drag-drop-upload")).click();
        //js.executeScript("arguments[0].scrollIntoView();", element);
        Runtime.getRuntime().exec("C://Users/Academy/Desktop/AutoIt.exe");
        Thread.sleep(5000);
        driver.findElement(By.id("file-submit")).click();
        driver.close();
    }
}
