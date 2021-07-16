package org.pojo;

import org.base.BaseClassNew;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoPage extends  BaseClassNew {
	
	public  LoginPojoPage() {
	
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(id="email")
	
	private WebElement txtUser;
	
	@FindBy(id="pass")
	
	private WebElement txtpass;
	
	@FindBy(name = "login")
	
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}


}
