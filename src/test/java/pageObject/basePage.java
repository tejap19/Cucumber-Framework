package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class basePage {

    WebDriver driver;

    public basePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void dropDown(WebElement xpath, String visibleText){
        Select dp = new Select(xpath);
        dp.selectByVisibleText(visibleText);
    }
}
