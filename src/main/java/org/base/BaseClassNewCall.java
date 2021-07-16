package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojoPage;

public class BaseClassNewCall extends BaseClassNew {
	
	public static void main(String[] args) {
		
		getDriver();
		
		MaximizeWindow();
		
		launchUrl("https://www.facebook.com/");
		
		//***usal method definition by using baseclass
		
		//WebElement txtUser = driver.findElement(By.id("email"));/
		//insertType(txtUser,"vigneshsarva");
		
		//WebElement txtPass = driver.findElement(By.id("pass"));
		
		//insertType(txtPass,"1233456");
		
	//	WebElement btnLogin = driver.findElement(By.name("login"));
		
	//	click(btnLogin);
		
		
		//***calling by pojoclass
		
		insertType(new LoginPojoPage().getTxtUser(),"vigneshsarva");
		insertType(new LoginPojoPage().getTxtpass(),"123456");
		click(new LoginPojoPage().getBtnLogin());
		
		closeBrowser();
	}

}
