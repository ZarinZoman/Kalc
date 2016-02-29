/**
 * Created by Siarhei_Salodki on 29-Feb-16.
 */
import java.util.Scanner;

public class Kalc {
    public static void main (String[] args){
        // создаем экземляры
        Scanner scr = new Scanner(System.in);
        Plus pls = new Plus();
        Minus min = new Minus();
        Multtiplay mult = new Multtiplay();
        Division div = new Division();
        Root rt = new Root();
        Degree deg = new Degree();

        try {
            String exit = "n";
            while (!exit.equals("y")){
                System.out.println("Выберите действие (+ - / * степень корень)");
                String operation = scr.nextLine();
                switch (operation) {
                    case "+":
                        pls.Plus();
                        pls.clianResult();
                        break;
                    case "-":
                        min.minus();
                        min.clianResult();
                        break;
                    case "/":
                        div.div();
                        div.clianResult();
                        break;
                    case "*":
                        mult.mpl();
                        mult.clianResult();
                        break;
                    case "степень":
                        deg.dgr();
                        deg.clianResult();
                        break;
                    case "корень":
                        rt.root();
                        rt.clianResult();
                        break;
                    default:
                        System.out.println("Операция не выбрана");
                        break;

                }
                System.out.println("Выход? (y/n)");
                exit = scr.nextLine();
            }
        }
        finally {
            scr.close();
        }
    }
}
