package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Comment {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints ")
    public String setPostApiEndpointComment() {
        return url + "products/2/comments";
    }

    @Step("I set GET api endpoints comment")
    public String setGetApiEndpointComment() {
        return url + "products/2/comments";
    }

    @Step("I set GET api endpoints comment2")
    public String setGetApiEndpointComment2() {
        return url + "products/2/comment";
    }

    @Step("I send POST HTTP request comment")
    public void sendPostHTTPRequestComment() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest.given().header("Authorization", "Bearer "
                + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g")
                .body(requestBody.toJSONString()).post(setPostApiEndpointComment()).then().statusCode(200);
    }

    @Step("I send GET HTTP request comment")
    public void sendGetHttpRequestComment() {
        SerenityRest.given().get(setGetApiEndpointComment());
    }

    @Step("I send GET HTTP request comment2")
    public void sendGetHttpRequestComment2() {
        SerenityRest.given().get(setGetApiEndpointComment2());
    }

    @Step("Then I receive valid HTTP response code 404 comment")
    public void receiveValidHttp404Comment() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive valid HTTP response code 200 comment")
    public void receiveValidHttp200Comment() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
