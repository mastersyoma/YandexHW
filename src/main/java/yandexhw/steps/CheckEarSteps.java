package yandexhw.steps;

import yandexhw.pages.CheckEar;
import ru.yandex.qatools.allure.annotations.Step;

import static yandexhw.steps.BaseSteps.getDriver;

public class CheckEarSteps {
    @Step ("проверено количество элементов на странице, {0}")
    public void checkCountElementsStep(String expected) {
        new CheckEar(getDriver()).checkCountElementsEar(expected);
    }

    @Step("запомнено первое значение в списке")
    public void firstPageElementStep() {
        new CheckEar(getDriver()).firstPageElement();
    }

    @Step("поиск товара")
    public void searchFirstElementStep () {
        new CheckEar(getDriver()).searchFirstElement();
    }
}

