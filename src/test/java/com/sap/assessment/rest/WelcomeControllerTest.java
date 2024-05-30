package com.sap.assessment.rest;

import com.sap.assessment.Application;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WelcomeController.class)
@ContextConfiguration(classes = Application.class)
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class WelcomeControllerTest {

    @Autowired
    private final MockMvc mockMvc;

    @Test
    void greetReturnsGreeting() throws Exception {

        this.mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string("Nice to meet you!"));

    }
}