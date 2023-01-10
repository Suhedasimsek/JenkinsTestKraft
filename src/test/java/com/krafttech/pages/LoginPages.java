package com.krafttech.pages;


import com.krafttech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends BasePage{

    @FindBy(name = "email")
    public WebElement userEmailInput_loc;
    @FindBy(name = "password")
    public WebElement passwordInput_loc;
    @FindBy(xpath ="//button[@type='submit']")
    public WebElement submitButton_loc;

    public void loginUser(){
        String username= ConfigurationReader.get("userEmail");
        String password= ConfigurationReader.get("password");

        userEmailInput_loc.sendKeys(username);
        passwordInput_loc.sendKeys(password);
        submitButton_loc.click();
    }
}
