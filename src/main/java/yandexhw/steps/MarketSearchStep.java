package yandexhw.steps;

import yandexhw.pages.MarketSearch;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSearchStep extends BaseSteps {

    @Step("Задать цену {0}")
    public void setPriceFromStep(String price) {
    new MarketSearch(getDriver()).setPriceFrom(price);
    }

    @Step("Выбор фирмы")
    public void setLabelStep(String labelItem) {
        new MarketSearch(getDriver()).setLabel(labelItem);
    }

    @Step("Нажатие кнопки поиск")
    public void setButtonStep() {
        new MarketSearch(getDriver()).setButton();
    }
}
