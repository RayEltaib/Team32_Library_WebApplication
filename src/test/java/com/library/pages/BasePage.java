package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(tagName = "h1")
    private WebElement pageTitleElement;

    @FindBy(xpath = "//span[@class='title'][.='Books']")
    public WebElement books;

    @FindBy(tagName = "h3")
    public WebElement pageHeader;

    @FindBy(css = "#navbarDropdown>span")
    public WebElement accountHolderName;

    @FindBy(linkText = "Log Out")
    public WebElement logOutLink;

    public String getPageTitleText(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pageTitleElement.getText().trim();
    }

    public void logOut(){
        accountHolderName.click();
        logOutLink.click();
    }

}

// 
