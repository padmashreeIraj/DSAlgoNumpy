package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features= {".//Features//Login.feature"},
        glue="stepDefinitions",
        plugin= {
        		"pretty", "html:reports/myreport.html", 
        		"json:reports/myreport.json"
        		},    //Mandatory to capture failures
        dryRun=false,
        monochrome=true,
        tags = "@sanity"	//Scenarios tagged with @sanity,
      )
public class TestRunner extends AbstractTestNGCucumberTests{


}

