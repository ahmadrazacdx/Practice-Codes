package Practice;
import java.util.Scanner;
public class switchclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick up single number Between"+"\n"+"1 and 3 To Try your luck:");
        int button = sc.nextInt();
        switch (button) {
            case 1 -> System.out.println("You will Pass!");
            case 2 -> System.out.println("You will Fail!");
            case 3 -> System.out.println("You will be terminated!");
            default -> System.out.println("You picked invalid number!");

            //Syntax
            // take variable in any data type. e.g;
            //int x;
            // switch (x){
            // case 1 -> //_______
            // case 2 -> //_______
            // case 3 -> //_______
            // default -> //______-
        }
    }
}