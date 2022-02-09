package com.ecommerce.tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
 
@DisplayName("JUnit 5 Nested Example")
@RunWith(JUnitPlatform.class)
public class NestedCases {
 
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
 
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }
 
    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }
 
    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }
 
    @Nested
    @DisplayName("Tests for the method A")
    class A {
 
        @BeforeEach
        void beforeEach() {
            System.out.println("Before each test method of the A class");
        }
 
        @AfterEach
        void afterEach() {
            System.out.println("After each test method of the A class");
        }
 
        @Test
        @DisplayName("Example test for method A")
        void sampleTestForMethodA() {
            System.out.println("Example test for method A");
        }
 
        @Nested
        @DisplayName("When X is true")
        class WhenX {
 
            @BeforeEach
            void beforeEach() {
                System.out.println("Before each test method of the WhenX class");
            }
 
            @AfterEach
            void afterEach() {
                System.out.println("After each test method of the WhenX class");
            }
 
            @Test
            @DisplayName("Example test for method A when X is true")
            void sampleTestForMethodAWhenX() {
                System.out.println("Example test for method A when X is true");
            }
        }
    }
}
