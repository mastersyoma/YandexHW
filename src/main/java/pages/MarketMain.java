package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketMain {

    WebDriver driver;

    public MarketMain (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//A[@class='link topmenu__link']")
    WebElement marketButt;

    public void setMarketButt(String menuItem) {
        marketButt.findElement(By.xpath("//A[@class='link topmenu__link'][text()='"+menuItem+"']")).click();
    }
}
