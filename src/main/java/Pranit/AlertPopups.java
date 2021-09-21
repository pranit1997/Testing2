package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        driver.switchTo().alert().accept();///Close Alert box using OK button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        String exptxtok = "You pressed Ok";
        String exptxtcancel = "You Pressed Cancel";
        driver.switchTo().alert().accept();///Close Alert box using OK button
       String actualtxt= driver.findElement(By.id("demo")).getText();
        if (exptxtok.equals(actualtxt)==true)
        {System.out.println("ok is pass");}
        else {System.out.println("ok failed");}
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        driver.switchTo().alert().dismiss();///Close Alert box using Cancel button
        String actualtxtc= driver.findElement(By.id("demo")).getText();
       //System.out.println( driver.findElement(By.id("demo")).getText());
        if (exptxtcancel.equals(actualtxtc)==true){System.out.println("cancel pass");}
        else {System.out.println("cancel fail");}
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
        driver.switchTo().alert().sendKeys("Pranit Tiwari");///Enter text in a text box
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText());
        driver.close();
    }
}
