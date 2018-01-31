package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketElec {

    @FindBy(xpath = "//A[@class='link catalog-menu__list-item metrika i-bem metrika_js_inited'][text()='Телевизоры']")
    WebElement elecButt;

    public void setElecButt(String elecItem) {
        elecButt.findElement(By.xpath(
                "//A[@class='link catalog-menu__list-item metrika i-bem metrika_js_inited'][text()='"+elecItem+"']"));
    }
}
