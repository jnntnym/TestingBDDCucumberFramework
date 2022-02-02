package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
    @Given("user in a home page")
    public void userInAHomePage() {
        System.out.println("User in a home page");
    }

    @And("user enter in a User Id as {string}")
    public void userEnterInAUserIdAs(String id) {
        System.out.println("User enter in a User Id--> "+id);
    }
    @And("user enter in a Password as {string}")
    public void userEnterInAPasswordAs(String pwd) {
        System.out.println("User enter in a Password--> "+pwd);
    }

    @When("user clicked on login button")
    public void userClickedOnLoginButton() {
        System.out.println("User clicked on login button");
    }

    @Then("User should be able to logged in successfully")
    public void userShouldBeAbleToLoggedInSuccessfully() {
        System.out.println("User able to logged in successfully");
        System.out.println("**********************");
    }
}
