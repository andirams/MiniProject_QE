package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Comment;

public class CommentSteps {
    @Steps
    Comment comment;

    @Given("I set POST api endpoints comment")
    public void setPostApiEndpointComment() {
        comment.setPostApiEndpointComment();
    }

    @Given("I set GET api endpoints comment")
    public void setGetApiEndpointComment() {
        comment.setGetApiEndpointComment();
    }

    @Given("I set GET api endpoints comment2")
    public void setGetApiEndpointComment2() {
        comment.setGetApiEndpointComment2();
    }

    @When("I send POST HTTP request comment")
    public void sentPostHttpRequestComment() {
        comment.sendPostHTTPRequestComment();
    }

    @When("I send GET HTTP request comment")
    public void sendGetHttpRequestComment() {
        comment.sendGetHttpRequestComment();
    }

    @When("I send GET HTTP request comment2")
    public void sendGetHttpRequestComment2() {
        comment.sendGetHttpRequestComment2();
    }

    @Then("I receive valid HTTP response code 200 comment")
    public void receiveValidHttp200Rating() {
        comment.receiveValidHttp200Comment();
    }

    @Then("I receive valid HTTP response code 404 comment")
    public void receiveValidHttp404Rating() {
        comment.receiveValidHttp404Comment();
    }
}