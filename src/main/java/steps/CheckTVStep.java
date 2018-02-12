package steps;

import pages.CheckTV;
import ru.yandex.qatools.allure.annotations.Step;

public class CheckTVStep extends BaseSteps{

    @Step ("проверено количество элементов на странице, {0}")
    public void checkCountElementsStep(String expected) {
        new CheckTV(getDriver()).checkCountElementsTV(expected);
    }

    @Step("запомнено первое значение в списке")
    public void firstPageElementStep() {
        new CheckTV(getDriver()).firstPageElement();
    }

    @Step("поиск товара")
    public void searchFirstElementStep () {
        new CheckTV(getDriver()).searchFirstElement();
    }
}
