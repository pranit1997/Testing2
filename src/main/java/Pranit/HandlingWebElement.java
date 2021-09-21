package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebElement {
    public static void main(String[] args) throws InterruptedException {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
            WebElement drpday = driver.findElement(By.id("select-demo"));// create object of webelement
            Select daydrp = new Select(drpday); //Select class used for drop down
        daydrp.selectByIndex(6);// select option by index
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.className("selected-value")).getText());
        //daydrp.selectByVisibleText("Friday");//select option by their name
        System.out.println(daydrp.getOptions().size());// to count number of option in dropdown
        driver.close();
    }
}
