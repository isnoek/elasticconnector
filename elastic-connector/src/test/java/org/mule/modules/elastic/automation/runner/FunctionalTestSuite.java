package org.mule.modules.elastic.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.elastic.automation.functional.GreetTestCases;
import org.mule.modules.elastic.ElasticConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({

GreetTestCases.class
})

public class FunctionalTestSuite {
	
	@BeforeClass
	public static void initialiseSuite(){
		ConnectorTestContext.initialize(ElasticConnector.class);
	}
	
	@AfterClass
    public static void shutdownSuite() {
    	ConnectorTestContext.shutDown();
    }
	
}