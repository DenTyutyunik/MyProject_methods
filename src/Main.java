import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int yearNumber = 2010;
        System.out.println(leapYear(yearNumber));

        // Task 2
        System.out.println("\nTask 2");
        int clientDeviceYear = LocalDate.now().getYear();
        int clientOS = 1;
        System.out.println(appVersionForDownload(clientDeviceYear, clientOS));

        // Task 3
        System.out.println("\nTask 3");
        int deliveryDistance = 95;
        System.out.println(deliveryTimeDays(deliveryDistance));
    }

    public static String leapYear(int number) {
        String payload;
        if (number >= 1584 && ((number % 4 == 0 && number % 100 != 0) || number % 400 == 0)) {
            payload = number + " год - високосный год";
        } else {
            payload = number + " год - невисокосный год";
        }
        return payload;
    }

    public static String appVersionForDownload(int clientDeviceYear, int clientOS) {
        String payload;
        if (clientDeviceYear > 2015) {
            payload = switch (clientOS) {
                case 0 -> "Установите версию приложения для iOS по ссылке";
                case 1 -> "Установите версию приложения для Android по ссылке";
                default -> "";
            };
        } else {
            payload = switch (clientOS) {
                case 0 -> "Установите облегченную версию приложения для iOS по ссылке";
                case 1 -> "Установите облегченную версию приложения для Android по ссылке";
                default -> "";
            };
        }
        return payload;
    }

    public static String deliveryTimeDays(int distance) {
        String payload;
        int deliveryTimeDays;
        if (distance < 20) {
            deliveryTimeDays = 1;
            payload = "Потребуется дней: " + deliveryTimeDays;
        } else if (distance >= 20 && distance < 60) {
            deliveryTimeDays = 2;
            payload = "Потребуется дней: " + deliveryTimeDays;
        } else if (distance >= 60 && distance < 100) {
            deliveryTimeDays = 3;
            payload = "Потребуется дней: " + deliveryTimeDays;
        } else {
            payload = "Доставки нет";
        }
        return payload;
    }
}
