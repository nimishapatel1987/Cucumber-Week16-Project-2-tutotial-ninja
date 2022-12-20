package com.cucumber.steps;

import com.tutorialninja.pages.MyAccount;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myaccountSteps {
    @When("^I click On MyAccount Link$")
    public void iClickOnMyAccountLink() {
    }

    @And("^I select My Account Options \"([^\"]*)\"$")
    public void iSelectMyAccountOptions(String arg0) {
    }

    @Then("^I verify Register Account Message$")
    public void iVerifyRegisterAccountMessage() {

    }

    @And("^I select My Account Option \"([^\"]*)\"$")
    public void iSelectMyAccountOption(String arg0) {
    }

    @Then("^I verify Returning Customer Message$")
    public void iVerifyReturningCustomerMessage() {
    }

    @And("^I select My Accounts Options \"([^\"]*)\"$")
    public void iSelectMyAccountsOptions(String arg0) {
    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String name)  {
        new MyAccount().enterFirstName("Pari");

    }

    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String lastname) {
        new MyAccount().enterLastName("Patel");
    }

    @And("^I enter Email Id \"([^\"]*)\"$")
    public void iEnterEmailId(String emailid) {
        new MyAccount().enterEmailAdd("paripatel1234@gmail.com");

    }

    @And("^I enter Phone Number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String number) {
        new MyAccount().enterPhone("01234567890");

    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new MyAccount().enterPassword("123456");
    }

    @And("^I enter Confirm Password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String password) {
        new MyAccount().enterConfirmPass("123456");
    }

    @And("^I click Subscribe On Yes Radio Button$")
    public void iClickSubscribeOnYesRadioButton() {
    }

    @And("^I click On Privacy Policy CheckBox$")
    public void iClickOnPrivacyPolicyCheckBox() {
    }

    @And("^I click On Continue one$")
    public void iClickOnContinueOne() {
        new MyAccount().clickOnContinueButton();
    }

    @Then("^I get Account Created Message$")
    public void iGetAccountCreatedMessage() {
    }

    @And("^I click On Continue Button two$")
    public void iClickOnContinueButtonTwo() {
    }

    @And("^I click On MyAccount Tab$")
    public void iClickOnMyAccountTab() {
    }

    @And("^I select my Accounts Option \"([^\"]*)\"$")
    public void iSelectMyAccountsOption(String arg0) throws Throwable {

    }

    @Then("^I get Account Logout Message$")
    public void iGetAccountLogoutMessage() {
    }

    @And("^I click On Continue Button Three$")
    public void iClickOnContinueButtonThree() {
    }

    @And("^I click On Login$")
    public void iClickOnLogin() {
    }
}
