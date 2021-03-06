package com.max.safetyalerts.controller;

import com.max.safetyalerts.model.Person;
import com.max.safetyalerts.service.PersonServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
public class PersonControllerTest {
/*    private MockMvc mockMvc;
    private Person p;
    @Autowired
    private WebApplicationContext webContext;

    @Mock
    PersonServiceImpl applicationService;

    @Before
    public void setupWebOrMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
        // declarer une var pour avoir acces a des routes Mvc
}

    @Test
    public void deletePersonTest() throws Exception{
        mockMvc.perform(post("/person")
                .param("/person", 1L)
                .andExpect(status().isOk(); // autant qu'on veut des andExpect
        //delete est une methode http
        // le perform indique le chemin et la methode http
    }*/
}
