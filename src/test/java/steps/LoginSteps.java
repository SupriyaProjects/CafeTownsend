package steps;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fluentlenium.adapter.cucumber.FluentCucumberTest;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import providers.DriverFactory;

import java.util.List;


/**
 * Created by Supriya Pawar on 7/05/2017.
 */

public class LoginSteps extends FluentCucumberTest {

    @Page
    private LoginPage loginPage;

    @Before
    public void before(Scenario scenario) {
        super.before(scenario);
    }

    @After
    public void after(Scenario scenario) {
        super.after(scenario);
    }

    @Override
    public WebDriver newWebDriver() {
        return new DriverFactory().getDriver();
    }

    @Given("^the owner is on the Login Page$")
    public void the_owner_is_on_the_login_page() {
        goTo(loginPage);
    }

    @And("^the owner is logged in$")
    public void the_owner_is_logged_in() {
        loginPage.owner_logs_in_to_cafe_townsend();
    }

    @When("^the owner enters his details$")
    public void the_owner_enters_his_details() {
        loginPage.owner_logs_in_to_cafe_townsend();
    }

    @Then("^greeting should have username \"(.*?)\"$")
    public void he_should_be_logged_in(String username) {
        loginPage.verifyOwnerIsLoggedIn(username);
    }
    @When("^the owner enters his details \"(.*?)\" and \"(.*?)\"$")
    public void the_owner_enters_his_details(String username, String password) {
        loginPage.owner_enter_incorrect_username_password(username, password);
    }

    @Then("^system should throw an error message.$")
    public void system_should_throw_an_error_message()  {
        loginPage.invalid_error_message();
    }

    @Then("^system should validate the message$")
    public void system_should_validate_the_message()  {
        loginPage.validate_the_message();
    }
}


