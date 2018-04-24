package com.example.testing.controllers;

import com.example.testing.repositories.TestRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TestControllerTest {

    TestController testController;

    @Mock
    TestRepository testRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        testController = new TestController();
    }

    @Test
    public void getIndex() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(testController).build();
        mockMvc.perform(get("/test"))
                .andExpect(status().isOk());
    }
}