package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MarketElec {

    WebDriver driver;

    public MarketElec (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//A[@class='link catalog-menu__list-item metrika i-bem metrika_js_inited']")
    WebElement elecButt;

    public void setElecButt(String elecItem) {
        elecButt.findElement(By.xpath(
                "//A[@class='link catalog-menu__list-item metrika i-bem metrika_js_inited'][text()='"+elecItem+"']")).click();
    }
}
