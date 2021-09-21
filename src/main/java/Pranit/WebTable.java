package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
 /* WebElement r =  driver.findElement(By.xpath("/html/body/table/tbody"));


 System.out.println(r.size());
driver.close();*/
        List col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " + col.size());
        //No.of rows
        List rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("No of rows are : " + rows.size());
        for (int i = 1; i <= rows.size(); i++) {
            for (int j = 1; j <= col.size(); j++) {
                System.out.print(driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]")).getText());}
                driver.close();
            }
        }
    }