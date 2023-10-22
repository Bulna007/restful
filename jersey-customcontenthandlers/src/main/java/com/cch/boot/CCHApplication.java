package com.cch.boot;

import com.cch.api.PolicyApiService;
import com.cch.reader.JAXBMessageBodyReader;
import com.cch.reader.JSONMessageBodyReader;
import com.cch.writers.JAXBMessageBodyWriter;
import com.cch.writers.JSONMessageBodyWriter;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class CCHApplication extends Application {
    private Set<Class<?>> classes;

    public CCHApplication() {
        classes = new HashSet<>();
        classes.add(PolicyApiService.class);
        classes.add(JSONMessageBodyReader.class);
        classes.add(JSONMessageBodyWriter.class);
        classes.add(JAXBMessageBodyReader.class);
        classes.add(JAXBMessageBodyWriter.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
