package UI;

import org.testng.annotations.Test;

import java.sql.Driver;

public class AunthenticatePopup extends AutomationController
{
    @Test
    public void handlepopup()
    {
       // syntax ==> http://username:password@pest url

        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
