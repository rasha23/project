package com.project_name.step_definitions;

import com.project_name.pages.SearchPage;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SearchStepDef extends SearchPage {

    @Given("the user on the homepage")
    public void the_user_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user type {string}")
    public void user_type(String productName) throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
         WebElement box=(WebElement) js.executeScript("return document.querySelector(\"body > app-root > app-homepage > cvs-header-component > div > cvs-header > div > cvs-header-desktop\").shadowRoot.querySelector(\"#cvs-desktop-header-container > div > div.search-bar-container.sc-cvs-header-desktop > cvs-search-box\").shadowRoot.querySelector(\"#flex-input\")");
         //box.click();
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click()", box);

        String text="arguments[0].setAttribute('value','Tylenol')";
       Thread.sleep(2000);

       ((JavascriptExecutor) Driver.getDriver()).executeScript(text, box);
        //searchBox.sendKeys("Tylenol");
        //searchBox.click();


    }
    @Then("user should be able to see the product")
    public void user_should_be_able_to_see_the_product() {

    }




}
