package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.fluentlenium.adapter.cucumber.FluentCucumberTest;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import providers.DriverFactory;


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

}
