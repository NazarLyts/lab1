package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

/**@author Луцишин Назарій
 * @version 2.1
 **/

public class Main {
    /**Поле масив списків усіх чисел**/
    ArrayList<Integer> AllInterval = new ArrayList<Integer>();
    /**Поле парних чисел**/
    ArrayList<Integer> PairElements = new ArrayList<Integer>();
    /**Поле непарних чисел**/
    ArrayList<Integer> OddElements = new ArrayList<Integer>();
    public static void main(String[] args) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int[] intervals = main.GetInterval(scanner);

        main.intervals(intervals);
        System.out.println(main.AllInterval);

        main.pair();
        Collections.sort(main.PairElements, Collections.reverseOrder());
        System.out.println(main.PairElements);

        main.odd();
        System.out.println(main.OddElements);

        main.sumpair();
        main.sumodd();

        Fibonachi fibonachi = new Fibonachi(main.OddElements.get(main.OddElements.size()-1),
                main.PairElements.get(main.PairElements.size()-1));
        int length = main.lengthfib(scanner);
        fibonachi.CreatNumber(length);
        fibonachi.resultfibonachi();

        ArrayList<Integer> Fibper = fibonachi.resultfibonachi();
        main.fibper(Fibper);

    }

    /***
     * Метод у якому ми зчитуємо з клавіатури інтервал
     * @param in змінна для зчитування інтервалу
     * @return Повертає інтервал
     */
    public int[] GetInterval(Scanner in) {
        int intervals[] = new int[2];
        System.out.print("enter intervals:  ");
        intervals[0] = in.nextInt();
        System.out.print("enter intervals:  ");
        intervals[1] = in.nextInt();
        return intervals;

    }

    /***
     * Метод який додає числа у список
     * @param intervals інтервал
     */
    public void intervals(int intervals[]) {
        for (int i = intervals[0]; i <= intervals[1]; i++) {
            AllInterval.add(i);

        }
    }

    /***
     * Метод який витягує з списку парні числа
     */
    public void pair(){
        System.out.println("Pair");
        for (int e : AllInterval) {
            if (e % 2 == 0) {
                PairElements.add(e);
            }
        }
    }

    /***
     * Метод який витягує з списку непарні числа
     */
    public void odd(){
        System.out.println("Odd");
        for (int e : AllInterval) {
            if (e % 2 != 0) {
                OddElements.add(e);
            }
        }
    }

    /***
     * Метод,який шукає суму парних
     */
    public void sumpair(){
        int sum = 0;
        for(int i = 0; i<PairElements.size(); i++){
            sum +=PairElements.get(i);
        }
        System.out.println("Sum pair: " + sum);
    }

    /***
     * Метод,який шукає суму непарних
     */
    public void sumodd(){
        int sum = 0;
        for(int e : OddElements){
            sum += e;
        }
        System.out.println("Sum odd: " + sum);
    }

    /***
     * Метод в якому користувач вводить довжину з клавіатури
     * @param lenfib змінна для зчитування довжини
     * @return довжину
     */
    public int lengthfib(Scanner lenfib){
        System.out.println("Enter length");
        int length = lenfib.nextInt();
        return length;

    }

    /***
     * Метод,що виводить відсоток парних і непарних чисел ряду фібоначчі
     * @param percent відсоток парних і непарних чисел
     */
    public void fibper(ArrayList<Integer>percent){
        double odd = 0;
        double pair = 0;
        for (int e : percent ) {
            if (e % 2 != 0) {
                odd++;
            }
            else {
                pair++;
            }
        }
        System.out.println("Odd: "+odd/percent.size()*100+"%");
        System.out.println("Pair: "+pair/percent.size()*100+"%");

    }

}
////////////////////////////////////////////////////////
//fib
class  Fibonachi{
    /**Поле Фібоначчі**/
    ArrayList<Integer> fibonachi = new ArrayList<Integer>();

    /***
     * Конструктор з двома параметрами
     * Два перші числа ряду фібоначчі
     * @param number1 перше число
     * @param number2 друге число
     */
    Fibonachi(int number1, int number2 ){
        this.fibonachi.add(number1);
        this.fibonachi.add(number2);
    }

    /***
     * Метод в якому ми генеруємо ряд фібоначчі і записуємо туди два перші числа
     * @param length довжина
     */
    public void CreatNumber(int length){
        for(int i=0; i<length; i++){
            this.fibonachi.add(this.fibonachi.get(this.fibonachi.size()-1)+this.fibonachi.get(this.fibonachi.size()-2));
        }
    }

    /***
     * Метод,який виводить ряд згенерований ряд фібоначчі
     * @return повертає ряд фібоначчі
     */
    public ArrayList<Integer> resultfibonachi() {
        ArrayList<Integer> result = new ArrayList(this.fibonachi);
        System.out.println(result);
        return result;
    }

}





