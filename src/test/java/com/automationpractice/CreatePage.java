package com.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePage {
    public WebDriver driver;
    public WebDriverWait wait;


    public CreatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 60);
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
    @FindBy(xpath = "//select[@id=\"id_country\"]/option[@selected='selected']")
    private WebElement countryDD;
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
        System.out.println("I click on Register Btn");
        CreatePage createAcc = new CreatePage(this.driver);
        registerBtn.click();
    }

    public String getUserEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"email\"]")));
        return emailField.getAttribute("value");

    }

    public void inputFirst(String firstName) {
        System.out.println("I enter value for First Name");
        firstNameField.sendKeys(firstName);
    }

    public void inputLast(String lastName) {
        System.out.println("I enter value for Last Name");
        lastNameField.sendKeys(lastName);
    }

    public void inputPassw(String passw) {
        System.out.println("I enter value for Password field");
        passwdField.sendKeys(passw);
    }

    public void inputAddress(String address) {
        System.out.println("I enter value for Address field");
        addressField.sendKeys(address);
    }

    public void inputCity(String city) {
        System.out.println("I enter value for City field");
        cityField.sendKeys(city);
    }

    public void selectState(String state) {
        System.out.println("I selected state");
        Select drpCountry = new Select(driver.findElement(By.id("id_state")));
        drpCountry.selectByVisibleText(state);
    }

    public void inputZip(String zip) {
        System.out.println("I enter value for Post code field");
        postcodeField.sendKeys(zip);
    }

    public String getCountry() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id=\"id_country\"]/option[@selected='selected']")));
        return countryDD.getText();
    }

    public void inputPhone(String phone) {
        System.out.println("I enter value for Mobile phone field");
        mobileField.sendKeys(phone);
    }

}
