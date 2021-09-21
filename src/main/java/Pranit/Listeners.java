package Pranit;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{

    public void onTestStart(ITestResult tr){
        System.out.println("Test Start");
    }

    public void onTestSuccess(ITestResult tr){
        System.out.println("Test Passed");
    }

    public void onTestFailure(ITestResult tr){
        System.out.println("Test failed");
    }

    public void onTestSkipped(ITestResult tr){
   System.out.println("Test Skipped");
    }
}

