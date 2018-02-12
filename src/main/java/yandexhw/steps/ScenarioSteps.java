package yandexhw.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    YaMainStep yaMainStep = new YaMainStep();
    MarketMainStep marketMainStep = new MarketMainStep();
    MarketElecStep marketElecStep = new MarketElecStep();
    MarketSearchStep marketSearchStep = new MarketSearchStep();
    CheckTVStep checkTVStep = new CheckTVStep();
    CheckEarSteps checkEarSteps = new CheckEarSteps();

    @When(value = "^выбран элемент главного меню \"(.+)\"$")
    public void setYaButt(String mainMenuItem) {
        yaMainStep.setYaButtStep(mainMenuItem);
    }

    @When("^выбран элемент меню \"(.+)\"$")
    public void setMarketButt(String menuItem) {
        marketMainStep.setMarketButtStep(menuItem);
    }

    @When("^выбрана категория товара \"(.+)\"$")
    public void setElecButt(String elecItem) {
        marketElecStep.setElecButtStep(elecItem);
    }

    @When("^заполнен фильтр цены от \"(.+)\"$")
    public void setPriceFrom(String price) {
        marketSearchStep.setPriceFromStep(price);
    }

    @When("^заполнен фильтр производителей товара \"(.+)\"$")
    public void setLabel(String labelItem) {
        marketSearchStep.setLabelStep(labelItem);
    }

    @When("^нажата кнопка применения фильтров")
    public void setButton() {
        marketSearchStep.setButtonStep();
    }

    @Then("^проверено число телевизоров на странице, которое должно быть равно \"(.+)\"$")
    public void checkCountElementsTV(String expected) {
        checkTVStep.checkCountElementsStep(expected);
    }

    @Then("^проверено число наушников на странице, которое должно быть равно \"(.+)\"$")
    public void checkCountElementsEar(String expected) {
        checkEarSteps.checkCountElementsStep(expected);
    }

    @Then("^запомнено название первого телевизора в списке")
    public void rememberFirstTV() {
        checkTVStep.firstPageElementStep();
    }

    @Then("^запомнено название первых наушников в списке")
    public void rememberFirstEP() {
        checkEarSteps.firstPageElementStep();
    }

    @When("^произведен поиск по первому телевизору")
    public void searchTV() {
        checkTVStep.searchFirstElementStep();
    }

    @When("^произведен поиск по первым наушникам")
    public void searchEarphone() {
        checkEarSteps.searchFirstElementStep();
    }
}
