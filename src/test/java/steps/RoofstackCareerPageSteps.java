package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RoofstackCareerPage;

public class RoofstackCareerPageSteps {
    @When("Select \"([^\"]*)\" positions on Career Page")
    public void select_positions_on_career_page(String positions) {
        RoofstackCareerPage.selectPositionsCategory(positions);
    }

    @When("Select \"([^\"]*)\" position on Career Page")
    public void select_position_on_career_page(String position) {
        RoofstackCareerPage.selectPosition(position);
    }

    @When("Click Send CV Make an Application button")
    public void click_send_cv_make_an_application_button() {
        RoofstackCareerPage.clickMakeAnApplicationBtn();
    }

    @When("Fill email address with \"([^\"]*)\"")
    public void fill_email_address_with(String email) {
        RoofstackCareerPage.fillEmail(email);
    }

    @When("Select file for upload CV on Career Page")
    public void select_file_for_upload_cv_on_career_page() throws Exception {
        RoofstackCareerPage.selectCvFileFromComputer();
    }

    @When("Click upload button on Career Page")
    public void click_upload_button_on_career_page() {
        RoofstackCareerPage.clickUploadBtn();
    }

    @Then("Check CV has been sent successfully")
    public void check_cv_has_been_sent_successfully() {
        RoofstackCareerPage.checkFileUploaded();
    }
}
