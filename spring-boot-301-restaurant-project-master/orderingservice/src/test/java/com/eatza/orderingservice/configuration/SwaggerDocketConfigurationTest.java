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

import com.eatza.order.config.SwaggerConfiguration;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SwaggerConfiguration.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@AutoConfigurationPackage
@SpringBootConfiguration
public class SwaggerDocketConfigurationTest {
	
	@Autowired
	Docket docket;
	
	
	@Autowired
	UiConfiguration uiconfiguration;
	
	@Test
	public void docketTest() {
		assertNotNull(docket);
	}
	
	@Test
	public void uiconfigurationTest() {
		assertNotNull(uiconfiguration);
	}

}
