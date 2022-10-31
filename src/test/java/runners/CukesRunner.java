package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/report.html",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "step_definitions",
        stepNotifications = true,
        dryRun = false
<<<<<<< HEAD
        ,tags = "@USIN-3"
=======
        ,tags = "@InterviewAdds"
>>>>>>> f3ccf6762338101c434dcdd9dc0f50db82353b37

)
public class CukesRunner {
}
