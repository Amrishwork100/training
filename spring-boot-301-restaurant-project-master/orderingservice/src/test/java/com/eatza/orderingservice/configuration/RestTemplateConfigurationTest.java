package com.eatza.orderingservice.configuration;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.eatza.order.config.RestTemplateClient;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=RestTemplateClient.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@AutoConfigurationPackage
@SpringBootConfiguration
public class RestTemplateConfigurationTest {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Test
	public void restTemplateTest() {
		assertNotNull(restTemplate);
	}

}
