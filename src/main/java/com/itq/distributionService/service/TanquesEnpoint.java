package com.itq.distributionService.service;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.distributionService.dto.Ack;
import com.itq.distributionService.dto.AltaTanque;

@Endpoint
public class TanquesEnpoint {
	private static final String NAMESPACE_URI = "http://com.Agua";

		
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "altaTanque")
	@ResponsePayload
	public Ack carRegistration(@RequestPayload AltaTanque request) {
		Ack response = new Ack();
		
		response.setCode(0);
		response.setDescription("OK");
		 
		return response;
		
	}

}
