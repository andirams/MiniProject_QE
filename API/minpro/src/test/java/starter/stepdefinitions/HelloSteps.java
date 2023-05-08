package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Hello;

public class HelloSteps {
    @Steps
    Hello hello;

    @Given("I set GET api endpoints hello")
    public void setGetApiEndpointHello() {
        hello.setGetApiEndpointHello();
    }

    @When("I send GET HTTP request hello")
    public void sendGetHttpRequestHello() {
        hello.sendGetHttpRequestHello();
    }

    @Then("I receive valid HTTP response code 200 hello")
    public void receiveValidHttp200Rating() {
        hello.receiveValidHttp200Hello();
    }
}
