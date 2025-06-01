public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        int age = 13;
        System.out.printf("Если возраст человека равен " + age + ", то ");
        if (age >= 18) System.out.println("он совершеннолетний");
        else System.out.println("он не достиг совершеннолетия, нужно немного подождать");

        System.out.println("\nЗадача 2");
        int temp = 6;
        System.out.printf("На улице " + temp + " градусов, ");
        if (temp < 5) System.out.println("нужно надеть шапку");
        else System.out.println("можно идти без шапки");

        System.out.println("\nЗадача 3");
        int speed = 61;
        System.out.printf("Если скорость " + speed + ", то");
        if (speed <= 60) System.out.println("можно ездить спокойно");
        else System.out.println("придется заплатить штраф");

        System.out.println("\nЗадача 4");
        int age1 = 13;
        System.out.printf("Если возраст человека равен " + age1 + ", то ему нужно ходить ");
        if (age1 >= 2 && age1 <= 6) System.out.println("в детский сад");
        if (age1 >= 7 && age <= 17) System.out.println("в школу");
        if (age1 >= 18 && age <= 24) System.out.println("в универ");
        if (age1 > 24) System.out.println("на работу");

        System.out.println("\nЗадача 5");
        int age2 = 13;
        System.out.println("Если возраст ребенка равен " + age2 + ", то ему ");
        if (age2 < 5) System.out.printf("нельзя кататься на аттракционе");
        if (age2 >= 5 && age2 < 14) System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        if (age2 >= 14) System.out.println("можно кататься на аттракционе в сопровождении взрослого");

        System.out.println("\nЗадача 6");
        int carLoad = 10;
        if (carLoad < 102) {
            if (carLoad < 60) System.out.println("есть сидячие места");
            else System.out.println("есть только стоячие места");
        } else System.out.println("мест нет");

        System.out.println("\nЗадача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            if (one > three) System.out.println("one");
            else System.out.println("three");
        } else if (two > three) System.out.println("two");
        else System.out.println("three");
    }
}
