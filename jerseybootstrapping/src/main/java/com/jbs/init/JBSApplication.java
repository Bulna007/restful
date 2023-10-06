package com.jbs.init;

import com.jbs.api.ProductApiService;
import com.jbs.api.sd.ProductDetailsApiService;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

/*4. programmatic bootStrapping through Application class with no web.xml approach*/
//@ApplicationPath("/api/*")
public class JBSApplication extends Application {
    private Set<Object> singletons;
    private Set<Class<?>> classes;

    public JBSApplication(){
        singletons = new HashSet<>();
        classes = new HashSet<>();

        classes.add(ProductDetailsApiService.class);
        singletons.add(new ProductApiService());
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
