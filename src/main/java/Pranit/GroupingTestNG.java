package Pranit;

import org.testng.annotations.Test;

public class GroupingTestNG {
    @Test(groups = "Sanity")
    void t1()
    {System.out.println("This is test1");}

    @Test(groups = "Sanity")
    void t2()
    {System.out.println("This is test2");}

    @Test(groups = "Regression")
    void t3()
    {System.out.println("This is test3");}

    @Test(groups = "Regression")
    void t4()
    {System.out.println("This is test4");}

    @Test(groups = {"Sanity","Regression"})
    void t5()
    {System.out.println("This is test5");}

    @Test
    void t6()
    {System.out.println("This is test6");}

}
