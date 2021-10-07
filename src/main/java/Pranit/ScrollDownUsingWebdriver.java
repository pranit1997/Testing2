package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUsingWebdriver {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.countries-ofthe-world.com/all-countries.html");
        driver.manage().window().maximize();

        //1. Scroll by pixel
        JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,1000)", "");

        //2. Scroll page till we find element
//WebElement country = driver.findElement(By.xpath("//li[contains(text(),'New Zealand')]"));
//js.executeScript("arguments[0].scrollIntoView();",country);
        //3. Scroll page till end
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(5000);
driver.close();
    }
}
