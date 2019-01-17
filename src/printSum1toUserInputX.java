import java.util.Scanner;

public class printSum1toUserInputX {
    public static void main(String[] args){
        int x = -1;
        int total = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        x = keyboard.nextInt();
        for(int i=1; i<=x; i++)
            total += i;
        System.out.println(total);
    }
}
