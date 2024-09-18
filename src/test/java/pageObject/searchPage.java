package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchPage extends basePage{
    public searchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/section/ul/li[2]/a")
    WebElement shoesIsDisplayed;
    @FindBy(xpath = "//*[@id='product']/fieldset/div[5]/ul/li/a")
    WebElement addToCart;
    @FindBy(xpath = "//*[@id='product_quantity']")
    WebElement quantity;
    @FindBy(xpath = "//*[@id='product']/fieldset/div[6]/a[2]")
    WebElement addToWishList;
    @FindBy(xpath = "//a[normalize-space()='Fruit of the Loom T-Shirts 5 Pack - Super Premium']")
    WebElement tshirtsIsDisplayed;
    @FindBy(xpath = "//*[@id='option348']")
    WebElement selectTshirtsSize;
    @FindBy(xpath = "//a[normalize-space()='Viva Glam Lipstick']")
    WebElement lipStickIsDisplayed;
    @FindBy(xpath = "//select[@id='option305']")
    WebElement selectLipStickColour;

    public boolean setShoesIsDisplayed() {
        return shoesIsDisplayed.isDisplayed();
    }

    public void clickOnAddToCart() {
        addToCart.click();
    }

    public void setQuantity(String qty) {
        quantity.clear();
        quantity.sendKeys(qty);
    }

    public void clickOnAddToWishlist() {
        addToWishList.click();
    }

    public boolean setTshirtsIsDisplayed() {
        return tshirtsIsDisplayed.isDisplayed();
    }

    public void setSelectTshirtsSize(String visibleText) {
        dropDown(selectTshirtsSize,visibleText);
    }

    public boolean setLipStickIsDisplayed(){
        return lipStickIsDisplayed.isDisplayed();
    }

    public void setSelectLipStickColour(String visibleText){
        dropDown(selectLipStickColour,visibleText);
    }
}
