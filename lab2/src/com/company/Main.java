package com.company;
import com.Phone.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private phone arr[] = new phone[2];
    Main(){
        this.arr = this.getArr();
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Arrays.toString(main.arr));
        main.getScore();
        main.getOutside();
        main.getCity();
    }

    public phone[] getArr() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length;i++){
            arr[i] = new phone(1,"a" ,"b" ,"c",
                               2,3,4);
            System.out.printf("Абонент №%d\n",i+1);
            System.out.println("Введіть id: ");
            arr[i].setId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Введіть прізвище: ");
            arr[i].setSurname(scanner.nextLine());
            System.out.println("Введіть ім'я: ");
            arr[i].setName(scanner.nextLine());
            System.out.println("Ввведіть побатькові: ");
            arr[i].setNamedad(scanner.nextLine());
            System.out.println("Введіть номер рахунку: ");
            arr[i].setNumberscore(scanner.nextInt());
            System.out.println("Час міських розмов: ");
            arr[i].setTimecity(scanner.nextInt());
            System.out.println("Час міжміських розмов: ");
            arr[i].setTimeoutside(scanner.nextInt());
        }
        return arr;
    }

    public  phone[] getScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("\nВведіть номер нижнього діапазону: ");
        int low = scanner.nextInt();

        System.out.println("Введіть номер верхнього діапазону: ");
        int up = scanner.nextInt();

        System.out.print("Список абонентів, які попали у діапазон: ");
        ArrayList<phone> Score = new ArrayList<phone>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNumberscore() >= low && arr[i].getNumberscore() <= up) {
                Score.add(arr[i]);
            }
            else{
                System.out.printf("\nАбонент №%d не попав у діапазон:(",i+1);
            }
        }
        System.out.println(Arrays.toString(Score.toArray()));
        return arr;
    }

    public  phone[] getOutside(){
        System.out.println("----------------------------------------");
        System.out.println("Цей(ці) абонент користується міжміським зв'язком: ");
        ArrayList<phone> Outside = new ArrayList<phone>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTimeoutside() > 0) {
                Outside.add(arr[i]);
            }
        }
        System.out.println(Arrays.toString(Outside.toArray()));
        return arr;

    }

    public  phone[] getCity(){
        System.out.println("----------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть час міських розмов: ");
        int time = scanner.nextInt();

        System.out.println("Цей(ці) абонент перевищує заданий ліміт: ");
        ArrayList<phone> City = new ArrayList<phone>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTimecity() > time) {
                City.add(arr[i]);
            }
            else{
                System.out.printf("\nАбонент №%d не перевищив ліміт:)",i+1);
            }
        }
        System.out.println(Arrays.toString(City.toArray()));
        return arr;

    }

}
