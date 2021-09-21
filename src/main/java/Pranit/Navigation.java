package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("India");
        driver.findElement(By.xpath("//i[contains(text(),'Search')]")).click();
        Thread.sleep(5000);
        driver.navigate().to("https://ycce.adcclms.com/admin");
        //System.out.println(driver.getTitle());

        driver.navigate().forward();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);

        driver.close();
    }
}
