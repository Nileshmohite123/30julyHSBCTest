package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	
	
	String str=driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
	System.out.println(str);
	
	boolean b=driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
	System.out.println(b);
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
	Thread.sleep(3000);
	
	String text="I am a JS prompt";
	Alert text1=driver.switchTo().alert();
	
	String Popupmessage=driver.switchTo().alert().getText();
	System.out.println("Alert message:"+Popupmessage);
	
	if(text.equals(Popupmessage)) {
		System.out.println("Correct Text");
	}
	else {
		System.out.println("Incorrect Text");
	}
	
	text1.sendKeys("Autoation");
	text1.accept();
	
	Thread.sleep(2000);
	
	String text2=driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
     System.out.println(text2);
     
   boolean B=driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
	System.out.println(B);
	}
	
	

}

