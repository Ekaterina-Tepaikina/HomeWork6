public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (byte i = 1; i<11; i++) {
            System.out.println(i);
        }
        //Задача 2
        for (byte i = 10; i>0; i--) {
            System.out.println(i);
        }
        //Задача 3
        for (int i = 0; i<18; i=i+2) {
            System.out.println(i);
        }
        //Задача 4
        for (byte i = 10; i>-11; i--){
            System.out.println(i);
        }
        //Задача 5
        for (int i = 1904; i<2097; i=i+4) {
            System.out.println(i + " год является високосным");
        }
        //Задача 6
        for (int i = 7; i<99; i = i+7) {
            System.out.println(i);
        }
        //Задача 7
        for (int i = 1; i<513; i = i*2) {
            System.out.println(i);
        }
        //Задача 8
        int deposit = 29000;
        int total = 0;
        for (byte i = 1; i<13; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+total+" рублей.");
        }
    }
}