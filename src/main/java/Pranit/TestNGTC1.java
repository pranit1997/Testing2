package Pranit;

import org.testng.annotations.*;

public class TestNGTC1 {
    @BeforeTest
    void beforetest()
    {System.out.println("before test");}
    @AfterTest
    void aftertest()
    {System.out.println("after test");}
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
    void test1()
    {System.out.println("TEst1");}

    @Test
    void test2()
    {System.out.println("Test2");}
}
