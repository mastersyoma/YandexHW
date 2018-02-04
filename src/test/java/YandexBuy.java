import org.junit.Test;
import pages.MarketElec;
import pages.MarketMain;
import pages.MarketSearch;
import pages.YaMain;

public class YandexBuy extends BaseTest{

    @Test
    public void yandexBuy () {

        driver.get(baseUrl);
        YaMain yaMain = new YaMain(driver);
        yaMain.setYaButt("Маркет");
        MarketMain marketMain = new MarketMain(driver);
        marketMain.setMarketButt("Электроника");
        MarketElec marketElec = new MarketElec(driver);
        marketElec.setElecButt("Телевизоры");
        MarketSearch marketSearch = new MarketSearch(driver);
        marketSearch.setPriceFrom("20000");
        marketSearch.setLabel("Samsung");
        marketSearch.setLabel("LG");
        marketSearch.setButton();








    }

}
