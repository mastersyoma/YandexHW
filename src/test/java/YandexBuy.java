import org.junit.Test;
import pages.MarketElec;
import pages.MarketMain;
import pages.MarketSearch;
import pages.YaMain;

public class YandexBuy extends BaseTest{

    @Test
    public void yandexBuy () {

        driver.get(baseUrl);
        YaMain yaMain = new YaMain();
        yaMain.setYaButt("Маркет");
        MarketMain marketMain = new MarketMain();
        marketMain.setMarketButt("Электроника");
        MarketElec marketElec = new MarketElec();
        marketElec.setElecButt("Телевизоры");
        MarketSearch marketSearch = new MarketSearch();
        marketSearch.setPriceFrom("20000");
        marketSearch.setLabel("Samsung");
        marketSearch.setLabel("LG");
        marketSearch.setButton();








    }

}
