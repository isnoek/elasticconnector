
package org.mule.modules.elastic.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.elastic.ElasticConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>ElasticConnectorProcessAdapter</code> is a wrapper around {@link ElasticConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-01-01T04:14:22+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class ElasticConnectorProcessAdapter
    extends ElasticConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<ElasticConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, ElasticConnectorCapabilitiesAdapter> getProcessTemplate() {
        final ElasticConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,ElasticConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, ElasticConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, ElasticConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
