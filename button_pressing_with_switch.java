import java.util.*;
public class button_pressing_with_switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("You have 3 buttons in front of you. Press 1 for button 1, Press 2 for button 2, Press 3 for button 3: ");
        System.out.print("Press a button: ");
        int button = sc.nextInt();
        switch (button){
            case 1: System.out.println("Hello!");
            break;
            case 2: System.out.println("Namaskar!");
            break;
            case 3: System.out.println("Bonjour!");
            break;
            default: System.out.println("Invalid button!");
        }
    }
}