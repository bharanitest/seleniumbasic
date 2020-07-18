package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceldata {

	public static void main(String[] args)  {
		//path of excel
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		try {
		FileInputStream f=new FileInputStream("./data/exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(f);

		String s = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.get(s);
		String us = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(us);
		String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.id("pass")).sendKeys(password);
		}
		catch(Exception e)
		{
			System.out.println("handle");
		}
		
	
	try {
	Thread.sleep(3000);
	}
	catch(Exception a)
	{
		
	}
	
	driver.close();
	}

}
