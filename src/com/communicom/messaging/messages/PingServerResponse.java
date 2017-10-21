package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerResponse extends Message{
	
	private String name;
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	
	public PingServerResponse(){
		this.messageNumber = 2;
		this.emisionTime = LocalDateTime.now();
	}
	
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getTargetAddress() {
		return targetAddress;
	}
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public int getMessageNumber() {
		return messageNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Nombre --> " + this.name +"Numero --> "+ this.messageNumber +"Tiempo de emision --> " + this.emisionTime;
	}
}
