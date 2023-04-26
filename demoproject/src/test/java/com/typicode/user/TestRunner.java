package com.typicode.user;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/typicode/user/features",
        glue = "com/typicode/user/steps",
        tags = "not @skip",
        plugin = {"pretty", "json:target/cucumber-report.json"},
        publish = true
)

public class TestRunner {
}