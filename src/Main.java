public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        boolean clientOS = false;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("\nЗадание 2");
        boolean clientOS1 = false;
        int year1 = 2014;
        if (clientOS1) {
            if (year1 < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (year1 < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("\nЗадание 3");
        int year = 2021;
        int cly = year - 1584;
        if (cly % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("\nЗадание 4");
        int deliveryDistance = 95;
        int deliveryTimeCount = 1;
        if (deliveryDistance > 20) {
            deliveryTimeCount += 1;
            if (deliveryDistance > 60) {
                deliveryTimeCount += 1;
                if (deliveryDistance > 100) {
                    deliveryTimeCount += 1;
                }
            }
        }
        if (deliveryTimeCount == 4) {
            System.out.println("доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTimeCount);
        }

        System.out.println("\nЗадание 5");
        int monthNumber = 9;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println("зима");
                    break;
                case 3, 4, 5:
                    System.out.println("весна");
                    break;
                case 6, 7, 8:
                    System.out.println("лето");
                    break;
                case 9, 10, 11:
                    System.out.println("осень");
                    break;
            }
        }
    }
}
