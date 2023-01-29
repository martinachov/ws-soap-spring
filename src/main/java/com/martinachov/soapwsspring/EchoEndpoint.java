package com.martinachov.soapwsspring;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.martinachov.soap.EchoRequest;
import com.martinachov.soap.EchoResponse;
import com.martinachov.soap.EchoType;

@Endpoint
public class EchoEndpoint {
    
    private static final String NAMESPACE_URI = "http://martinachov.com/soap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EchoRequest")
	@ResponsePayload
    public EchoResponse handleEcho(@RequestPayload EchoRequest request) {
        EchoResponse response = new EchoResponse();
        EchoType echo = new EchoType();
        echo.setEcho(request.getEcho().getEcho());
        response.setEcho(echo);
        return response; 
    }
}
