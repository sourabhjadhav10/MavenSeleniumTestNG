package UI;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoHardAsser {
    String assertion = "Hardassertion";

    @Test
    public void Test()
    {
        SoftAssert sa = new SoftAssert();
        sa.assertEquals("Hardassertion", assertion);
        System.out.println("After assert equal");

        sa.assertTrue(assertion.equals("Hardassertion"));
        System.out.println("After assertion true");
        sa.assertAll();
    }

    @Test
    public void Test1()
    {
        Assert.assertEquals("Hardassertion", assertion);
        System.out.println("Ater assert equals");
        Assert.assertTrue(assertion.equals("Hardassertion"));
        System.out.println("Ater assertion true");

    }



}
