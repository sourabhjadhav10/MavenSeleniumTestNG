package UI;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoHardAsser {
    String assertion = "Hardassertion";

    @Test
    public void Test()
    {
        //Soft Assertions
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
        //Hard assertions
        Assert.assertEquals("Hardassertion", assertion);
        System.out.println("Ater assert equals");
        Assert.assertEquals(assertion, "Hardassertion");
        System.out.println("Ater assertion true");

    }



}
