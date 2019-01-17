import java.util.Scanner;

public class print1toUserInputX {
    public static void main(String [] args){
        int x = -1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        x = keyboard.nextInt();
        for(int i=1; i <= x; i++)
            System.out.println(i);
    }
}
