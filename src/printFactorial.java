import java.util.Scanner;

public class printFactorial {
    public static void main(String[] args){
        // get user input
        int x = 0;
        int result = 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        x = keyboard.nextInt();

        // calculate and display factorial
        if(x>1){
            for(int i=1; i<=x; i++){
                result *= i;
            }
            System.out.println("The factorial of " + x + " is " + result);
        }else
            System.out.println("The factorial of " + x + " is " + result);


    }
}
