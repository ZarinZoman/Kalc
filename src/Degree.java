/**
 * Created by Siarhei_Salodki on 29-Feb-16.
 */

import java.util.Scanner;
public class Degree {
    double result;
    public void dgr(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Ведите  число");
        double first = scr.nextDouble();
        System.out.println("Введите степень");
        double second = scr.nextDouble();
        this.result = Math.pow(first, second);
        System.out.println("Число "+first+" в степени "+second+" равно "+ this.result);
    }
    public void clianResult() {
        this.result = 0;
    }
}
