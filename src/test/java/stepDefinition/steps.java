package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pageObject.homePage;
import pageObject.loginPage;
import pageObject.myAccountPage;
import pageObject.searchPage;

public class steps {
    private static final Logger log = LoggerFactory.getLogger(steps.class);
    WebDriver driver = new ChromeDriver();
    homePage home = new homePage(driver);
    loginPage login = new loginPage(driver);
    searchPage search = new searchPage(driver);
    myAccountPage account = new myAccountPage(driver);

//  Login Feature

    @Given("User navigate go to Test Automation store")
    public void user_navigate_go_to_test_automation_store() {
        driver.get("https://automationteststore.com/");
        driver.manage().window().maximize();
        home.clickOnHomeBtn();
    }
    @And("User click on login and register option")
    public void user_click_on_login_and_register_option() {
        home.clickOnLoginOrRegister();
    }
    @And("User should give the username {string}")
    public void user_should_give_the_username(String string) {
        login.setUsername(string);
    }
    @And("User should give the password {string}")
    public void user_should_give_the_password(String string) {
        login.setPassword(string);
    }
    @When("User should click on login button")
    public void user_should_click_on_login_button() {
            login.clickOnLoginBtn();
    }
    @Then("Login should be successful")
    public void login_should_be_successful() {
        login.setMyAccountIsDisplayed();
    }

    @And("User should click on logout button")
    public void userShouldClickOnLogoutButton() {
        login.clickOnLogoutBtn();
    }

    @Then("browser should close")
    public void browserShouldClose() {
        driver.close();
        driver.quit();
    }

//  Search Bar Functionality

    @Given("User should click on home")
    public void user_should_click_on_home() {
        home.clickOnHomeBtn();
    }
    @Given("User should click on search bar and search {string}")
    public void user_should_click_on_search_bar_and_search(String string) {
       home.clickOnSearchBar(string);
    }
    @Then("check weather shoes are displayed and check function of quantity,size")
    public void check_weather_shoes_are_displayed_and_check_function_of_quantity_size() {
       search.setShoesIsDisplayed();
       search.setQuantity("5");
    }
    @Then("click on search {string}")
    public void click_on_search(String string) {
        home.clickOnHomeBtn();
        home.clickOnSearchBar(string);
    }
    @Then("check t-shirts are displayed check functions")
    public void check_t_shirts_are_displayed_check_functions() {
        search.setTshirtsIsDisplayed();
        search.setSelectTshirtsSize("Medium");
        search.setQuantity("2");
    }
    @And("click on search the {string}")
    public void clickOnSearchThe(String string) {
        home.clickOnHomeBtn();
        home.clickOnSearchBar(string);
    }
    @Then("check lipstick are displayed check functions")
    public void check_lipstick_are_displayed_check_functions() {
        search.setLipStickIsDisplayed();
        search.setSelectLipStickColour("Viva Glam II  ");
        search.setQuantity("2");
    }

    @Then("close the browser")
    public void close_the_browser() {
        home.clickOnHomeBtn();
        driver.quit();
    }

//  My Account Feature


    @Given("User should go to login")
    public void user_should_go_to_login() {
        home.clickOnHomeBtn();
        home.clickOnLoginOrRegister();
    }
    @Given("login using {string} and {string}")
    public void login_using_and(String string, String string2) {
        login.setUsername(string);
        login.setPassword(string2);
        login.clickOnLoginBtn();
    }
    @Then("home page should display")
    public void home_page_should_display() {
        login.setMyAccountIsDisplayed();
        home.clickOnHomeBtn();
    }
    @Then("user should go to my account page")
    public void user_should_go_to_my_account_page() {
        home.ClickOnMyAccount();
    }
    @Then("check all button are visible or not")
    public void check_all_button_are_visible_or_not() {
        account.myAccountContainerIsDisplayed();
    }
    @Then("check all buttons are working or not")
    public void check_all_buttons_are_working_or_not() {
        account.clickOnMyAccount();
        Assert.assertTrue(account.myAccountIsDisplayed());
        account.clickOnAccountWishlist();
        Assert.assertTrue(account.accountWishlistIsDisplayed());
        account.clickOnEdtAccount();
        Assert.assertTrue(account.editAccountIsDisplayed());
        account.clickOnChangePassword();
        Assert.assertTrue(account.changePasswordIsDisplayed());
        account.clickOnManageAddress();
        Assert.assertTrue(account.manageAddressIsDisplayed());
        account.clickOnOrderHistory();
        Assert.assertTrue(account.orderHistoryIsDisplayed());
        account.clickOnTransactionHistory();
        Assert.assertTrue(account.transactionHistoryIsDisplayed());
        account.clickOnDownloads();
        Assert.assertTrue(account.downloadsIsDisplayed());
        account.clickOnNotifications();
        Assert.assertTrue(account.notificationsIsDisplayed());
    }
    @Then("click on logout")
    public void click_on_logout() {
        account.clickOnLogOff();
        home.clickOnHomeBtn();
    }


}
