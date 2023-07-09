package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MenuPage {
    private SelenideElement headerWrapper = $(".b-header__wrapper");

    public void clickOnAboutCompany() {
        headerWrapper.find(byText("О компании")).click();
    }

    public void industries() {
        headerWrapper.find(byText("Отрасли")).click();
    }

    public void mediaCenter() {
        headerWrapper.find(byText("Медиацентр")).click();
    }

    public void career() {
        headerWrapper.find(byText("Карьера")).click();
    }
}