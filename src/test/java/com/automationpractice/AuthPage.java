package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage {
    public WebDriver driver;

    public AuthPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id=\"email_create\"]")
    private WebElement emailField;

    @FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
    private WebElement createBtn;

    public void inputLogin(String login) {
        emailField.sendKeys(login);
    }
    public void clickCreateBtn() {
        createBtn.click(); }
}