package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GenreSelection_BookManagementPage extends BasePage{

    // Selecting genre
    private  String genre = "Romance";

    // Find book categories
    @FindBy(xpath = "//div[@class='col-md-6']")
    public WebElement categories;


    //  Find DropDown
    @FindBy(id = "book_categories")
    public WebElement dropdown;

    // Find Show Button
    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement showButton;

    //Locating all elements of Category List - table
    @FindBy(xpath = "//tbody//tr/td[5]")
    public WebElement categoryList;


    // click on book categories
    public void clickOnCategories() {
        categories.click();
    }

    // creating a get method for String genre
    public  String getGenre(){
        return genre;
    }

    // creating an instance of Select class and selecting genre
    public void selectDropdownAndGenre() {
        Select select = new Select(dropdown);
        select.selectByVisibleText(getGenre());
    }

    //Expend number of visible books
    public void expendNumberOfVisibleBooks() {
        showButton.click();
        Select select = new Select(showButton);
        select.selectByVisibleText("500");
    }

}

