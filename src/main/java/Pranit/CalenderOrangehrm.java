package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;

public class CalenderOrangehrm {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_dashboard_index")).click();
        driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"assignleave_txtEmployee_empName\"]")).sendKeys("Orange Test");
   WebElement dropdown =  driver.findElement(By.id("assignleave_txtLeaveType"));
        Select drpdown = new Select(dropdown);
        drpdown.selectByIndex(2);
        driver.findElement(By.xpath("//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[4]/img")).click();
        WebElement month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
        Select mnth = new Select(month);
        mnth.selectByIndex(9);
        WebElement year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
        Select yr = new Select(year);
        yr.selectByVisibleText("2021");
        WebElement date = driver.findElement(By.linkText("31"));
        date.click();
      //driver.findElement(By.xpath("//*[@id=\"assignleave_txtToDate\"]")).sendKeys("2021-10-29");
     /* WebElement partial = driver.findElement(By.id("assignleave_partialDays"));
      Select pr = new Select(partial);
      pr.selectByIndex(3);*/
      driver.findElement(By.id("assignleave_txtComment")).sendKeys("No Comment");
      driver.findElement(By.id("assignBtn")).click();

        Thread.sleep(5000);
        driver.close();
    }
}
