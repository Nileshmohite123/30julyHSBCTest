package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Nilesh");
        driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Mohite");
        driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("AP-JINTI,TAL-PHALTAN");
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("mohitenilesh7522@gmail.com");
        driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("7522945996");
        driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
        driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
        driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
        List<WebElement>lang=driver.findElements(By.xpath("//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all\"]//li"));
        System.out.println("Total count"+lang.size());
        
        for(int i=0;i<lang.size();i++) {
			lang.get(i).getText();
			System.out.println(lang.get(i).getText());
			
			//select specific values
			if(lang.get(i).getText().equals("English")) {
				lang.get(i).click();
				break;
			}
		}
        
      WebElement skills=  driver.findElement(By.id("Skills"));
        
       Select select1=new Select(skills);
    List<WebElement> Listskills= select1.getOptions();
    System.out.println("Total skills"+Listskills.size());
    for(int i=0;i<Listskills.size();i++) {
		Listskills.get(i).getText();
		System.out.println(Listskills.get(i).getText());
		
		//select specific values
		if(Listskills.get(i).getText().equals("APIs")) {
			Listskills.get(i).click();
			break;
		}
	}
  
    WebElement Day=driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
	WebElement Month=driver.findElement(By.xpath("(//select[@type=\"text\"])[4]"));
	WebElement Year=driver.findElement(By.xpath("(//select[@type=\"text\"])[3]"));

	Select select2=new Select(Day);
	List<WebElement>Listday=select2.getOptions();
	System.out.println("Total Day:"+Listday.size());

	//How will u print all values
	for(int i=0;i<Listday.size();i++) {
		String Dayvalues=Listday.get(i).getText();
		System.out.println(Dayvalues);
		
		//how will you select specific values from dropdown
		
		if(Dayvalues.equals("8")) {
			Listday.get(i).click();
		}
	}
	// select month
			Select select3=new Select(Month);
			List<WebElement>Monthvalue=select3.getOptions();
			System.out.println("Total Months:"+Monthvalue.size());
			
			// print values in month
			for(int i=0;i<Monthvalue.size();i++) {
			String Months=	Monthvalue.get(i).getText();
				System.out.println(Months);
				//how will u select specific value in month
				if(Months.equals("June")) {
					Monthvalue.get(i).click();
						
					
				}
			}
			
			//select year
			Select select4=new Select(Year);
			List<WebElement>Yearvalue=select4.getOptions();
			System.out.println("Total Years"+Yearvalue.size());
			
			//print values in years
			for(int i=0;i<Yearvalue.size();i++) {
	          String Years =Yearvalue.get(i).getText();
	          System.out.println(Years);
	          
	          // select specific value in Year
	          if(Years.equals("1923")) {
	        	  Yearvalue.get(i).click();
	          }
			}
}
}