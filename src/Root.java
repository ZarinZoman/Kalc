/**
 * Created by Siarhei_Salodki on 29-Feb-16.
 */
import java.util.Scanner;
public class Root {
    double result;
    public void root(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Ведите  число");
        double first = scr.nextDouble();
        System.out.println("Введите степень");
        double second = scr.nextDouble();
        this.result = Math.pow(first, 1/second);
        System.out.println("Корень числа "+first+" степени "+second+" равен "+ this.result);
    }
    public void clianResult() {
        this.result = 0;
    }
}
