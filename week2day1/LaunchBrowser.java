package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;


public class LaunchBrowser {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.id("username")).sendKeys("demosalesManager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        WebElement firstname=driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']"));
        firstname.sendKeys("Aditya");
       // firstname.getAttribute("value");
        String fName = firstname.getAttribute("value");
        System.out.println(fName);
        
        
       
       WebElement lastname=driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']"));
        lastname.sendKeys("Arunprasad");
        String lname = lastname.getAttribute("value");
        System.out.println(lname);
        
        
       // System.out.println(lastname.getText());
        
        driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
        
       // firstname=driver.gettext();
       // System.out.println(firstname.getText()); 
       //  String name = driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).getText();
       //  System.out.println(firstname.getText());
		//System.out.println(driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']").getText());

        String headingdup= driver.getTitle();
		  System.out.println(headingdup);
        driver.close();
        
		
		}
	

}
