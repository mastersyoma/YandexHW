package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.FindBy;

public class MarketSearch {

    @FindBy(xpath = "//INPUT[@id='glf-pricefrom-var']")
    WebElement priceFrom;

    public void setPriceFrom(String price) {
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
