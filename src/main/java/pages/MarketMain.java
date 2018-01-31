package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketMain {

    @FindBy(xpath = "//A[@class='link topmenu__link'][text()='Электроника']")
    WebElement marketButt;

    public void setMarketButt(String menuItem) {
        marketButt.findElement(By.xpath("//A[@class='link topmenu__link'][text()='"+ menuItem +"']")).click();
    }
}
