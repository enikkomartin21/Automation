package seleniumframework1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis	= new FileInputStream("C:\\Users\\martinj4\\eclipse-workspace\\seleniumframework\\src\\utilities\\testdata.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		ChromeDriver driver	= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id=\"usernameField\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=\"passwordField\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class=\"waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform\"]")).click();
		
		
	
	}

}


