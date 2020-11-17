package com.library.step_definitions;

import com.library.pages.GenreSelection_BookManagementPage;
import com.library.pages.LoginPage;
import com.library.utils.BrowserUtils;
import com.library.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class GenreStepDefinition {

    GenreSelection_BookManagementPage gsp = new GenreSelection_BookManagementPage();


    @And("user click on a Book Categories dropdown")
    public void user_click_on_a_book_categories_dropdown() {
        BrowserUtils.waitForClickability(gsp.categories,10);
        gsp.clickOnCategories();
    }

    @And("user select one genre.")
    public void user_select_one_genre() {
       gsp.selectDropdownAndGenre();
    }

    @Then("the category table show change to the selected genre.")
    public void the_category_table_show_change_to_the_selected_genre() {
        gsp.expendNumberOfVisibleBooks();
        List<WebElement> list =  Driver.getDriver().findElements(By.xpath("//tbody//tr/td[5]"));
        for (int i =0 ;i< list.size()-1;i++ ){
            Assert.assertTrue(list.get(i).getText().equalsIgnoreCase(gsp.getGenre()));
        }
    }

}
