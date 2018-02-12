package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketSearch extends BasePage {

    WebDriver driver;

    public MarketSearch (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//INPUT[@id='glf-pricefrom-var']")
    WebElement priceFrom;

    public void setPriceFrom(String price) {
        priceFrom.click();
        priceFrom.sendKeys(price);
    }

    @FindBy(xpath = "//LABEL[@class='checkbox__label']")
    WebElement label;

    public void setLabel(String labelItem) {
        label.findElement(By.xpath("//LABEL[@class='checkbox__label'][text()='"+labelItem+"']")).click();
    }

    @FindBy(className = "n-filter-panel-aside__apply")
    WebElement button;

    public void setButton() {
        button.click();
    }
}
