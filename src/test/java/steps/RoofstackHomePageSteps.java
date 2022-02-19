package steps;

import cucumber.api.java.en.When;
import pages.RoofstackHomePage;

public class RoofstackHomePageSteps {
    @When("Navigate to \"([^\"]*)\" on navbar")
    public void navigate_to_on_navbar(String string) {
        RoofstackHomePage.navigateNavbar(string);
    }
}
