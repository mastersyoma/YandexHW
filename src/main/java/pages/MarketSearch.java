package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketSearch {

    @FindBy(xpath = "//INPUT[@id='glf-pricefrom-var']")
    WebElement priceFrom;

    public void setPriceFrom(WebElement priceFrom) {
        priceFrom.sendKeys();
    }

    @FindBy(xpath = "//LABEL[@class='checkbox__label']")
    WebElement label;

    public void setLabel(WebElement label) {
        label.findElement(By.xpath("//LABEL[@class='checkbox__label'][text()='Beats']"));
    }
}
