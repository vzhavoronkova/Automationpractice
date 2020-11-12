package com.automationpractice;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {
    public static MainPage mainPage;
    public static AuthPage authPage;
    public static CreatePage createPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        authPage = new AuthPage(driver);
        createPage = new CreatePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("mainpage"));
    }

    @Test
    public void createAccountRequiredPositive() {
        mainPage.clickSignBtn();
        authPage.inputLogin(ConfProperties.getProperty("login"));
        authPage.clickCreateBtn();
        createPage.inputFirst(ConfProperties.getProperty("firstName"));
        createPage.inputLast(ConfProperties.getProperty("lastName"));
        String userEmail = createPage.getUserEmail();
        //Assert.assertEquals(ConfProperties.getProperty("login"), userEmail);
        createPage.inputPassw(ConfProperties.getProperty("passw"));
        //Asserts for verified First and Last Name;
        createPage.inputAddress(ConfProperties.getProperty("address"));
        createPage.inputCity(ConfProperties.getProperty("city"));
        createPage.inputZip(ConfProperties.getProperty("zip"));
        //Asserts for verified selected Country;
        createPage.inputPhone(ConfProperties.getProperty("phone"));
        createPage.createAccount();



    }


}
