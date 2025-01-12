package UI;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAsertion {

  //  @Test

    public void hardAsserton()
    {

        System.out.println("assertion...");
        System.out.println("assertion...");

        Assert.assertEquals(1,1);


        System.out.println("assertion...");
        System.out.println("assertion...");
    }

    @Test

    public void sofassertion()
    {
        System.out.println("assertion...");
        System.out.println("assertion...");

        SoftAssert sa= new SoftAssert();
        sa.assertEquals(1, 2);

        System.out.println("assertion...");
        System.out.println("assertion...");

        sa.assertAll();
    }
}
