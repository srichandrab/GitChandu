package com.icicibank.loans.carloans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ClassValidations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver driver12=new ChromeDriver();
		driver12.navigate().to ("http:/www.amazon.in");
		//driver12.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("rock");
		driver12.findElement(By.xpath("//*[@id='nav-xshop\']/a[5]")).click();
		driver12.manage().window().maximize();
		
		//String Actval = driver12.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).getText();
		String Actval = driver12.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).getAttribute("innerHTML");
		System.out.println("Actual value is " + Actval);
		String Expval = "Customer Service";
	System.out.println("Expected Value is " + Expval);	
	
		if(Actval.contains(Expval))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
		}
	}
	


