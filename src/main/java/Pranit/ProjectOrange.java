package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class ProjectOrange {
    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//b[contains(text(),'Buzz')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='images-tab-label']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='image-upload-button']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C://Users/Academy/Desktop/AutoIt.exe");
        Thread.sleep(5000);
       WebElement button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[6]/div[2]/div[1]/div[1]/p[1]/input[1]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", button);
      /*  Actions action = new Actions(driver);
    driver.findElement(By.id("menu_admin_viewAdminModule")).click();
   WebElement usermanagement = driver.findElement(By.id("menu_admin_UserManagement"));
   action.moveToElement(usermanagement).click().build().perform();
   WebElement users =  driver.findElement(By.id("menu_admin_viewSystemUsers"));
    action.moveToElement(users).click().build().perform();
  int rowcount = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/thead[1]/tr")).getSize().getHeight();
  int count = driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/thead[1]/tr[1]/th[1]")).getSize().getHeight();
int statuscount = 0;
for (int i =1;i<=rowcount;i++){
    for (int j =1;j<=5;j++ ){
String status = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+ i +"]/td[5]")).getText();
//System.out.println(driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+ i +"]/td[5]")).getText());}
    //System.out.println(driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+ i +"]/td[1]")).getText());}
  if (status.equals("Disabled")){
      statuscount = statuscount + 1;
  }
}
System.out.println("No of Employee Disabled :" + statuscount);*/
//driver.close();
}}
//*[@id="resultTable"]/tbody/tr[1]/td[1]