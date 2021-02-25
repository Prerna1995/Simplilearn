package test;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 

 

public class CrossBrowser {
    
    WebDriver ChromeDriver;
    WebDriver FirefoxDriver;

 

    @Test
    public void lunchChrome() {
        System.setProperty("webdriver.chrome.driver", "/home/prernasinghtecn/Downloads/chromedriver");
        //System.setProperty("webdriver.gecko.driver", "/home/prernasinghtecn/Downloads/geckodriver");
        
       
        
        ChromeDriver = new ChromeDriver();
        
        ChromeDriver.get("https://www.simplilearn.com/");
        
    }
    @Test(dependsOnMethods="lunchChrome")
    public void testcase1() {
        
           WebElement lnkLogin = ChromeDriver.findElement(By.linkText("Log in"));
            
            lnkLogin.click();
        
    }
    @Test
    public void launchFirefox() {
        
        //System.setProperty("webdriver.chrome.driver", "/home/prernasinghtecn/Downloads/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/home/prernasinghtecn/Downloads/geckodriver");
        
            
        FirefoxDriver = new org.openqa.selenium.firefox.FirefoxDriver();
        
        FirefoxDriver.get("https://www.simplilearn.com/");
        
    }
    @Test(dependsOnMethods="launchFirefox")
    public void testcase2() {
        
           WebElement lnkLogin = FirefoxDriver.findElement(By.linkText("Log in"));
            
            lnkLogin.click();
        
    }
}
    
    


