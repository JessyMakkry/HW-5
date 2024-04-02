public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        char clientOS = 0; // 0 - IOS, 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Task 2");
        short clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Task 3");
        int year = 2021;
        byte testYear4 = (byte) ((year-1584) % 4);
        byte testYear100 = (byte) ((year - 1584) % 100);
        short testYear400 = (short) ((year - 1584) % 400);
        if (year < 1584) {
            System.out.println("Год не является високосным");
        } else if (testYear400 == 0) {
            System.out.println("Год является високосным");
        } else if (testYear100 == 0) {
            System.out.println("Год не является високосным");
        } else if (testYear4==0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        System.out.println("Task 4");
        int deliveryDistance = 95;
        if (deliveryDistance<=20) {
            System.out.println("Доставка займет сутки");
        } else if (deliveryDistance<60) {
            System.out.println("Доставка займет двое суток");
        } else if (deliveryDistance<100) {
            System.out.println("Доставка займет трое суток");
        } else {
            System.out.println("Доставка не может быть осуществима");
        }
        System.out.println("Task 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц осенний");
                break;
            default:
                System.out.println("Месяц введен некорректно");
        }
    }
}