package com.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/library/step_definitions",
        features = "src/test/resources/features",
        dryRun = true,
        tags = "@genre"

)
public class Cucumber_Runner {
}
