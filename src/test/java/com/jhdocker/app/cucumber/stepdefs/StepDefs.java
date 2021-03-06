package com.jhdocker.app.cucumber.stepdefs;

import com.jhdocker.app.JhdockerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhdockerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
