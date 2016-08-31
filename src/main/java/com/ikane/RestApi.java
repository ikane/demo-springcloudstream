package com.ikane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	
	@Autowired
	private SenderBean senderBean; 

	@RequestMapping(value="/send", method=RequestMethod.GET)
	public String sendMessage() {
		
		this.senderBean.sendMessage("Ibou", 35);
		
		return "done";
	}
}
