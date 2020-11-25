package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;


public class getGreetingsStepDef {

    private final RequestSpecification httpRequest = RestAssured.given().relaxedHTTPSValidation();
    private Response response;

    @Given("User define the Get call")
    public void userDefineTheGetCall() {
        RestAssured.baseURI = "http://localhost:8081/";
    }

    @When("User performs GET operation")
    public void userPerformsGETOperation(RequestSpecification httpRequest) {
        Response response = httpRequest.request(Method.GET, "/greeting");

    }

    @Then("User is able to get response code from greetings endpoint")
    public void userIsAbleToGetResponseCodeFromGreetingsEndpoint(Response response) {
        int StatusCode = response.getStatusCode();
        Assert.assertEquals(StatusCode, 200, "Expected Status code returned");
        System.out.println("Response Body is =>  " + StatusCode);

    }

    @And("User validates the response body of greetings endpoint")
    public void userValidatesTheResponseBodyOfGreetingsEndpoint(Response response) {
        String responseBody = response.getBody().asString();
        String responseBody1 = response.getBody().prettyPrint();
        System.out.println("Response Body is =>  " + responseBody);
        System.out.println("Response Body 1 is =>  " + responseBody1);
    }
}
