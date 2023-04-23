package ru.itgirl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели на английском: ");
        String weekday = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(weekday);
            System.out.println(day.getRussianName());
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректное название дня недели!");
        }
    }
}
