package Pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.Google.com/");
        driver.findElement(By.id("input")).sendKeys("Selenium");
        driver.findElement(By.id("icon")).click();
Thread.sleep(500);
    }}
