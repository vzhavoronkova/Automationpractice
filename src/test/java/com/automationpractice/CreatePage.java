package com.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePage {
    public WebDriver driver;


    public CreatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id=\"id_gender1\"]")
    private WebElement MrChr;
    @FindBy(xpath = "//input[@id=\"id_gender2\"]")
    private WebElement MrsChr;
    @FindBy(xpath = "//input[@id=\"customer_firstname\"]")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id=\"customer_lastname\"]")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id=\"passwd\"]")
    private WebElement passwdField;
    @FindBy(xpath = "//select[@id=\"days\"]")
    private WebElement daysDD;
    @FindBy(xpath = "//select[@id=\"months\"]")
    private WebElement monthsDD;
    @FindBy(xpath = "//select[@id=\"years\"]")
    private WebElement yearsDD;
    @FindBy(xpath = "//input[@id=\"newsletter\"]")
    private WebElement newsletterChr;
    @FindBy(xpath = "//input[@id=\"optin\"]")
    private WebElement specOfferChr;
    /*@FindBy(xpath = "//input[@id=\"firstname\"]")
    private WebElement firstNameField2;*/
    /*@FindBy(xpath = "//input[@id=\"lastname\"]")
    private WebElement lastNameField2;*/
    @FindBy(xpath = "//input[@id=\"company\"]")
    private WebElement companyField;
    @FindBy(xpath = "//input[@id=\"address1\"]")
    private WebElement addressField;
    @FindBy(xpath = "//input[@id=\"address2\"]")
    private WebElement addressField2;
    @FindBy(xpath = "//input[@id=\"city\"]")
    private WebElement cityField;
    @FindBy(xpath = "//select[@id=\"id_state\"]")
    private WebElement stateDD;
    @FindBy(xpath = "//input[@id=\"postcode\"]")
    private WebElement postcodeField;
    /*@FindBy(xpath = "//select[@id=\"id_country\"]")
    private WebElement countryDD;*/
    @FindBy(xpath = "//textarea[@id=\"other\"]")
    private WebElement otherField;
    @FindBy(xpath = "//input[@id=\"phone\"]")
    private WebElement phoneField;
    @FindBy(xpath = "//input[@id=\"phone_mobile\"]")
    private WebElement mobileField;
    /*@FindBy(xpath = "//input[@id=\"alias\"]")
    private WebElement aliasField;*/
    @FindBy(xpath = "//button[@id=\"submitAccount\"]")
    private WebElement registerBtn;


    public void createAccount() {
        CreatePage createAcc = new CreatePage(this.driver);
        registerBtn.click();
    }

    public String getUserEmail() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"email\"]")));
        String userEmail = emailField.getAttribute("value");
        //String userEmail = emailField.getText();
        return userEmail;
    }
    public void inputFirst(String firstName) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        emailField.sendKeys(firstName);
    }
    public void inputLast(String lastName) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        emailField.sendKeys(lastName);
    }
    public void inputPassw(String passw) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        emailField.sendKeys(passw);
    }
    public void inputAddress(String address) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        emailField.sendKeys(address);
    }
    public void inputCity(String city) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        emailField.sendKeys(city);
    }
    public void inputZip(String zip) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        emailField.sendKeys(zip);
    }
    public void inputPhone(String phone) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        emailField.sendKeys(phone);
    }

}
