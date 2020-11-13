package com.automationpractice;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {
    public static MainPage mainPage;
    public static AuthPage authPage;
    public static CreatePage createPage;
    public static WebDriver driver;
    public static AccountPage accountPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        authPage = new AuthPage(driver);
        createPage = new CreatePage(driver);
        accountPage = new AccountPage(driver);
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
        Assert.assertEquals(ConfProperties.getProperty("login"), createPage.getUserEmail());
        createPage.inputPassw(ConfProperties.getProperty("passw"));
        createPage.inputAddress(ConfProperties.getProperty("address"));
        createPage.inputCity(ConfProperties.getProperty("city"));
        createPage.selectState(ConfProperties.getProperty("state"));
        createPage.inputZip(ConfProperties.getProperty("zip"));
        Assert.assertEquals(ConfProperties.getProperty("country"), createPage.getCountry());
        createPage.inputPhone(ConfProperties.getProperty("phone"));
        createPage.createAccount();
        Assert.assertTrue(accountPage.getHeader().equalsIgnoreCase("My account"));
        String expectedBtnText = ConfProperties.getProperty("firstName") +" "+ ConfProperties.getProperty("lastName");
        Assert.assertEquals(expectedBtnText, accountPage.getAccBtnText());


    }


}
