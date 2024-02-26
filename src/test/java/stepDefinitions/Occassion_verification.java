package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Occassion;

public class Occassion_verification {

	Occassion oc;
	
	@When("the user clicks on the Gift Cards")
	public void the_user_clicks_on_the_gift_cards() throws InterruptedException {
		oc=new Occassion(BaseClass.getDriver());
		oc.click_GiftCard();

	}

	@Then("the user should see Birthday\\/Anniversary Occasssion")
	public void the_user_should_see_birthday_anniversary_occasssion() {
	   boolean status=oc.check_Occassion();
	   if(status) {
		   Assert.assertTrue(true);
	   }
	   else {
		   Assert.assertTrue(false);
	   }
	}
}
