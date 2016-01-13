package org.mule.modules.elastic;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.OnException;

import org.mule.modules.elastic.config.ConnectorConfig;
import org.mule.modules.elastic.error.ErrorHandler;

@Connector(name="elastic", friendlyName="Elastic")
@OnException(handler=ErrorHandler.class)
public class ElasticConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String Insert(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return "";
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}