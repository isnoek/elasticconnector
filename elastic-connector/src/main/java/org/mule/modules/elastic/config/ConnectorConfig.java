package org.mule.modules.elastic.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

    /**
     * Elastichost
     */
    @Configurable
    @Default("localhost")
    private String ElasticHost;
    
    @Configurable
    @Default("9300")
    private String ElasticPort;
    
    @Configurable
    @Default("elasticsearch")
    private String ElasticCluster;
    
    //getters and setters
    
    public void setElasticHost(String aHostName) {
    	this.ElasticHost=aHostName;
    }
    
    public String getElasticHost() {
    	return this.ElasticHost;
    }
    
    public void setElasticPort(String aPortNumber) {
    	this.ElasticPort=aPortNumber;
    }
    
    public String getElasticPort() {
    	return this.ElasticPort;
    }
    
    public void setElasticCluster(String aClusterName) {
    	this.ElasticCluster=aClusterName;
    }
    
    public String getElasticCluster() {
    	return this.ElasticCluster;
    }
    
    
}