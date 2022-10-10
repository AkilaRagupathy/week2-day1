package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
       driver.findElement(By.id("username")).sendKeys("demosalesManager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
        companyname.sendKeys("TestLeaf");
        
        WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
        firstname.sendKeys("Akila");
        
        WebElement surname=driver.findElement(By.id("createLeadForm_lastName"));
        surname.sendKeys("Ragupathy");
        
        WebElement department=driver.findElement(By.id("createLeadForm_departmentName"));
        department.sendKeys("Software Testing");
        
        WebElement description=driver.findElement(By.id("createLeadForm_description"));
        description.sendKeys("Automation tester");
        
        WebElement email=driver.findElement(By.id("createLeadForm_primaryEmail"));
        email.sendKeys("akilarunprasad@gmail.com");

        driver.findElement(By.className("smallSubmit")).click();
        
        String heading = driver.getTitle();
		System.out.println(heading);
        

   
	}

}
