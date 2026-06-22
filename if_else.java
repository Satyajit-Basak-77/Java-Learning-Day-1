import java.util.Scanner;
public class if_else {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        if (a > b){
            System.out.print("a is greater than b");
        }
        else{
            System.out.print("b is greater than a");
        }
    }   
}