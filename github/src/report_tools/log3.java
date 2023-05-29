package report_tools;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class log3 
{
	@Test
	public void test1()
	{
		BasicConfigurator.configure();
		Logger log =Logger.getLogger(this.getClass().getName());
		log.warn("warn");
		log.info("info");
		log.error("error");
	}

}
