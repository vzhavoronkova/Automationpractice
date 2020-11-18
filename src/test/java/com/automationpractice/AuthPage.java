package com.automationpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public AuthPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id=\"email_create\"]")
    private WebElement emailField;

    @FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
    private WebElement createBtn;

    @FindBy(xpath = "//div[@id=\"create_account_error\"]")
    private WebElement createAlert;

    public void inputLogin(String login) {
        System.out.println("I enter value for email");
        emailField.sendKeys(login);
    }

    public void clickCreateBtn() {
        System.out.println("I click on Create Btn");
        createBtn.click();
    }

    public String getColorField() {
        WebElement eleSearch = driver.findElement(By.xpath("//input[@id=\"email_create\"]"));
        String rgbFormat = eleSearch.getCssValue("background-color");
        System.out.println("Color for Email is " + rgbFormat);
        return rgbFormat;
    }

    public String getColorAlert() {
        WebElement eleSearch = driver.findElement(By.xpath("//div[@id=\"create_account_error\"]"));
        String rgbFormat = eleSearch.getCssValue("background-color");
        System.out.println("Color for Alert is " + rgbFormat);
        return rgbFormat;
    }

    public String getAlertMessage() {
        WebElement alert = driver.findElement(By.xpath("//div[@id=\"create_account_error\"]//li"));
        System.out.println("I see an alert with the text: " + alert.getText());
        return alert.getText();
    }
}
