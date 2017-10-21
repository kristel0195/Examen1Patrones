package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;

public class MessageController {
	private ArrayList<PingServerRequest>sentPingRequest = new ArrayList<PingServerRequest>();
	private ArrayList<PingServerResponse>receivedPingResponse = new ArrayList<PingServerResponse>();
	private ArrayList<SetWaitForSignalRequest>sentWaitForSignalRequest = new ArrayList<SetWaitForSignalRequest>();		
	private ArrayList<SetWaitForSignalResponse>ReceivedWaitForSignalResponse = new ArrayList<SetWaitForSignalResponse>();
	

	public void listMessage(int messageOption) {
		if (messageOption == 1){
			for (PingServerRequest currentRequest: sentPingRequest){
				System.out.println(currentRequest);
			}
		}
		if (messageOption == 2){
			for (PingServerResponse currentResponse: receivedPingResponse){
				System.out.println(currentResponse);
			}
		}
		if (messageOption == 3){
			for (SetWaitForSignalRequest currentRequest: sentWaitForSignalRequest){
				System.out.println(currentRequest);
			}
		}
		if (messageOption == 4){
			for (SetWaitForSignalResponse currentResponse: ReceivedWaitForSignalResponse){
				System.out.println(currentResponse);
			}
		}
	}

}
