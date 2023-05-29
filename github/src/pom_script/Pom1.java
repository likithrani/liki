package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 
{
	@FindBy(name="email")
	private WebElement emailTbox;
	@FindBy(name="pass")
	private WebElement passTbox;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void emailTbox(String email) {
		// TODO Auto-generated method stub
		emailTbox.sendKeys(email);	
	}
	public void passPwd(String pwd) {
		// TODO Auto-generated method stub
		passTbox.sendKeys(pwd);
	}
	public void clickBtn() {
		// TODO Auto-generated method stub
		loginBtn.click();
	}

}
