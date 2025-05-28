package UI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileHandling extends AutomationController
{
    @Test
    public  void ExcelHandling() throws IOException
    {
        FileInputStream inputFile=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Workspace\\UserData.xlsx");


        XSSFWorkbook workbook=new XSSFWorkbook(inputFile);
        XSSFSheet sheet=workbook.getSheet("Sheet1");

        FileOutputStream outputFile=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Workspace\\UserData.xlsx");


        String userName=sheet.getRow(1).getCell(0).getStringCellValue();
        String password=sheet.getRow(1).getCell(1).getStringCellValue();
        // write code to login
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).clear();
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).clear();
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
        try {
            if(driver.findElement(By.xpath("//div[@class=\"app_logo\"]")).getText().equals("Swag Labs"));
            {
                sheet.getRow(1).createCell(2).setCellValue("Valid");
            }
        }
        catch (Exception e)
        {
            sheet.getRow(1).createCell(2).setCellValue("InValid");
        }
        workbook.write(outputFile);
        workbook.close();
    }

    @Test
    public  void ExcelHandlingLoop() throws IOException {
        FileInputStream inputFile=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Workspace\\UserData.xlsx");


        XSSFWorkbook workbook=new XSSFWorkbook(inputFile);
        XSSFSheet sheet=workbook.getSheet("Sheet1");

        FileOutputStream outputFile=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Workspace\\UserData.xlsx");

        for(int i=1; i< sheet.getPhysicalNumberOfRows();i++)
        {
            String userName=sheet.getRow(i).getCell(0).getStringCellValue();
            String password=sheet.getRow(i).getCell(1).getStringCellValue();
            // write code to login
            driver.findElement(By.xpath("//input[@id=\"user-name\"]")).clear();
            driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(userName);
            driver.findElement(By.xpath("//input[@id=\"password\"]")).clear();
            driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
            driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
            try {
                if(driver.findElement(By.xpath("//div[@class=\"app_logo\"]")).getText().equals("Swag Labs"));
                {
                    sheet.getRow(i).createCell(2).setCellValue("Valid");
                    driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
                    driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();

                    WebElement loginPage = driver.findElement(By.xpath("//div[@class='login_wrapper-inner']"));

                    Assert.assertTrue( loginPage.isDisplayed(),"Login page is display");
                }
            }
            catch (Exception e)
            {
                sheet.getRow(i).createCell(2).setCellValue("InValid");
            }
        }


        workbook.write(outputFile);
        workbook.close();
    }

    @Test
    public  void TableInExcel() throws IOException {
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        FileInputStream inputFile=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Workspace\\UserData.xlsx");


        XSSFWorkbook workbook=new XSSFWorkbook(inputFile);
        XSSFSheet sheet=workbook.getSheet("Country");

        FileOutputStream outputFile=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Workspace\\UserData.xlsx");

        WebElement table=driver.findElement(By.xpath("//table[@id=\"customers\"]"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));

        // First print table head data
        List<WebElement> coloums=rows.get(0).findElements(By.tagName("th"));
        for(int j=0;j<coloums.size();j++)
        {
            sheet.getRow(0).createCell(j).setCellValue(coloums.get(j).getText());
        }

        // Now print Table data
        for(int i=1;i<rows.size();i++)
        {
            List<WebElement> coloumsData=rows.get(i).findElements(By.tagName("td"));
            for(int k=0;k<coloumsData.size();k++)
            {
                System.out.println(i);
                System.out.println(k);
                sheet.getRow(i).createCell(k).setCellValue(coloumsData.get(k).getText());
            }
        }


        workbook.write(outputFile);
        workbook.close();
    }
}
