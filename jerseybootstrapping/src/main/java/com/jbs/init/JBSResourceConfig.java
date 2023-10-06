package com.jbs.init;

import com.jbs.api.ProductApiService;
import com.jbs.api.sd.ProductDetailsApiService;
import org.glassfish.jersey.server.ResourceConfig;

public class JBSResourceConfig extends ResourceConfig {
    public JBSResourceConfig(){
        register(new ProductDetailsApiService());
        register(ProductApiService.class);
    }
}
