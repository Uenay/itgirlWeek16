package ru.itgirl;

public enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private String russianName;

    Day(String russianName) {
        this.russianName = russianName;
    }
    public String getRussianName() {
        return russianName;
    }
}
