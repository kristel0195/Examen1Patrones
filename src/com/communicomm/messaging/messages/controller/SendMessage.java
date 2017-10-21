package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicom.messaging.messages.signals.Messages;

public class SendMessage {
	private static  ArrayList<PingServerRequest>sentPingRequest = new ArrayList<PingServerRequest>();
	private static ArrayList<PingServerResponse>receivedPingResponse = new ArrayList<PingServerResponse>();
	private static ArrayList<SetWaitForSignalRequest>sentWaitForSignalRequest = new ArrayList<SetWaitForSignalRequest>();		
	private static ArrayList<SetWaitForSignalResponse>ReceivedWaitForSignalResponse = new ArrayList<SetWaitForSignalResponse>();
	
	public static Message send(Messages type) throws Exception {
		if (Messages.PINGSERVERREQUEST.equals(type)){
			sentPingRequest.add(new PingServerRequest());
		}
		if (Messages.PINGSERVERRESPONSE.equals(type)) {
			receivedPingResponse.add(new PingServerResponse());
		}
		if (Messages.SETWAITFORSIGNALREQUEST.equals(type)) {
			sentWaitForSignalRequest.add(new SetWaitForSignalRequest());
		}
		if (Messages.SETWAITFORSIGNALRESPONSE.equals(type)){ 
			ReceivedWaitForSignalResponse.add(new SetWaitForSignalResponse());
		}
		
		throw new Exception("Error");
	}

}
