package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar;

import java.util.Collections;
import java.util.Set;

public class SwitchingWindows {
    public static void main(String[] args) throws InterruptedException {
         ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
     Set <String> s = Collections.singleton(driver.getWindowHandle());
     //{String t = driver.switchTo().window(String.valueOf(s)).getTitle();
System.out.println(driver.getTitle());
//if (t.contains("Frames & windows"))
//{driver.close();}
     }
    }
