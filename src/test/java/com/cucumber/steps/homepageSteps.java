package com.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homepageSteps {
    @When("^Mouse hover on “Desktops” Tab and click$")
    public void mouseHoverOnDesktopsTabAndClick() {
    }

    @And("^call selectMenu method and pass the menu = Show All Desktops$")
    public void callSelectMenuMethodAndPassTheMenuShowAllDesktops() {
    }

    @Then("^Verify the text ‘Desktops’$")
    public void verifyTheTextDesktops() {
    }

    @When("^Mouse hover on “Laptops & Notebooks” Tab and click$")
    public void mouseHoverOnLaptopsNotebooksTabAndClick() {
    }

    @And("^call selectMenu method and pass the menu = Show All Laptops & Notebooks$")
    public void callSelectMenuMethodAndPassTheMenuShowAllLaptopsNotebooks() {
    }

    @Then("^Verify the text ‘Laptops & Notebooks’$")
    public void verifyTheTextLaptopsNotebooks() {
    }

    @When("^Mouse hover on “Components” Tab and click$")
    public void mouseHoverOnComponentsTabAndClick() {
    }

    @And("^call selectMenu method and pass the menu = Show All Components$")
    public void callSelectMenuMethodAndPassTheMenuShowAllComponents() {
    }

    @Then("^Verify the text ‘Components’$")
    public void verifyTheTextComponents() {
    }
}
