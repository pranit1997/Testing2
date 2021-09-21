package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIFrame {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Frames.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
WebElement outer = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
driver.switchTo().frame(outer);
WebElement inner = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
driver.switchTo().frame(inner);
driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("HELLO");
Thread.sleep(5000);
driver.close();
    }
}
