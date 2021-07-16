package org.pojo;

import java.util.List;

import org.base.BaseClassNew;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class PojoPage extends BaseClassNew {
	public  PojoPage() {
		
		PageFactory.initElements(driver,this);
		
	}
//for using multiple locators
	@FindBys({
		
	@FindBy(id="email"),
	@FindBy(xpath="(//input[contains(@class,'inputtext')])[1]")
	})
	
	private List <WebElement> txtUserName;
	
	@FindAll({
		@FindBy(id ="pass"),
		@FindBy(id="345567")
		
		})
private List <WebElement> txtPassword;

	@FindBy(name = "login")
	
	private List<WebElement> btnLogin;

@FindBy(xpath = "//input[contains(@class,'inputtext')]")

private List <WebElement> lstTxtValues;

public List <WebElement> getLstTxtValues() {
	
	return lstTxtValues;
}

public List  <WebElement> getBtnLogin(){
	
	return btnLogin;
}

public List  <WebElement> getTxtUserName(){
	
	return txtUserName;
}

public List  <WebElement> getTxtPassword(){
	
	return txtPassword;
}

}


