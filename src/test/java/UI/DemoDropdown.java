package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoDropdown extends AutomationController
{
    @Test
    public void dropdown()
    {
        driver.get("https://formstone.it/components/dropdown/demo/");
        Select s = new Select(driver.findElement(By.xpath("//select[@id=\"demo_basic\"]")));
       // s.selectByVisibleText("Two");
        s.selectByIndex(0);
       // s.deselectByVisibleText("One");

    }
}
