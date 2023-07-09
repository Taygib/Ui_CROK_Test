package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private SelenideElement fromDate = $("#fromDate"),
            endDate = $("#endDate");

    Chosen chosen = new Chosen();

    private SelenideElement searchResultsForm = $("#searchResultsForm");

    public void searchOnMainPage(String search) {
        $(".b-header__wrapper").$(".search-wrap").click();
        $(".suggestion").shouldHave(text("Популярное"));
        $("#searchField").setValue(search).pressEnter();
    }

    public void changeSearch(String search, String newSearch) {
        searchResultsForm.$("[value=" + search + "]").clear();
        searchResultsForm.$("[value=" + search + "]").setValue(newSearch);
    }

    public void setDateFrom(String day, String month, String year) {
        fromDate.clear();
        fromDate.setValue(day + "/" + month + "/" + year).click();
        fromDate.pressEnter();
    }

    public void setDateEnd(String day, String month, String year) {
        endDate.clear();
        endDate.setValue(day + "/" + month + "/" + year).click();
        endDate.pressEnter();
    }

    public void result(String value) {
        $(".search-result").$(withText(value));
    }

    public void applySearchCondition() {
        $(".filter-controls").find(byText("Применить")).click();
    }

    public void verifySelected(String key, String value) {
        chosen.verifySelected(key, value);
    }

    public void buttonFind() {
        $("#searchResultsForm").find(byText("Найти")).click();
    }
}