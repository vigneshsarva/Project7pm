package org.pojo;

import org.base.BaseClassNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CallingPojoPage extends BaseClassNew {
public static void main(String[] args)  {
		
		getDriver();
		
		MaximizeWindow();
		
		launchUrl("https://www.facebook.com/");
		WebElement lk = driver.findElement(By.xpath("//a[text() = 'English (UK)']"));
		lk.click();
		
		String title = getTitle();
		System.out.println(title);
		
		String CurrentUrl = getCurrenturl();
		System.out.println(CurrentUrl);
		
		//insertType(new PojoPage().getTxtUserName().get(0),getData(0,0));
		//insertType(new PojoPage().getTxtPassword().get(0),getData(0,2));
		//click(new PojoPage().getBtnLogin());
		
		insertType(new PojoPage().getTxtUserName().get(0),"viki");
}


}
