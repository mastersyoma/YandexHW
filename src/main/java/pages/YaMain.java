package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YaMain {

    @FindBy(xpath = "//A[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search'][text()='Маркет']")
    WebElement yaButt;

    public void setYaButt(String mainMenuItem) {
        yaButt.findElement(By.xpath
                ("//A[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search'][text()='" + mainMenuItem + "']")).click();
    }
}
