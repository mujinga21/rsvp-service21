package com.company.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.web.util.NestedServletException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CalculatorControllerTest {

    @Before
    public void setUp() throws Exception {






        @Test(expected = NestedServletException.class)
                public void shouldReturn422WhenPostingIncorrectOperationBody() throws Exception{
            Map<String, String >incorrectInput = new HashMap<>();
            incorrectInput.put("operand", "50");
            incorrectInput.put("operand2", "100");
            incorrectInput.put("operation", "add");
            String inputJson = mapper.writeValueAsString(incorrectInput);

            mockMVC.perform(
                    post("/substract")
                            .content(inputJson)
                            .contentType(MediaType.APPLICATION_JSON)
            )
        }
    }
}