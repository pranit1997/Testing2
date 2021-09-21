package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedOrrder {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
       WebElement element =  driver.findElement(By.id("animals"));
       Select se = new Select(element);
        List originallst = new ArrayList();
List templist = new ArrayList();
        List <WebElement> options =se.getOptions();
for (WebElement e : options)
{
    originallst.add(e.getText());
    templist.add(e.getText());
}
System.out.println("Before Sorting : " + originallst);
        System.out.println("Before Sorting : " + templist);
//templist = originallst
        Collections.sort(templist);
        System.out.println("After Sorting : " + originallst);
        System.out.println("After Sorting : " + templist);
        if (templist==originallst)
        {System.out.println("pass");}
        else {System.out.println("Fail");}
 driver.close();
    }
}
