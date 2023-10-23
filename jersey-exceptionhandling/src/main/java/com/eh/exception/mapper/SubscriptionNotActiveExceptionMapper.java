package com.eh.exception.mapper;

import com.eh.dto.Error;
import com.eh.exception.SubscriptionNotActiveException;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.UUID;

@Provider
public class SubscriptionNotActiveExceptionMapper implements ExceptionMapper<SubscriptionNotActiveException> {
    @Override
    public Response toResponse(SubscriptionNotActiveException exception) {
        Response response = Response.status(Response.Status.BAD_REQUEST)
                                .entity(Entity.json(
                                Error.of().errorCode(UUID.randomUUID().toString())
                                .errorMessage("Subscription is not active").build())).build();
        return response;
    }
}
