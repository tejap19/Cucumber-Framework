package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends basePage {
    public myAccountPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccount;
    @FindBy(xpath = "//*[@id='maincontainer']/div/div[1]/div/ul")
    WebElement myAccountContainer;
    @FindBy(xpath = "//li[@class='selected']//a[@href='https://automationteststore.com/index.php?rt=account/account']")
    WebElement dashboard;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/wishlist']")
    WebElement accountWishlist;
    @FindBy(xpath = "//a[normalize-space()='My wish list']")
    WebElement accountWishlistValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/edit']")
    WebElement editAccount;
    @FindBy(xpath = "//a[normalize-space()='Edit Information']")
    WebElement editAccountValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/password']")
    WebElement changePassword;
    @FindBy(xpath = "//a[normalize-space()='Change Password']")
    WebElement changePasswordValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/address']")
    WebElement manageAddress;
    @FindBy(xpath = "//a[normalize-space()='Address Book']")
    WebElement manageAddressValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/history']")
    WebElement orderHistory;
    @FindBy(xpath = "//a[normalize-space()='Order History']")
    WebElement orderHistoryValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/transactions']")
    WebElement transactionHistory;
    @FindBy(xpath = "//a[normalize-space()='Transactions History']")
    WebElement transactionHistoryValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/download']")
    WebElement downloads;
    @FindBy(xpath = "//a[normalize-space()='Downloads']")
    WebElement downloadsValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/notification']")
    WebElement notifications;
    @FindBy(xpath = "//a[normalize-space()='Notifications']")
    WebElement notificationsValidation;
    @FindBy(xpath = "//a[normalize-space()='Logoff']")
    WebElement logOff;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOffValidation;

    public void clickOnMyAccount() {
        myAccount.click();
    }

    public boolean myAccountIsDisplayed() {
        return myAccount.isDisplayed();
    }

    public boolean myAccountContainerIsDisplayed() {
        return myAccountContainer.isDisplayed();
    }

    public void clickOnDashBoard() {
        dashboard.click();
    }


    public void clickOnAccountWishlist() {
        accountWishlist.click();
    }

    public void clickOnEdtAccount() {
        editAccount.click();
    }

    public void clickOnChangePassword() {
        changePassword.click();
    }

    public void clickOnManageAddress() {
        manageAddress.click();
    }

    public void clickOnOrderHistory() {
        orderHistory.click();
    }

    public void clickOnTransactionHistory() {
        transactionHistory.click();
    }

    public void clickOnDownloads() {
        downloads.click();
    }

    public void clickOnNotifications() {
        notifications.click();
    }

    public void clickOnLogOff() {
        logOff.click();
    }

    public boolean accountWishlistIsDisplayed() {
        return accountWishlistValidation.isDisplayed();
    }

    public boolean editAccountIsDisplayed() {
        return editAccountValidation.isDisplayed();
    }

    public boolean changePasswordIsDisplayed() {
        return changePasswordValidation.isDisplayed();
    }

    public boolean manageAddressIsDisplayed() {
        return manageAddressValidation.isDisplayed();
    }

    public boolean orderHistoryIsDisplayed() {
        return orderHistoryValidation.isDisplayed();
    }

    public boolean transactionHistoryIsDisplayed() {
        return transactionHistoryValidation.isDisplayed();
    }

    public boolean downloadsIsDisplayed() {
        return downloadsValidation.isDisplayed();
    }

    public boolean notificationsIsDisplayed() {
        return notificationsValidation.isDisplayed();
    }

    public boolean logOffIsDisplayed() {
        return logOffValidation.isDisplayed();
    }

}
