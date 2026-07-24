import java.util.Scanner;
public class project_kiosk2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;
        project_kiosk1.showMenu();

        do {
            System.out.print("[ Type 'A' to Exit ]\nWhat's Your Order?: ");
            char food = sc.next().charAt(0);

            if (food == 'a' || food == 'A') {
                break;
            }

            if (food == 'F' || food == 'f') {
                project_kiosk1.pickFries();
                repeat = false;
            } else if (food == 'P' || food == 'p') {
                project_kiosk1.pickPizza();
                repeat = false;
            } else if (food == 'B' || food == 'b') {
                project_kiosk1.pickBurger();
                repeat = false;
            } else {
                System.out.print("\nInvalid Input, Please Try Again!!\n\n");
            }
        }while(repeat);
    }
}