package Pranit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngSecond {
    @Test(priority = 1,enabled = false)
    void setup()
    {System.out.println("This is setup test");}

    @Test (priority = 4)
    void search()
    {System.out.println("Search Customer");}


    @Test (priority = 2 )
    void add()
{System.out.println("Search Customer");}

    @Test (priority = 3)
    void teardown()
    {System.out.println("Closing browser");}
}
