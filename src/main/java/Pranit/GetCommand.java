package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommand {
    private static Object WebElement;

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
       // System.setProperty("webdriver.gecko.driver" , "F:\\Pranit\\geckodriver.exe");
        //FirefoxDriver drivers = new FirefoxDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
   /*  WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
      WebElement password =   driver.findElement(By.xpath("//input[@id='password']"));
      if (username.isDisplayed() && username.isEnabled())
      {
          username.sendKeys("manager_pranit");
          System.out.println("User pass");
      }
      else {String a = "User fail";}
      if (password.isDisplayed() && password.isEnabled())
      {password.sendKeys("Pranit@1997");
      System.out.println("Password pass");}
      else {
          String s = "Password fail";
      }*/

System.out.println(driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")).isSelected());
      if (driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")).isSelected()== false )
      {
          driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")).click();
      }
        System.out.println(driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")).isSelected());

        driver.close();

    }
}
