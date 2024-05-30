package com.sap.assessment;

import com.sap.assessment.rest.WelcomeController;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes = Application.class)
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class ApplicationTests {

	private final WelcomeController welcomeController;

	@Test
	void contextLoads() {
		assertThat(welcomeController).isNotNull();
	}
}
