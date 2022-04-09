package app;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeApp {
    static Scanner scanner = new Scanner(System.in);
    int count = 0;

    public static void main(String[] args) {
        System.out.println("Podaj datę w formacie yyyy-mm-dd");
        String str = scanner.nextLine();
        final LocalDate date = LocalDate.parse(str);
        final LocalDate now = LocalDate.now();
        final Period period = Period.between(date, now);
        System.out.println(period.getYears() + " lata " + period.getMonths() + " miesiecy " + period.getDays() + " dni");
    }
}
