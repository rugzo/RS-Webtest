package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.GooglePage;

public class GooglePageSteps {
    @Given("Go to Google home page")
    public void go_to_google_home_page() {
        GooglePage.open_google_home();
    }

    @When("Search for \"([^\"]*)\" on Google")
    public void search_for_on_google(String string) {
        GooglePage.search_on_google(string);
    }

    @When("Click \"([^\"]*)\" on Google")
    public void click_on_google(String string) {
        GooglePage.click_site_on_google_results(string);
    }
}
