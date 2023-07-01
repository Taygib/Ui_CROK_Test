package testCROK;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CrokTest {

    @Test
    void menu() {

        open("https://www.croc.ru");

        $(".b-header__wrapper").find(byText("О компании")).click();
        Selenide.back();
        $(".b-header__wrapper").find(byText("Отрасли")).click();
        Selenide.back();
        $(".b-header__wrapper").find(byText("Медиацентр")).click();
        Selenide.back();
        $(".b-header__wrapper").find(byText("Карьера")).click();
        Selenide.back();
    }

    @Test
    void search() {
        open("https://www.croc.ru");

        // поисковик
        //поисковик в исходной странице
        $(".b-header__wrapper").$(".search-wrap").click();
        $(".suggestion").shouldHave(text("Популярное"));
        $("#searchField").setValue("география").pressEnter();
        //поисковик после поиска в исходной странице

        sleep(1000);

    }

    @Test
    void sections() { //параметризованный тест
        Configuration.holdBrowserOpen = true;
        open("https://www.croc.ru");

        $("#cookie-notice").find(byText("Спасибо, понятно")).click();

        //$(".b-homepage-hero__text").shouldHave(text("Технологический партнер"));


        $(".b-homepage-competence-center").$(".fadeInUp").find(byText("ИТ-ИНФРАСТРУКТУРА")).hover();
        $(".b-homepage-competence-center").$(".fadeInUp").find(byText("ИТ-ИНФРАСТРУКТУРА")).click();

        $(".b-homepage-competence-center").$(".fadeInUp").find(byText("БИЗНЕС-РЕШЕНИЯ")).hover();
        $(".b-homepage-competence-center").$(".fadeInUp").find(byText("БИЗНЕС-РЕШЕНИЯ")).click();

        $(".b-homepage-competence-center").$(".fadeInUp").find(byText("ДАТА-ЦЕНТРЫ")).hover();
        $(".b-homepage-competence-center").$(".fadeInUp").find(byText("ДАТА-ЦЕНТРЫ")).click();

        $(".b-homepage-competence-center").$(".fadeInUp").find(byText("СЕРВИСНОЕ ОБСЛУЖИВАНИЕ")).hover();
        $(".b-homepage-competence-center").$(".fadeInUp").find(byText("СЕРВИСНОЕ ОБСЛУЖИВАНИЕ")).click();

    }

    @Test
    void news() {
        Configuration.holdBrowserOpen = true;
        open("https://www.croc.ru");
        $("#cookie-notice").find(byText("Спасибо, понятно")).click();

        //новости
        $(".b-homepage-news__wrapper").hover();

        $(".b-homepage-news__header").find(byText("Новости"));

        $(".b-homepage-news__header").find(byText("Все новости")).hover();
        $(".b-homepage-news__header").find(byText("Все новости")).click();
        Selenide.back();

        $("a.b-homepage-news__item").hover();
        $("a.b-homepage-news__item").click();
        Selenide.back();

        $("a.b-homepage-news__item").sibling(0).hover();
        $("a.b-homepage-news__item").sibling(0).click();
        Selenide.back();

        $("a.b-homepage-news__item").sibling(1).hover();
        $("a.b-homepage-news__item").sibling(1).click();
        Selenide.back();

        $("#goToTop").click();
    }

    @Test
    void ourProject() {
        Configuration.holdBrowserOpen = true;
        open("https://www.croc.ru");
        $("#cookie-notice").find(byText("Спасибо, понятно")).click();


        $(".b-homepage-our-projects").hover();

        $(".b-homepage-our-projects__projects").find(byText("Поставщик крупнейших сетей HoReCa")).click();
        $(".b-homepage-our-projects__tabs-content").shouldHave(text("Информационные решения КРОК — особенная приправа для российской пищевой отрасли"));

        $(".b-homepage-our-projects__projects").find(byText("Лидер добывающей промышленности по цифровизации")).click();
        $(".b-homepage-our-projects__tabs-content").shouldHave(text("Добавили нефтяным месторождениям интеллекта"));

        $(".b-homepage-our-projects__projects").find(byText("Компания из ТОП-3 ритейлеров России")).click();
        $(".b-homepage-our-projects__tabs-content").shouldHave(text("«Застраховали» инфраструктуру торговой сети от рисков"));

        $(".b-homepage-our-projects__projects").find(byText("Ведущий оператор сети коммерческих дата-центров")).click();
        $(".b-homepage-our-projects__tabs-content").shouldHave(text("Помогли вырастить экосистему московских дата-центров"));

        $(".b-homepage-our-projects__projects").find(byText("Одна из крупнейших компаний металлургической отрасли")).click();
        $(".b-homepage-our-projects__tabs-content").shouldHave(text("Снизили риск брака с помощью озера данных"));

        $("#goToTop").click();
    }

    @Test
    void specialProjects() {
        Configuration.holdBrowserOpen = true;
        open("https://www.croc.ru");
        $("#cookie-notice").find(byText("Спасибо, понятно")).click();


        $(".b-homepage-spec-projects").find(byText("Спецпроекты")).scrollTo();


        //пролистывание влево
        $(".b-homepage-spec-projects__navigation-prev").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-prev").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-prev").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-prev").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-prev").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-prev").click();
        sleep(500);

        //пролистывание вправо
        $(".b-homepage-spec-projects__navigation-next").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-next").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-next").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-next").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-next").click();
        sleep(500);
        $(".b-homepage-spec-projects__navigation-next").click();
        sleep(500);

        $("#goToTop").click();

    }
}