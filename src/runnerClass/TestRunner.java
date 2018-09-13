package runnerClass;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features/MyTest.feature"
,glue={"Amazonautomation"})


public class TestRunner 				
{		

}

