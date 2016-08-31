package com.ikane;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoSpringcloudstreamApplication.class)
public class DemoSpringcloudstreamApplicationTests {
	
	@Autowired
	private Sink sink;


	@Test
	public void contextLoads() {
		
		Assertions.assertThat(sink.input()).isNotNull();
	}

}
