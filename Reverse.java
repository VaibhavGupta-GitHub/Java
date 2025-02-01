//WAP to print reverse of a number and also 
//check if the number is palindrome or not.

import java.util.*;

class ReverseAndPalindrome {
    static int Reverse_n(int n) {
        int rev = 0;
        while (n>0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n, rev_n;
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        rev_n = Reverse_n(n);

        System.out.println("Reverse of n is " + rev_n);

        if (rev_n == n) {
            System.out.println("N is palindrome");
        } else {
            System.out.println("N is not palindrome");
        }

        sc.close();
    }
}