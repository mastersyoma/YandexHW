package steps;

import pages.YaMain;
import ru.yandex.qatools.allure.annotations.Step;


public class YaMainStep extends BaseSteps {

    @Step ("Выбран раздел {0}")
    public void setYaButtStep(String mainMenuItem) {
        new YaMain(getDriver()).setYaButt(mainMenuItem);
    }
}