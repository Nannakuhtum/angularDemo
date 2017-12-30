package io.github.mk.application.cucumber.stepdefs;

import io.github.mk.application.AngularDemoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AngularDemoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
