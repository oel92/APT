

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest  {
	
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        FirefoxDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);

        
 //      testUserCase(driver);
//        testPasswordCase(driver);
//        testPasswordSpace(driver);
//        testLogin1(driver);
//        testLogin2(driver);
//        testLogin3(driver);
  //      	failLogin(driver);
//        precision(driver);
//        scientificNotation(driver);
 //       testInvalid1(driver);
        testInvalid2(driver);
    }
    public static void testInvalid1(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user1 = driver.findElement(By.name("userId"));
    	WebElement pw1 = driver.findElement(By.name("userPassword"));
    	user1.clear();
    	user1.sendKeys("andy");
    	pw1.clear();
    	pw1.sendKeys("apple");
        pw1.submit();
        
        WebElement temp = driver.findElement(By.name("farenheitTemperature"));
        temp.clear();
        temp.sendKeys("abg2");
        temp.submit();
        
        
    }
    public static void testInvalid2(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user1 = driver.findElement(By.name("userId"));
    	WebElement pw1 = driver.findElement(By.name("userPassword"));
    	user1.clear();
    	user1.sendKeys("andy");
    	pw1.clear();
    	pw1.sendKeys("apple");
        pw1.submit();
        
        WebElement temp = driver.findElement(By.name("farenheitTemperature"));
        temp.clear();
        temp.sendKeys(".1-");
        temp.submit();
        
        
    }
    public static void scientificNotation(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user1 = driver.findElement(By.name("userId"));
    	WebElement pw1 = driver.findElement(By.name("userPassword"));
    	user1.clear();
    	user1.sendKeys("andy");
    	pw1.clear();
    	pw1.sendKeys("apple");
        pw1.submit();
        
        WebElement temp = driver.findElement(By.name("farenheitTemperature"));
        temp.clear();
        temp.sendKeys("9.73E2");
        temp.submit();
    }
    public static void precision(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user1 = driver.findElement(By.name("userId"));
    	WebElement pw1 = driver.findElement(By.name("userPassword"));
    	user1.clear();
    	user1.sendKeys("andy");
    	pw1.clear();
    	pw1.sendKeys("apple");
        pw1.submit();
        
        WebElement temp = driver.findElement(By.name("farenheitTemperature"));
        temp.clear();
        temp.sendKeys("0");
        temp.submit();
        
        WebElement next = driver.findElement(By.name("city"));
        next.submit();
        WebElement again = driver.findElement(By.linkText("Link"));
        again.click();
        
        WebElement temp1 = driver.findElement(By.name("farenheitTemperature"));
        temp1.clear();
        temp1.sendKeys("212");
        temp1.submit();
        
        WebElement next1 = driver.findElement(By.name("city"));
        next1.submit();
        WebElement again1 = driver.findElement(By.linkText("Link"));
        again1.click();
        
        WebElement temp2 = driver.findElement(By.name("farenheitTemperature"));
        temp2.clear();
        temp2.sendKeys("150");
        temp2.submit();
        
        WebElement next2 = driver.findElement(By.name("city"));
        next2.submit();
        WebElement again2 = driver.findElement(By.linkText("Link"));
        again2.click();
        
        WebElement temp3 = driver.findElement(By.name("farenheitTemperature"));
        temp3.clear();
        temp3.sendKeys("400");
        temp3.submit();
    }
    public static void failLogin(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user1 = driver.findElement(By.name("userId"));
    	WebElement pw1 = driver.findElement(By.name("userPassword"));
    	user1.clear();
    	user1.sendKeys("andy");
    	pw1.clear();
    	pw1.sendKeys("a");
        pw1.submit();
        
        WebElement again = driver.findElement(By.linkText("link"));
        again.click();
        
        WebElement user2 = driver.findElement(By.name("userId"));
    	WebElement pw2 = driver.findElement(By.name("userPassword"));
    	user2.clear();
    	user2.sendKeys("andy");
    	pw2.clear();
    	pw2.sendKeys("baaa");
        pw2.submit();
        
 WebElement again1 = driver.findElement(By.linkText("link"));
        again1.click();
        
        WebElement user3 = driver.findElement(By.name("userId"));
    	WebElement pw3 = driver.findElement(By.name("userPassword"));
    	user3.clear();
    	user3.sendKeys("andy");
    	pw3.clear();
    	pw3.sendKeys("baaab");
        pw3.submit();
        
        
        
    	
    }
    public static void testUserCase(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user1 = driver.findElement(By.name("userId"));
    	WebElement pw1 = driver.findElement(By.name("userPassword"));
    	user1.clear();
    	user1.sendKeys("  aNdY  ");
    	pw1.clear();
    	pw1.sendKeys("apple");
        pw1.submit();
    	
    }
    public static void testPasswordCase(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user1 = driver.findElement(By.name("userId"));
    	WebElement pw1 = driver.findElement(By.name("userPassword"));
    	user1.clear();
    	user1.sendKeys("andy");
    	pw1.clear();
    	pw1.sendKeys("Apple");
        pw1.submit();
    	
    }
    public static void testPasswordSpace(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user1 = driver.findElement(By.name("userId"));
    	WebElement pw1 = driver.findElement(By.name("userPassword"));
    	user1.clear();
    	user1.sendKeys("andy");
    	pw1.clear();
    	pw1.sendKeys("  apple  ");
        pw1.submit();
    	
    }
    public static void testLogin1(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user1 = driver.findElement(By.name("userId"));
    	WebElement pw1 = driver.findElement(By.name("userPassword"));
    	user1.clear();
    	user1.sendKeys("andy");
    	
    	pw1.clear();
    	pw1.sendKeys("apple");
        pw1.submit();
        
       
        
        
        
    }
    public static void testLogin2(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
      WebElement user2 = driver.findElement(By.name("userId"));
      WebElement pw2 = driver.findElement(By.name("userPassword"));
      user2.clear();
  	user2.sendKeys("bob");
  	pw2.clear();
	pw2.sendKeys("bathtub");
    pw2.submit();
    
    	
    
    }
    public static void testLogin3(FirefoxDriver driver){
    	driver.get("http://apt-public.appspot.com/testing-lab-login.html");
    	WebElement user3 = driver.findElement(By.name("userId"));
        WebElement pw3 = driver.findElement(By.name("userPassword"));
    	user3.clear();
    	user3.sendKeys("charley");
    	
    	pw3.clear();
    	pw3.sendKeys("china");
        pw3.submit();
    }
    
    
}