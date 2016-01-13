package org.mule.modules.elastic;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.OnException;
import org.mule.modules.elastic.config.ConnectorConfig;
import org.mule.modules.elastic.error.ErrorHandler;

import com.esoxsolutions.factories.ClientFactory;
import com.esoxsolutions.interfaces.Insertable;

@Connector(name = "elastic", friendlyName = "Elastic")
@OnException(handler = ErrorHandler.class)
public class ElasticConnector {

	@Config
	ConnectorConfig config;

	
	/**
	 * Custom processor
	 *
	 * @param element the element to be inserted into elasticsearch
	 *            
	 * @return A status code
	 */
	@Processor
	public String Index(Insertable element) {

		if (element != null) {
			Client client = ClientFactory.getInstance(config).getClient();
			if (client != null) {
				IndexResponse response = client
						.prepareIndex(element.getIndexName(),
								element.getMappingName(), element.getId())
						.setSource(element.toJson()).execute().actionGet();
				return "OK";

			} else {
				return "Could not instantiate client";
			}
		} else {
			return "Element not provided";
		}

		
	}

	public ConnectorConfig getConfig() {
		return config;
	}

	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

}