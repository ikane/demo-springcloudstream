package com.ikane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public class SenderBean {

	@Autowired
	@Qualifier("input")
	private MessageChannel ouput;
	
	public void sendMessage(String name, int age) {
		Vote vote = new Vote(name, age);
		this.ouput.send(MessageBuilder.withPayload(vote).build());
	}
}
