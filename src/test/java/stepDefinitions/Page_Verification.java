package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.BookShelves_Verification;

public class Page_Verification {

	BookShelves_Verification bs;
	@Given("the user is on the UrbanLadder home page")
	public void the_user_is_on_the_urban_ladder_home_page() {
	    bs=new BookShelves_Verification(BaseClass.getDriver());
	}

	@When("the user search in the search bar\\(searchText: {string})")
	public void the_user_search_in_the_search_bar_search_text(String string) throws InterruptedException {
	   bs.search_BookShelves(string);
	   Thread.sleep(5000);
	}

	@When("the user click the Enter button")
	public void the_user_click_the_enter_button() {
	  bs.closePopup();
	}

	
	@Then("the user should see a text\\(text: {string})")
	public void the_user_should_see_a_text_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
		boolean status =bs.VerifyPage(string);
		if(status) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(true);
		}
	}
     
	@Then("the user should not see a text\\(text: {string})")
	public void the_user_should_not_see_a_text_text(String string) {
		boolean status =bs.VerifyPage(string);
		if(status==false) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(true);
		}
	}
	
}
