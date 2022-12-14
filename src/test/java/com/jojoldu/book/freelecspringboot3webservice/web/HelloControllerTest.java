package com.jojoldu.book.freelecspringboot3webservice.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void helloReturn() throws Exception{
        String hello = "hello";
        mvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string(hello));
    }
}
