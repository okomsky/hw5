public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS ==0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void  task3 () {
        System.out.println("Задача 3");
        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year +" является високосным");
        } else {
            System.out.println(year +" не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 65;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void task5() {
        System.out.println("Задача5");
        int monthNumber = 8;
        switch (monthNumber) {
            case 1 :
            case 2:
            case 12:
                System.out.println( monthNumber +" месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber +" месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber +" месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber +" месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println(monthNumber +"Некорректный месяц");
        }
    }
}