/**
 * Created by Siarhei_Salodki on 29-Feb-16.
 */
import java.util.Scanner;
public class Division {
    double result;
    public void div(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Ведите первое число");
        double first = scr.nextDouble();
        System.out.println("Введите второе число");
        double second = scr.nextDouble();
        this.result = first/second;
        System.out.println("Отношение чисел "+first+" "+second+" равно "+ this.result);

    }
    public void clianResult() {
        this.result = 0;
    }
}
