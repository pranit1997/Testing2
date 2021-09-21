package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overviwe-summary.html");
        driver.manage().window().maximize();
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//span[contains(text(),'WebDriver.Window')]")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[8]")).click();

String actrslt = "Generated Documentation (Untitled)";
String expctrslt = driver.getTitle();
if (expctrslt == actrslt);
        {System.out.println("pass");}
        driver.close();

    }
}
