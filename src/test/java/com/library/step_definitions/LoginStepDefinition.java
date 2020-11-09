package com.library.step_definitions;


import com.library.pages.BasePage;
import com.library.pages.BooksPage;
import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {

   LoginPage loginPage = new LoginPage();
   BasePage booksPage = new BooksPage();

   @Given("user is on login page")
   public void user_is_on_login_page() {
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
   }



   @When("user logs in")
   public void user_logs_in() {
    loginPage.login();
   }


   @Then("user should see Library page title")
   public void user_should_see_library_page_title() {
     String ExpectedTitle = "Login - Library";
     String ActualTitle=Driver.getDriver().getTitle();
     Assert.assertEquals("Title is wrong.",ActualTitle,ExpectedTitle);
   }


}
