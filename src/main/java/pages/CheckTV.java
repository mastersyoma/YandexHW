package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class CheckTV extends BasePage {

    WebDriver driver;

    public static String element;

    public CheckTV(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "(//div[contains(@class,'n-snippet-card2__title')]/a)")
    List<WebElement> pageElementsTV;

    @FindBy(xpath = "//INPUT[@id='header-search']")
    WebElement searchFieldTV;

    @FindBy(xpath = "(//BUTTON[@role='button'])[1]")
    WebElement searchButtonTV;

    @FindBy(xpath = "(//div[contains(@class,'n-title__text')]/h1)")
    WebElement titleTV;

    public void checkCountElementsTV(String expected) {
        String actualCount = String.valueOf(pageElementsTV.size());
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualCount, expected),actualCount.contains(expected));
        System.out.println("Ожидалось: " + expected);
        System.out.println("Получено: " + actualCount);
    }

    public void firstPageElement() {
        element = pageElementsTV.get(0).getText();
        System.out.println("Первый элемент: "+ element);
    }

    public void searchFirstElement() {
        element = pageElementsTV.get(0).getText();
        searchFieldTV.sendKeys(element);
        searchButtonTV.click();
        titleTV.isDisplayed();
    }

}
