package com.icicibank.loans.carloans;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ABCDriver 
{
	private static By by;

	public static <webelement> void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver driver111=new ChromeDriver();
		//driver.get("http:/www.amazon.in");
		driver111.navigate().to ("http:/www.amazon.in");
		driver111.manage().window().maximize();
		int counter=0;
		List<WebElement> var = driver111.findElements(By.tagName("a"));
		System.out.println("Link  Count is" +var.size());
        for(int i=0; i<var.size();i++)
		{
		 if(!var.get(i).getText().isEmpty())
		  {
		    counter++;
			String lnks = var.get(i).getText();
			System.out.println(lnks);
			}
		}
		System.out.println("FInal links count is :" +counter);
		
		
		/*
		WebElement txt = driver111.findElement(by.id("twotabsearchtextbox"));
		txt.sendKeys("chandu");
		
		Thread.sleep(4000);
		
		driver111.findElement(by.name("field-keywords")).clear();
		driver111.findElementByXPath("//*[@id=\"twotabsearchtextbox\"]").sendKeys("OakTech");
				
		Thread.sleep(4000);
		//driver111.findElement(by.linkText("Customer Service")).click();
		driver111.findElement(By.partialLinkText("Customer")).click();
		
		*/
		/*
		 *do 
		 
		{
		((RemoteWebDriver)driver111).executeScript("window.scrollBy(0,100)");
		driver111.findElement(by.partialLinkText("Careers")).click();
		}while(false);
		
		*/
		 
		//Thread.sleep(4000);
		
		//((RemoteWebDriver)driver111).executeScript("window.scrollBy(0,0)");
		
	
		/*driver111.manage().window().maximize();
		driver111.manage().deleteAllCookies();
		String driver111.GetTitle;
		System.out.println("title");
		String url = driver111.getCurrentUrl();
		System.out.println(url);
		driver111.navigate().back();
		Thread.sleep(4000);
		driver111.navigate().forward();
		Thread.sleep(4000);
		driver111.navigate().refresh();
		driver111.close();*/
	    //driver.quit();
		
		
		//System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\Drivers\\firefox.exe");
		//FirefoxDriver driver1=new FirefoxDriver();
		//could not run on FirefoxDriver 
        //driver1.get("http:/www.amazon.in");
		
		
	}
}
