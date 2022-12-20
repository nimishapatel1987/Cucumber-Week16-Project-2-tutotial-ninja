package com.cucumber.steps;

import com.tutorialninja.pages.Desktops;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class desktopsSteps {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^Click on currency link$")
    public void clickOnCurrencyLink() {
        new Desktops().clickOnCurrencyLink();
    }

    @And("^chane currency to pound$")
    public void chaneCurrencyToPound() {
        new Desktops().clickOnCurrencyLink();
    }

    @And("^Mouse hover on Desktops Tab and click$")
    public void mouseHoverOnDesktopsTabAndClick() {
        new Desktops().mouseHoverOnLaptopsAndDesktopTab();
    }

    @And("^Click on Show All Desktops$")
    public void clickOnShowAllDesktops() {
        new Desktops().clickOnAllDesktop();
    }

    @And("^Select Sort By position Name A to Z$")
    public void selectSortByPositionNameAToZ() {
    }

    @And("^Select product HP LP(\\d+)$")
    public void selectProductHPLP(int arg0) {
    }

    @And("^Verify the Text HP LP(\\d+)$")
    public void verifyTheTextHPLP(int arg0) {
    }

    @And("^Select Delivery Date (\\d+)-(\\d+)-(\\d+)$")
    public void selectDeliveryDate(int arg0, int arg1, int arg2) {
    }

    @And("^Click on Add to Cart button$")
    public void clickOnAddToCartButton() {
    }

    @And("^Verify the Message Success: You have added HP LP(\\d+) to your shopping cart$")
    public void verifyTheMessageSuccessYouHaveAddedHPLPToYourShoppingCart(int arg0) {
    }

    @And("^Click on link shopping cart display into success message$")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
    }

    @And("^Verify the text Shopping Cart$")
    public void verifyTheTextShoppingCart() {
    }

    @And("^Verify the Product name HP LP(\\d+)$")
    public void verifyTheProductNameHPLP(int arg0) {
    }

    @And("^Verify the Model Product(\\d+)$")
    public void verifyTheModelProduct(int arg0) {
    }

    @Then("^Verify the Total £(\\d+)\\.(\\d+)$")
    public void verifyTheTotal£(int arg0, int arg1) {
    }
}
