package yandexhw.steps;

import yandexhw.pages.MarketMain;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketMainStep extends BaseSteps {

    @Step("Выбор раздела {0}")
    public void setMarketButtStep(String menuItem) {
        new MarketMain(getDriver()).setMarketButt(menuItem);
    }
}
