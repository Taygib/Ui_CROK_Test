package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    private SelenideElement newsHeader = $(".b-homepage-news__header"),
            newsItem = $("a.b-homepage-news__item");

    public void newsSection() {
        $(".b-homepage-news__wrapper").hover();
        newsHeader.find(byText("Новости"));
    }

    public void openAllNews() {
        newsHeader.find(byText("Все новости")).hover();
        newsHeader.find(byText("Все новости")).click();
    }

    public void news1() {
        newsItem.hover();
        newsItem.click();
    }

    public void news2() {
        newsItem.sibling(0).hover();
        newsItem.sibling(0).click();
    }

    public void news3() {
        newsItem.sibling(1).hover();
        newsItem.sibling(1).click();
    }

    public void goToTop() {
        $("#goToTop").click();
    }
}