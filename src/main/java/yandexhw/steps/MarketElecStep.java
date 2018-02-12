package yandexhw.steps;

import yandexhw.pages.MarketElec;
import ru.yandex.qatools.allure.annotations.Step;


public class MarketElecStep extends BaseSteps {

    @Step("Выбор вида электроники {0}")
    public void setElecButtStep(String elecItem) {
    new MarketElec(getDriver()).setElecButt(elecItem);
    }
}
