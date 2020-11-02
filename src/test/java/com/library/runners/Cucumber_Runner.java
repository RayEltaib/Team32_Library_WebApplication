package com.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/library/step_definitions",
        features = "src/resources/features",
        dryRun = false,
        tags = "@Login and @BorrowBook"
)
public class Cucumber_Runner {
}
