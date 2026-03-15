package com.qapractice.base;

import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void setUp() {
        // Setup code goes here
        System.out.println("Setup before each test");
    }

    @After
    public void tearDown() {
        // Teardown code goes here
        System.out.println("Teardown after each test");
    }
}