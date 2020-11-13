package com.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {

    public WebDriver driver;
    public WebDriverWait wait;


    public AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 60);
        this.driver = driver;
    }


    @FindBy(xpath = "//h1[@class=\"page-heading\"]")
    private WebElement header;
    @FindBy(xpath = "//a[@class=\"account\"]/span")
    private WebElement accountBtn;

    public String getHeader() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"page-heading\"]")));
        return header.getText();
    }
    public String getAccBtnText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"account\"]/span")));
        return accountBtn.getText();
    }
}
