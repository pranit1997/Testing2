package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]")).click();//Select check box
        System.out.println(driver.findElement(By.xpath("//*[@id=\"txtAge\"]")).getText());// Print message
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"check1\"]")).click();
        Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id=\"check1\"]")).click();
      Thread.sleep(5000);
    }
}
