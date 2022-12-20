package com.cucumber.steps;

import com.tutorialninja.pages.LaptopsAndNotebooks;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class laptopandnotebooksSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouseHover On Laptops And Desktop Tab$")
    public void iMouseHoverOnLaptopsAndDesktopTab() {
        new LaptopsAndNotebooks().mouseHoverOnLaptopsAndDesktopTab();
    }

    @And("^I click On Show All Laptops And Notebooks$")
    public void iClickOnShowAllLaptopsAndNotebooks() {
        new LaptopsAndNotebooks().clickOnAllLaptopAndNotebooksLink();
    }

    @And("^I sort By Price HighToLow$")
    public void iSortByPriceHighToLow() {
        new laptopandnotebooksSteps().iSortByPriceHighToLow();
    }

    @Then("^I Verify Sort By HighToLow Order$")
    public void iVerifySortByHighToLowOrder() {
        new laptopandnotebooksSteps().iVerifySortByHighToLowOrder();
    }

    @When("^I click On Currency Link$")
    public void iClickOnCurrencyLink() {
        new laptopandnotebooksSteps().iClickOnCurrencyLink();
    }

    @And("^I click On MacBook Tab$")
    public void iClickOnMacBookTab() {
        new laptopandnotebooksSteps().iClickOnMacBookTab();
    }

    @And("^I click On Add To Cart Button$")
    public void iClickOnAddToCartButton() {
        new laptopandnotebooksSteps().iClickOnAddToCartButton();
    }

    @And("^I click On Shoppings Cart$")
    public void iClickOnShoppingsCart() {
        new laptopandnotebooksSteps().iClickOnShoppingsCart();
    }

    @Then("^I get Shopping Cart Message$")
    public void iGetShoppingCartMessage() {
        new laptopandnotebooksSteps().iClickOnShoppingsCart();
    }

    @Then("^I Verify Product Macbook$")
    public void iVerifyProductMacbook() {
        new laptopandnotebooksSteps().iVerifySortByHighToLowOrder();
    }

    @And("^I send Text Change Quantity To two$")
    public void iSendTextChangeQuantityToTwo() {
        new laptopandnotebooksSteps().iSendTextChangeQuantityToTwo();
    }

    @And("^I click On Update Cart$")
    public void iClickOnUpdateCart() {
        new laptopandnotebooksSteps().iClickOnUpdateCart();
    }

    @And("^I get Success Modified Cart Message$")
    public void iGetSuccessModifiedCartMessage() {
        new laptopandnotebooksSteps().iGetSuccessModifiedCartMessage();
    }

    @And("^I get Verify Total$")
    public void iGetVerifyTotal() {
        new laptopandnotebooksSteps().iGetVerifyTotal();
    }

    @And("^I click On Checkout Button$")
    public void iClickOnCheckoutButton() {
        new laptopandnotebooksSteps().iClickOnCheckoutButton();
    }

    @And("^I get Checkout Text$")
    public void iGetCheckoutText() {
        new laptopandnotebooksSteps().iGetVerifyTotal();
    }

    @And("^I get New Customer Text$")
    public void iGetNewCustomerText() {
        new laptopandnotebooksSteps().iGetNewCustomerText();
    }

    @And("^I click On Guest Checkout Radio Button$")
    public void iClickOnGuestCheckoutRadioButton() {
        new laptopandnotebooksSteps().iClickOnGuestCheckoutRadioButton();
    }

    @And("^click On Continue Tab$")
    public void clickOnContinueTab() {
        new laptopandnotebooksSteps().clickOnContinueTab();
    }

    @And("^enter Name \"([^\"]*)\"$")
    public void enterName(String name) {
        new laptopandnotebooksSteps().enterName("Pari");
    }

    @And("^enter Last Name\"([^\"]*)\"$")
    public void enterLastName(String Lastname) {
        new laptopandnotebooksSteps().enterLastName("Patel");

    }

    @And("^enter Email \"([^\"]*)\"$")
    public void enterEmail(String email) {
        new laptopandnotebooksSteps().enterEmail("paripatel12341@gmail.com");

    }

    @And("^enter Telephone\"([^\"]*)\"$")
    public void enterTelephone(String number) {
        new laptopandnotebooksSteps().enterTelephone("1234567890");
    }

    @And("^enter Address\"([^\"]*)\"$")
    public void enterAddress(String Address) {
        new laptopandnotebooksSteps().enterAddress("21, convey Road");
    }

    @And("^enter City \"([^\"]*)\"$")
    public void enterCity(String city) {
        new laptopandnotebooksSteps().enterCity("Cambridge");
    }

    @And("^enter Postcode\"([^\"]*)\"$")
    public void enterPostcode(String postcode) {
        new laptopandnotebooksSteps().enterPostcode("CB4 3NB");
    }

    @And("^enter Country \"([^\"]*)\"$")
    public void enterCountry(String country) {
        new laptopandnotebooksSteps().enterCountry("UK");
    }

    @And("^enter Zone \"([^\"]*)\"$")
    public void enterZone(String zone) {
        new laptopandnotebooksSteps().enterZone("Cambridge");
    }

    @And("^click On Continue Button$")
    public void clickOnContinueButton() {
        new laptopandnotebooksSteps().clickOnContinueTab();
    }

    @And("^enter Text To Text Area \"([^\"]*)\"$")
    public void enterTextToTextArea(String Area)  {
        new laptopandnotebooksSteps().enterTextToTextArea("Please confirm delivery date");
    }

    @And("^click On TermsAndConditions Checkbox$")
    public void clickOnTermsAndConditionsCheckbox() {
        new laptopandnotebooksSteps().clickOnTermsAndConditionsCheckbox();
    }

    @And("^click On Final Continue Button$")
    public void clickOnFinalContinueButton() {
        new laptopandnotebooksSteps().clickOnFinalContinueButton();
    }

    @Then("^I get Warning Payment Method Required Text$")
    public void iGetWarningPaymentMethodRequiredText() {
        new laptopandnotebooksSteps().iGetWarningPaymentMethodRequiredText();
    }
}
