package data;

public enum ContentSections {
    IT_INFRASTRUCTURE("ИТ-ИНФРАСТРУКТУРА"),
    BUSINESS_SOLUTIONS("БИЗНЕС-РЕШЕНИЯ"),
    DATA_CENTERS("ДАТА-ЦЕНТРЫ"),
    SERVICE_MAINTENANCE("СЕРВИСНОЕ ОБСЛУЖИВАНИЕ");
    private final String title;

    ContentSections(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}