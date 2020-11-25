import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class getGreetingsStepDef {
    @Given("User define the Get call")
    public void userDefineTheGetCall() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "http://localhost:8081/";
    }

    @When("User trigger the GET greetings endpoint")
    public void userTriggerTheGETGreetingsEndpoint() {
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/greeting");
        Integer responseStatusCode = response.getStatusCode();
        System.out.println("Response Body is =>  " + responseStatusCode);
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);
    }

    @Then("User is able to get response code")
    public void userIsAbleToGetResponseCode() {

    }

    @And("User validates the response body")
    public void userValidatesTheResponseBody() {


    }
}
