package com.library.pages;

import com.library.utils.BrowserUtils;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {




    @FindBy(id = "inputEmail")
    public WebElement emailElement;

    @FindBy(id = "inputPassword")
    public WebElement passwordElement;

    @FindBy(tagName = "button")
    public WebElement signIn;


    public void login() {

        BrowserUtils.waitForVisibility(this.emailElement,20);
        String email = ConfigurationReader.getProperty("email");
        String password = ConfigurationReader.getProperty("password");

        this.emailElement.sendKeys(email);
        this.passwordElement.sendKeys(password, Keys.ENTER);

    }

}
