package org.mule.modules.elastic.automation.functional;

import org.elasticsearch.client.Client;
import org.junit.Before;
import org.junit.Test;
import org.mule.modules.elastic.ElasticConnector;
import org.mule.modules.elastic.config.ConnectorConfig;
import org.mule.mvel2.ast.AssertNode;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.esoxsolutions.factories.ClientFactory;

import static org.junit.Assert.*;
@SuppressWarnings("deprecation")
public class ElasticTestCases extends AbstractTestCase<ElasticConnector> {

	private ConnectorConfig _config;
	
	public ElasticTestCases() {
		super(ElasticConnector.class);
	}
	
	@Before
	public void setUp() {
		_config=new ConnectorConfig();
		_config.setElasticCluster("elasticsearch");
		_config.setElasticHost("127.0.0.1");
		_config.setElasticPort("9300");
	}
	@Test
	public void GetClientTest() {
		
		Client c=ClientFactory.getInstance(_config).getClient();
		assertNotNull(c);
	}
}
