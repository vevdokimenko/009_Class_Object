package practice;

import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Opel", "Astra G", 2007, "black", 5000, "AP1679EH"));
        cars.add(new Car(2, "Nissan", "Almera", 2008, "black", 4800, "AP1985EH"));
        cars.add(new Car(3, "Honda", "Civic", 2010, "white", 6200, "AP1238EH"));
        cars.add(new Car(4, "Chevrolet", "Lacetti", 2007, "black", 6300, "AP5874EH"));
        cars.add(new Car(5, "Toyota", "RAV4", 2002, "grey", 6800, "AP0322HT"));
        cars.add(new Car(6, "Mitsubishi", "Lancer GL", 2004, "grey", 5000, "AP2569EH"));
        cars.add(new Car(1, "Opel", "Astra G", 2007, "black", 5000, "AP1679EH"));

        Scanner sc = new Scanner(System.in);
        String input;

        loop:
        while (true) {
            menuShow();
            input = sc.nextLine();
            switch (input) {
                case "1":
                    showCarsList(cars);
                    break;
                case "2":
                    System.out.println("Введите n: ");
                    try {
                        cars = getCarsNthYear(cars, new Scanner(System.in).nextInt());
                        showCarsList(cars);
                    } catch (Exception e) {
                        System.err.println("Введите число!");
                    }
                    break;
                case "3":
                    System.out.println("Введите цену: ");
                    try {
                        cars = getCarsNthPrice(cars, new Scanner(System.in).nextInt());
                        showCarsList(cars);
                    } catch (Exception e) {
                        System.err.println("Введите число!");
                    }
                    break;
                case "4":
                    System.out.println(getEqualCarsNumber(cars));
                    break;
                default:
                    break loop;
            }
        }
    }

    private static void menuShow() {
        String menu =   "Выберите действие:\n";
        menu +=         "1) список марок автомобилей\n";
        menu +=         "2) список автомобилей, которые эксплуатируются больше n лет\n";
        menu +=         "3) список автомобилей заданного года выпуска, цена которых больше указанной\n";
        menu +=         "4) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив)";
        System.out.println(menu);
    }

    private static void showCarsList(ArrayList<Car> list) {
        for (Car item : list) {
            System.out.println(item);
        }
    }

    private static ArrayList<Car> getCarsNthPrice (ArrayList<Car> list, int price) {
        ArrayList<Car> newList = new ArrayList<>();
        for (Car item : list) {
            if (item.getPrice() > price) {
                newList.add(item);
            }
        }
        return newList;
    }

    private static ArrayList<Car> getCarsNthYear (ArrayList<Car> list, int year) {
        ArrayList<Car> newList = new ArrayList<>();
        for (Car item : list) {
            if (Year.now().getValue() - item.getYear() > year) {
                newList.add(item);
            }
        }
        return newList;
    }

    private static int getEqualCarsNumber(ArrayList<Car> list) {
        Car car = list.get(0);
        int result = 0;
        for (Car item : list) {
            if (car.equals(item))
                result++;
        }
        return result;
    }
}
