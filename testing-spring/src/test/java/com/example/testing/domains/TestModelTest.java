package com.example.testing.domains;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestModelTest {

    private TestModel testModel;
    @Before
    public void setUp() throws Exception {
        testModel = new TestModel();
    }

    @Test
    public void getId() {
        Long idValue = 73L;
        testModel.setId(idValue);
        assertEquals(idValue, testModel.getId());
    }


    @Test
    public void getTestInt() {
        int testValue = 42;
        testModel.setTestInt(testValue);
        assertEquals(testValue, testModel.getTestInt());
    }


    @Test
    public void getTestString() {
        String testValue = "Drive";
        testModel.setTestString(testValue);
        assertEquals(testValue, testModel.getTestString());
    }

}