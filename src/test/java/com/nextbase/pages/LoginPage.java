package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@placeholder='Login']")
    public WebElement userNameBox;


    @FindBy (xpath = "//input[@placeholder='Password']")
    public WebElement passwordBox;


}






