package test_script;

import org.testng.annotations.Test;

import Generic.Base_Test;
import pom_script.Pom1;

public class Test_script1 extends Base_Test// to give single login data
{
	@Test
	public void test1()
	{
		Pom1 p=new Pom1(driver);
		p.emailTbox("likithrani");
		p.passPwd("124");
		p.clickBtn();
	}

}
