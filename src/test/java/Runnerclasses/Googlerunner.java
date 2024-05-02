package Runnerclasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\selenium\\src\\test\\resources\\futurefiles\\google.feature",glue="stepdef")
public class Googlerunner {

}
