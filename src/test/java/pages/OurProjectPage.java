package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class OurProjectPage {
    private SelenideElement projects = $(".b-homepage-our-projects__projects"),
            tabsContent = $(".b-homepage-our-projects__tabs-content");

    public void projectsSection(){
        $(".b-homepage-our-projects").hover();
    }
    public void supplierHoReCa() {
        projects.find(byText("Поставщик крупнейших сетей HoReCa")).click();
        tabsContent.shouldHave(text("Информационные решения КРОК — особенная приправа для российской пищевой отрасли"));
    }

    public void industryDigitalization() {
        projects.find(byText("Лидер добывающей промышленности по цифровизации")).click();
        tabsContent.shouldHave(text("Добавили нефтяным месторождениям интеллекта"));
    }

    public void topThreeRetailers() {
        projects.find(byText("Компания из ТОП-3 ритейлеров России")).click();
        tabsContent.shouldHave(text("«Застраховали» инфраструктуру торговой сети от рисков"));
    }

    public void leadingOperator() {
        projects.find(byText("Ведущий оператор сети коммерческих дата-центров")).click();
        tabsContent.shouldHave(text("Помогли вырастить экосистему московских дата-центров"));
    }

    public void steelIndustry() {
        projects.find(byText("Одна из крупнейших компаний металлургической отрасли")).click();
        tabsContent.shouldHave(text("Снизили риск брака с помощью озера данных"));
    }

    public void goToTop() {
        $("#goToTop").click();
    }
}