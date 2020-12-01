package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import io.restassured.http.Method;

public class getGreetings {
    private static Response response;
    private static final String BASE_URL = "http://localhost:8083";
    private static final RequestSpecification request = RestAssured.given();

    @Given("User define the Get call")
    public void user_define_the_get_call() {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();
        response = request.get("/greeting");
    }

    @When("User is able to get response code from greetings endpoint")
    public void user_is_able_to_get_response_code_from_greetings_endpoint() {
        int StatusCode = response.getStatusCode();
        Assert.assertEquals(StatusCode, 200);
        System.out.println("Response Code is =>  " + StatusCode);
    }

    @Then("User validates the response body of greetings endpoint")
    public void user_validates_the_response_body_of_greetings_endpoint() {
       String responseBody = response.getBody().prettyPrint();
       System.out.println("Response Body 1 is =>  " + responseBody);
    }
}
