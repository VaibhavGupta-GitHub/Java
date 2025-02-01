/* JAVA Lecture 07 */

// Functions & Methods

/*
01. Print a given name in a function.         
*/

// import java.util.*;

// class Functions {
//     public static void printMyName (String name) {
//         System.out.println(name);
//         return;
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Name : ");
//         String name = sc.nextLine();

//         printMyName(name);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
02. Make a function to add two numbers and return their sum.         
*/

// import java.util.*;

// class Functions {
//     public static int sum (int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number a : ");
//         int a = sc.nextInt();
//         System.out.println("Enter Number b : ");
//         int b = sc.nextInt();

//         int sum = sum(a, b);
//         System.out.println("Sum of a and b is : ");
//         System.out.println(sum);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
03. Make a function to multiply two numbers and return their product.         
*/

// import java.util.*;

// class Functions {
//     public static int calculateProduct (int a, int b) {
//         return a * b;
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number a : ");
//         int a = sc.nextInt();
//         System.out.println("Enter Number b : ");
//         int b = sc.nextInt();
//         
//         System.out.println("Product of a and b is : " + calculateProduct(a, b));
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
04. Make a function to find factorial of a number.         
*/

// import java.util.*;

// class Functions {
//     public static void factorial (int n) {
//         int Factorial = 1;
//         for (int i=n; i>=1; i--) {
//             Factorial = Factorial * i;
//         }
//         System.out.println(Factorial);
//         return;
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number n : ");
//         int n = sc.nextInt();
//         System.out.println("Factorial of n is : ");
//         factorial(n);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
05. Make a function to check if a number is prime or not.         
*/

// import java.util.*;

// class Functions {
//     public static void checkPrime (int n) {
//         int count = 0;
//         for (int i=1; i<=n; i++) {
//             if (n%i==0) {
//                 count++;
//             }
//         }
//         if (count==2) {
//             System.out.println(n + " is prime");
//         } else {
//             System.out.println(n + " is not prime");
//         }    
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number n : ");
//         int n = sc.nextInt();
//         checkPrime(n);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
06. Make a function to check if a given number n is even or not.         
*/

// import java.util.*;

// class Functions {
//     public static void checkEven (int n) {
//         if (n%2==0) {
//             System.out.println(n + " is even");
//         } else {
//             System.out.println(n + " is not even");
//         }  
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number n : ");
//         int n = sc.nextInt();
//         checkEven(n);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
07. Make a function to print the table of a given number n.         
*/

// import java.util.*;

// class Functions {
//     public static void printTable (int n) {
//         System.out.println("Table of " + n + " is ");
//         for (int i=1; i<=10; i++) {
//             System.out.println(n*i);
//         }
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number n : ");
//         int n = sc.nextInt();
//         printTable(n);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
08. Enter 3 numbers from the user & make a function to print their average.         
*/

// import java.util.*;

// class Functions {
//     public static int calculateAverage (int x, int y, int z) {
//         int average = (x + y + z) / 3;
//         return average;
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number x : ");
//         int x = sc.nextInt();
//         System.out.println("Enter Number x : ");
//         int y = sc.nextInt();
//         System.out.println("Enter Number x : ");
//         int z = sc.nextInt();
//         System.out.println("Average of x, y, z is : " + calculateAverage(x, y, z));
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
09. Write a function to print the sum of all odd numbers from 1 to n.         
*/

// import java.util.*;

// class Functions {
//     public static int sumOfNOddNumbers (int n) {
//         int sum = 0;
//         for (int i=1; i<=n; i++) {
//             if (i % 2 != 0) {
//                 sum = sum + i;
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number n : ");
//         int n = sc.nextInt();
//         System.out.println("The sum of all odd numbers from 1 to n is : " + sumOfNOddNumbers(n));
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
10. Write a function which takes in 2 numbers and returns the greater of those
two.         
*/

// import java.util.*;

// class Functions {
//     public static int findGreater (int x, int y) {
//         if ( x > y ) {
//             return x;
//         } else {
//             return y;
//         }
        
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number x : ");
//         int x = sc.nextInt();
//         System.out.println("Enter Number y : ");
//         int y = sc.nextInt();
//         System.out.println("The greater of x and y is " + findGreater(x, y));
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
11. Write a function that takes in age as input and returns if that person is eligible
to vote or not.
A person of age > 18 is eligible to vote.         
*/

// import java.util.*;

// class Functions {
//     public static void checkEligibility (int age) {
//         if (age >= 18) {
//             System.out.println("Person is eligible to vote");
//         } else {
//             System.out.println("Person is not eligible to vote");
//         }
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Age of person : ");
//         int age = sc.nextInt();
        
//         checkEligibility(age);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
12. Write an infinite loop using do while condition.         
*/

// class Functions {
//     public static void main(String[] args) {
//         int i = 1;
//         do {
//             System.out.println("Infinite loop");
//             i++;
//         } while (i > 1);
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
13. Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered.         
*/

// import java.util.*;

// class Functions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         char choice;
//         int positivecount = 0;
//         int negativecount = 0;
//         int zeroscount = 0;

//         do {
//             System.out.println("Enter an integer valuer : ");
//             int n = sc.nextInt();

//             if (n>0) {
//                 positivecount++;
//             } else if (n<0) {
//                 negativecount++;
//             } else {
//                 zeroscount++;
//             }

//             System.out.println("Wanna continue (y/n)");
//             choice = sc .next().charAt(0);

//         } while (choice == 'y' || choice == 'Y');
        
//         System.out.println("Positive count : " + positivecount);
//         System.out.println("Negative count : " + negativecount);
//         System.out.println("Zeros count : " + zeroscount);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
14. Two numbers are entered by the user, x and n. Write a function to find
the value of one number raised to the power of another i.e. 𝑥 to the power n .          
*/

// import java.util.*;

// class Functions {
//     public static int calculatePower (int x, int n) {
//         int power = x;
//         for (int i=1; i<n; i++) {
//         power = power*x;
//         }
//         return power;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter x : ");
//         int x = sc.nextInt();
//         System.out.println("Enter n : ");
//         int n = sc.nextInt();
        
//         int xTTPn = calculatePower(x, n);
//         System.out.println("X to the power N is : " + xTTPn);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
15. Write a function that calculates the Greatest Common Divisor of 2 numbers.          
*/

// import java.util.*;

// class Functions {
//     public static int GCD (int a, int b) {
//         while (b!=0) {
//             int temp = b;
//             b = a%b;
//             a = temp;
//         }   
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a : ");
//         int a = sc.nextInt();
//         System.out.println("Enter b : ");
//         int b = sc.nextInt();
        
//         int gcd = GCD(a, b);
//         System.out.println("The GCD of "+a+" and "+b+" is "+ gcd);
//         sc.close();
//     }
// }




/* JAVA Lecture 07 */

// Functions & Methods

/*
16. Write a program to print Fibonacci series of n terms where n is input
by user          
*/

// import java.util.*;

// class Functions {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n : ");
//         int n = sc.nextInt();

//         int fib1 = 0;
//         int fib2 = 1;
        
//         for (int i=1; i<=n; i++) {
//             System.out.print(fib1+" ");
//             int fib = fib1 + fib2;
//             fib1 = fib2;
//             fib2 = fib;
//         }
//         sc.close();
//     }
// }