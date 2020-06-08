package com.play_safe.conversions;

import com.play_safe.conversions.controller.AppController;
import com.play_safe.conversions.service.AppServices;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConversionsApplication.class)
class ConversionsApplicationTests {

	@Autowired
	AppServices appServices;
	@Autowired
	@MockBean
	AppController appController;

	@Test
	@org.junit.Test
	public void testApplicationLoad()
	{
		assertNotNull("Controller is not loaded", appController);
	}




}
