package pl.sternik.kk.rest.jaxrs;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(Store.class);
    }
}
