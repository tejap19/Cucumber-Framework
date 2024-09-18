package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage{

    public homePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='customer_menu_top']/li/a")
    WebElement loginOrRegister;
    @FindBy(xpath = "//*[@id='categorymenu']/nav/ul/li[1]/a")
    WebElement homeBtn;
    @FindBy(xpath = "//*[@id='main_menu_top']/li[2]/a/span")
    WebElement myAccount;
    @FindBy(xpath = "//*[@id='main_menu_top']/li[3]/a/span")
    WebElement cartBtn;
    @FindBy(xpath = "//*[@id='filter_keyword']")
    WebElement searchBar;
    @FindBy(xpath = "//*[@id='search_form']/div/div")
    WebElement searchIcon;

    public void clickOnLoginOrRegister() {
        loginOrRegister.click();
    }

    public void clickOnHomeBtn() {
        homeBtn.click();
    }

    public void ClickOnMyAccount() {
        myAccount.click();
    }

    public void clickOnCart() {
        cartBtn.click();
    }

    public void clickOnSearchBar(String text) {
        searchBar.click();
        searchBar.sendKeys(text);
        searchIcon.click();
    }
}
