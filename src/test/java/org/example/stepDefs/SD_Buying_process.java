package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.Vodafone_Iphone;

import static org.example.stepDefs.Hooks.driver;

public class SD_Buying_process {
Vodafone_Iphone vod = new Vodafone_Iphone(driver);

@When("user Click on English tab")
public void user_click_on_english_tab() {
		vod.Click_English().click();
}

@And("Select Apple brand")
public void select_Apple_brand() {
		vod.Apple_brand().click();

}

@And("Press in any returned product")
public void press_in_any_returned_product() {
		vod.Select_Iphone().click();
}

@And("Press Add to cart")
public void press_add_to_cart() {
		vod.Click_Add_To_Cart().click();
}

@And("Press Proceed to Checkout")
public void press_proceed_to_checkout() {
		vod.Proceed_To_Checkout().click();
}

@And("^Select Delivery Options As \"(.*)\" and \"(.*)\"$")
public void select_delivery_options_as(String city, String sector) {
		vod.Delivery_Options(city, sector);
}

@And("Select Deliver to My Address")
public void select_deliver_to_my_address() {
		vod.Deliver_To_My_Add().click();
}


@And("Complete Address details")
public void complete_address_details() {
		vod.Address_Details("25 mohamed mahmoud street", "1", "1", "168", "grocery", "VOIS");
}

@And("press continue")
public void press_continue() {
		vod.Continue_Button().click();
}

@Then("Assert error message returned from Full Name field.")
public void assert_error_message_returned_from_full_name_field() {
		vod.Assert_Error_message();
}


}
