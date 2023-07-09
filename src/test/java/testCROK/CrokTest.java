package testCROK;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import data.ContentSections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class CrokTest extends TestBase {

    @Test
    void menu() {

        step("кликнуть на меню =О компании=", () -> {
            clickOnMenu.clickOnAboutCompany();
        });

        Selenide.back();

        step("кликнуть на меню =Отрасли=", () -> {
            clickOnMenu.industries();
        });

        Selenide.back();

        step("кликнуть на меню =Медиацентр=", () -> {
            clickOnMenu.mediaCenter();
        });

        Selenide.back();

        step("кликнуть на меню =Карьера=", () -> {
            clickOnMenu.career();
        });

        Selenide.back();
    }

    @Test
    void search() {

        String firstSearch = "география";
        String secondSearch = "газ";
        String dayFrom = "7";
        String monthFrom = "04";
        String yearFrom = "2005";
        String dayEnd = "15";
        String monthEnd = "09";
        String yearEnd = "2018";

        step("Поисковик на главной странице", () -> {
            search.searchOnMainPage(firstSearch);
        });

        step("Результат поиска =" + firstSearch + "=", () -> {
            search.result(firstSearch);
        });

        step("Сменить поиск в поисковой строке на =" + secondSearch + "=", () -> {
            search.changeSearch(firstSearch, secondSearch);
        });

        step("Устанока даты новостной ленты ОТ", () -> {
            search.setDateFrom(dayFrom, monthFrom, yearFrom);
        });

        step("Устанока даты новостной ленты ДО", () -> {
            search.setDateEnd(dayEnd, monthEnd, yearEnd);
        });

        step("Применить условие поиска", () -> {
            search.applySearchCondition();
        });

        step("Проверка уствновленной даты ОТ и ДО", () -> {
            search.verifySelected("Выбрано", dayFrom + "/" + monthFrom + "/" + yearFrom + "-" + dayEnd + "/" + monthEnd
                    + "/" + yearEnd);
        });

        step("Нажать на кнопку Найти", () -> {
            search.buttonFind();
        });

        step("Результат поиска =" + secondSearch + "=", () -> {
            search.result(secondSearch);
        });
    }

    static Stream<Arguments> sections() {
        return Stream.of(
                Arguments.of(ContentSections.IT_INFRASTRUCTURE, List.of(
                        "Обследование и построение ИТ-инфраструктуры", "Разработка концепции развития ИТ",
                        "Обеспечение непрерывной работы", "Облачные сервисы")),
                Arguments.of(ContentSections.BUSINESS_SOLUTIONS, List.of(
                        "Реализация сценариев масштабной цифровой трансформации", "Подбор и внедрение ИТ-решений",
                        "Разработка кастомных решений", "Интеграция информационных систем")),
                Arguments.of(ContentSections.DATA_CENTERS, List.of(
                        "Предпроектные работы", "Проектирование и реализация",
                        "Сертификация объекта", "Эксплуатация и сервисная поддержка")),
                Arguments.of(ContentSections.SERVICE_MAINTENANCE, List.of(
                        "Базовый сервис", "Гарантийное обслуживание", "Мониторинг", "Аутсорсинг", "Комплексный сервис"))
        );
    }

    @MethodSource
    @ParameterizedTest
    void sections(ContentSections menuSection, List<String> expectedButtons) {

        step("Название функции в подменю", () -> {
        sectionsContent.content(menuSection.toString(), expectedButtons);
        });
    }


    @Test
    void news() {
        Configuration.holdBrowserOpen = true;

        step("Переход к новостному разделу", () -> {
            news.newsSection();
        });

        step("Открыть все новости", () -> {
            news.openAllNews();
        });

        Selenide.back();

        step("Открыть новость №1", () -> {
            news.news1();
        });

        Selenide.back();

        step("Открыть новость №2", () -> {
            news.news2();
        });

        Selenide.back();

        step("Открыть новость №3", () -> {
            news.news3();
        });

        Selenide.back();

        step("Вернуться в исходное положение страницы", () -> {
            news.goToTop();
        });
    }

    @Test
    void ourProject() {
        Configuration.holdBrowserOpen = true;

        step("Переход разделу проекты", () -> {
            ourProject.projectsSection();
        });

        step("Открыть первый проект =Поставщик крупнейших сетей HoReCa=", () -> {
            ourProject.supplierHoReCa();
        });

        step("Открыть второй проект =Лидер добывающей промышленности по цифровизации=", () -> {
            ourProject.industryDigitalization();
        });

        step("Открыть третий проект =Компания из ТОП-3 ритейлеров России=", () -> {
            ourProject.topThreeRetailers();
        });

        step("Открыть четвёртый проект =Ведущий оператор сети коммерческих дата-центров=", () -> {
            ourProject.leadingOperator();
        });

        step("Открыть пятый проект =Одна из крупнейших компаний металлургической отрасли=", () -> {
            ourProject.steelIndustry();
        });

        step("Вернуться в исходное положение страницы", () -> {
            ourProject.goToTop();
        });
    }

    @Test
    void specialProjects() {
        Configuration.holdBrowserOpen = true;

        step("Переход разделу проекты", () -> {
            specialProjects.specialProjectsSection();
        });

        step("Пролестать проекты в лево 6 раз", () -> {
            specialProjects.clickLeft();
            sleep(300);
            specialProjects.clickLeft();
            sleep(300);
            specialProjects.clickLeft();
            sleep(300);
            specialProjects.clickLeft();
            sleep(300);
            specialProjects.clickLeft();
            sleep(300);
            specialProjects.clickLeft();
            sleep(300);
        });

        step("Пролестать проекты в право 6 раз", () -> {

            specialProjects.clickRight();
            sleep(300);
            specialProjects.clickRight();
            sleep(300);
            specialProjects.clickRight();
            sleep(300);
            specialProjects.clickRight();
            sleep(300);
            specialProjects.clickRight();
            sleep(300);
            specialProjects.clickRight();
            sleep(300);
        });

        step("Вернуться в исходное положение страницы", () -> {
            specialProjects.goToTop();
        });
    }
}