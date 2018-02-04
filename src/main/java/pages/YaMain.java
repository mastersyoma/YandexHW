package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YaMain{

    WebDriver driver;

    public YaMain(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//A[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search']")
    WebElement yaButt;

    public void setYaButt(String mainMenuItem) {
        yaButt.findElement(By.xpath
                ("//A[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search'][text()='"+mainMenuItem+"']")).click();
    }
}