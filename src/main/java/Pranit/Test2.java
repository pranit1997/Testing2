package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jnmc.adcclms.com/login/index.php");
        driver.findElement(By.name("username")).sendKeys("manager_pranit");
        driver.findElement(By.name("password")).sendKeys("Pranit@1997");
        driver.findElement(By.id("loginbtn")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Private files')]")).click();
       System.out.println( driver.findElement(By.cssSelector("#yui_3_17_2_1_1631101432750_331")).getTagName());




        Thread.sleep(5000);
       /* String expectedrst= "Course: Tutorials";
        String actualrst = driver.getTitle();
        if (expectedrst.equals(actualrst) )
        {System.out.println("Test pass");}
        else {System.out.println("Test fail");}
        System.out.println(driver.getTitle());
        Thread.sleep(5000);*/
        driver.close();
    }
}