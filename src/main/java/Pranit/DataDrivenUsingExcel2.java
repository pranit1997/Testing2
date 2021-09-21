package Pranit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenUsingExcel2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        // Getting data from EXCEL Sheet
        FileInputStream file = new FileInputStream("C://Users/Academy/Desktop/Datadriven test.xlsx");
        // Get the workbook instance for XLS File
        XSSFWorkbook workbook = new XSSFWorkbook(file);
       // Get first sheet from the workbook
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        // Get first row from the sheet
        int row = sheet.getLastRowNum();
        for (int i = 1;i<=row;i++)
        {
            XSSFRow currentrow = sheet.getRow(i);
            String First_Name = currentrow.getCell(0).getStringCellValue();
            String Last_Name = currentrow.getCell(1).getStringCellValue();
            String Address = currentrow.getCell(2).getStringCellValue();
            String Email_adress = currentrow.getCell(3).getStringCellValue();
            int Phone = (int) currentrow.getCell(4).getNumericCellValue();
            String Gender = currentrow.getCell(5).getStringCellValue();
            String Hobbies = currentrow.getCell(6).getStringCellValue();
            String Language = currentrow.getCell(7).getStringCellValue();
            String Country = currentrow.getCell(8).getStringCellValue();
           int YOB = (int) currentrow.getCell(9).getNumericCellValue();
            int MOB = (int) currentrow.getCell(10).getNumericCellValue();
            int DOB = (int) currentrow.getCell(11).getNumericCellValue();
            String password = currentrow.getCell(12).getStringCellValue();
            String Confirm_password = currentrow.getCell(13).getStringCellValue();
            // Registration Process
            driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys(First_Name);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys(Last_Name);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys(Address);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys(Email_adress);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys(String.valueOf(Phone));
            Thread.sleep(5000);
            driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)", "");
            driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/multi-select[1]/div[1]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
            Thread.sleep(5000);
            Select dropcountry = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
            dropcountry.selectByVisibleText(Country);
            Thread.sleep(5000);
            /*Select year = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
            year.selectByVisibleText(String.valueOf(YOB));
            Thread.sleep(5000);
            Select month = new Select(driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")));
            year.selectByIndex(Integer.parseInt(String.valueOf(MOB)));
            Thread.sleep(5000);
            Select date = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
            year.selectByVisibleText(String.valueOf(DOB));*/
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(password);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(Confirm_password);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
            driver.findElement(By.xpath("//button[@id='Button1']")).click();
        }
    }
}
