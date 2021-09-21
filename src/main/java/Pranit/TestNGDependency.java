package Pranit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependency {
    @Test
    void test1()
    {System.out.println("TEst1");
    Assert.fail();}

    @Test(dependsOnMethods = "test1")
    void test2()
    {System.out.println("Test2");}
    @Test(dependsOnMethods = "test2")
    void test3()
    {System.out.println("TEst3");}

    @Test(dependsOnMethods = {"test2","test3"},alwaysRun = true)
    void test4()
    {System.out.println("Test4,");}
}
