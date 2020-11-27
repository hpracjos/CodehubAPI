package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class MyStepdefs {

    RequestSpecification request = RestAssured.given();
    private static final String BASE_URL = "http://localhost:8083/greeting";
    private static Response response;

    @Given("User define the Get call")
    public void userDefineTheGetCall() {
        RestAssured.baseURI = BASE_URL;
    }

    @When("User performs GET operation")
    public void userPerformsGETOperation() {
        response = request.get("/greeting");
    }

    @Then("User is able to get response code from greetings endpoint")
    public void userIsAbleToGetResponseCodeFromGreetingsEndpoint() {
        int StatusCode = response.getStatusCode();
        Assert.assertEquals(StatusCode, 200);
        System.out.println("Response Body is =>  " + StatusCode);
    }

    @And("User validates the response body of greetings endpoint")
    public void userValidatesTheResponseBodyOfGreetingsEndpoint() {
        String responseBody = response.getBody().asString();
        String responseBody1 = response.getBody().prettyPrint();
        System.out.println("Response Body is =>  " + responseBody);
        System.out.println("Response Body 1 is =>  " + responseBody1);
    }
}
