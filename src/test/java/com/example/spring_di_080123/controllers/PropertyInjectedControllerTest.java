package com.example.spring_di_080123.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new PropertyInjectedController();
    }

    @Test
    void getGreeting() {
    }
}