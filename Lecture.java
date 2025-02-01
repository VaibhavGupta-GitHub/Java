/*
1. Print star patern (Butterfly Pattern)
   *      *
   **    **
   ***  ***
   ********
   ********
   ***  ***
   **    **
   *      *    
*/

public class Lecture {
    public static void main(String[] args) {
        int n=4;
        //outter loop for upper pattern
        for (int i=1; i<=n; i++) {
            //inner loop for 1st pattern
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //inner loop for spaces
            for (int j=1; j<=(n-i)*2; j++) {
                System.out.print(" ");
            }
            //inner loop for 2nd pattern
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //outter loop for lower pattern
        for (int i=n; i>=1; i--) {
            //inner loop for 1st pattern
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //inner loop for spaces
            for (int j=1; j<=(n-i)*2; j++) {
                System.out.print(" ");
            }
            //inner loop for 2nd pattern
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }      
    }
}
