package com.ikane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Configuration;

@EnableBinding(Processor.class)
@Configuration
public class SinkConfig {
	
	static final Logger logger = LoggerFactory.getLogger(SinkConfig.class);
	
	@StreamListener(Processor.INPUT)
	public void processVote(Vote vote) {
		logger.info("!!!!!!!! Vote received: {} !!!!!!", vote);
	}

}
