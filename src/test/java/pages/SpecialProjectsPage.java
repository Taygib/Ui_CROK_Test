package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SpecialProjectsPage {
    public void specialProjectsSection() {
        $(".b-homepage-spec-projects").find(byText("Спецпроекты")).scrollTo();
    }

    public void clickLeft() {
        $(".b-homepage-spec-projects__navigation-prev").click();
    }

    public void clickRight() {
        $(".b-homepage-spec-projects__navigation-next").click();
    }

    public void goToTop() {
        $("#goToTop").click();
    }
}