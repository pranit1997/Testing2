package Pranit;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.compress.utils.FileNameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import javax.xml.transform.Source;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateExtentReport {
    public WebDriver driver;
    public ExtentSparkReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeTest
    public void setExtent() {
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/myReport.html");
        htmlReporter.config().setDocumentTitle("Automation Report");//Title of the report
        htmlReporter.config().setReportName("Functional Report");//Name of the report
        htmlReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Hostname", "Local");
        extent.setSystemInfo("OS", "Windows10");
        extent.setSystemInfo("Tester", "Pranit");
        extent.setSystemInfo("Browser", "Chrome");
    }

    @AfterTest
    public void endreport() {
        extent.flush();
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test
    public void noCommerceTitleTest() {
        test = extent.createTest("noCommerceTitleTest");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(false);
    }

    @Test
    public void noCommerceLogoTest() {
        test = extent.createTest("noCommerceLogoTest");
        Boolean status = driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")).isDisplayed();
        Assert.assertTrue(status);
    }

    @AfterMethod
    public void teardown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent report
String screenshotpath = GenerateExtentReport.getScreenshot(driver, result.getName());
test.addScreenCaptureFromBase64String(screenshotpath);// adding screenshot
        }
    else if (result.getStatus() == ITestResult.SKIP){
        test.log(Status.SKIP, "Test case SKIPPED IS " + result.getName());
        }
    else if (result.getStatus() == ITestResult.SUCCESS){
        test.log(Status.PASS, "Test case PASSED IS " + result.getName());
    }
    driver.quit();
    }
public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
        String dateName = new SimpleDateFormat("yyMMddhhmmmss").format(new Date());
    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    //after execution, you could see a folder "FailedTestScreenshot" under src folder
    String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
return destination;


    }



}
