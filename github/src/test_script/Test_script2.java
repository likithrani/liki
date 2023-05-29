package test_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Base_Test;
import pom_script.Pom1;

public class Test_script2 extends Base_Test// to give multiple login data
{
	@Test(dataProvider = "testdata")
	public void test1(String d1,String d2) throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		p.emailTbox(d1);
		p.passPwd(d2);
		p.clickBtn();
		Assert.fail();
	}
	@DataProvider(name="testdata")//any random name
	public Object[][] creatData() {
		return new Object[][] {
			{"hd","23"},
			{"hi","90"},
		};
		
	}
}
