package pages;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Chosen {

    public void verifySelected (String key, String value) {
        $("#selected").shouldHave(text(key),text(value));
    }
}