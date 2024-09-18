package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends basePage{
    public loginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/section/ul/li[3]/a")
    WebElement loginOrRegisterIsDisplayed;
    @FindBy(xpath = "//*[@id='loginFrm_loginname']")
    WebElement username;
    @FindBy(xpath = "//*[@id='loginFrm_password']")
    WebElement password;
    @FindBy(xpath = "//*[@id='loginFrm']/fieldset/button")
    WebElement loginBtn;
    @FindBy(xpath = "//*[@id='maincontainer']/div/div[2]/div[1]/h2/span")
    WebElement myAccountIsDisplayed;
    @FindBy(xpath = "//*[@id='maincontainer']/div/div[1]/div/ul/li[9]/a")
    WebElement logoutBtn;

    public boolean setLoginOrRegisterIsDisplayed() {
        return loginOrRegisterIsDisplayed.isDisplayed();
    }

    public void setUsername(String user) {
        username.sendKeys(user);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickOnLoginBtn() {
        loginBtn.click();
    }

    public boolean setMyAccountIsDisplayed (){
        return myAccountIsDisplayed.isDisplayed();
    }

    public void clickOnLogoutBtn(){
        logoutBtn.click();
    }
}
