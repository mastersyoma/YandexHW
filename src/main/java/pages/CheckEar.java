package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class CheckEar extends BasePage {

    WebDriver driver;

    public static String firstEar;

    public CheckEar(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "(//div[contains(@class,'n-snippet-cell2__title')]/a)")
    List<WebElement> pageElementsEar;

    @FindBy(xpath = "//*[contains(@class, 'n-snippet-cell2__title')]//a[1]")
    WebElement searchFieldEar;

    @FindBy(xpath = "(//BUTTON[@role='button'])[1]")
    WebElement searchButtonTV;

    @FindBy(xpath = "(//div[contains(@class,'n-title__text')]/h1)")
    WebElement titleTV;

    public void checkCountElementsEar(String expected) {
        String actualCount = String.valueOf(pageElementsEar.size());
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualCount, expected),actualCount.contains(expected));
        System.out.println("Ожидалось: " + expected);
        System.out.println("Получено: " + actualCount);
    }

    public void firstPageElement() {
        firstEar = pageElementsEar.get(0).getText();
        System.out.println("Первый элемент: "+ firstEar);
    }

    public void searchFirstElement() {
        firstEar = pageElementsEar.get(0).getText();
        searchFieldEar.sendKeys(firstEar);
        searchButtonTV.click();
        titleTV.isDisplayed();
    }

}

