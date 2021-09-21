package Pranit;

import org.testng.annotations.*;

public class TestNGTC2 {

        @BeforeClass
        void beforeclass()
        {System.out.println("This will execute before class");}

        @AfterClass
        void afterclass()
        {System.out.println("This will execute after class");}

        @BeforeMethod
        void beforemethod()
        {System.out.println("This will execute before test method");}

        @AfterMethod
        void  aftermethod()
        {System.out.println("This will execute after every method");}

        @Test
        void test3()
        {System.out.println("TEst1");}

        @Test
        void test4()
        {System.out.println("Test2");}
        @BeforeSuite
        void beforesuite()
        {System.out.println("Before suite");}
        @AfterSuite
        void aftersuite()
        {System.out.println("After suite");}
    }
