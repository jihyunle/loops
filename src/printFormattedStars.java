public class printFormattedStars {
    public static void main(String[] args) {

        // part 1
        System.out.println("i)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//            System.out.println("\t ********** \n");


        // part 2
        System.out.println("ii)");
        // outer loop to count rows
        for (int i = 1; i <= 5; i++) {
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // part 3
        System.out.println("iii)");
        // outer loop to count rows
        for (int i=1; i<=5; i++) {
            // inner loop to print spaces
            for (int j=5; j>i; j--) {
                System.out.print(" ");
                }
            // inner loop to print stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();

            }






        }
    }



