// ** Java Lecture 04 **

// Loops

/*
For loop
*/

// class Loops {
//     public static void main(String[] args){
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Hello World");
//         }
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
For loop
01. Print numbers from 0 to 10.
*/

// class Loops {
//     public static void main(String[] args){
//         for (int i = 0; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
While loop
*/

// class Loops {
//     public static void main(String[] args){
//         int i = 0;
//         while(i <= 10) {
//             System.out.println(i);
//             i++ ;
//         }
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
do While loop
*/

// class Loops {
//     public static void main(String[] args){
//         int i = 0;
//         do {
//             System.out.println("Hello World");
//             i++;
//         } while (i<3);
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
02. Print the sum of first n natural numbers.
*/

// import java.util.Scanner;

// class Loops {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter N : ");
//         int n = sc.nextInt();
//         int sum = 0;

//         for (int i=1; i<=n; i++){
//             sum = i + sum;
//         }

//         System.out.println(sum);

//         sc.close();
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
03. Print the table of a number entered by the user
*/

// import java.util.Scanner;

// class Loops {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter N : ");
//         int n = sc.nextInt();

//         System.out.println("Table of " + n);
        
//         for (int i=1; i<=10; i++){
//             System.out.println(n*i);
//         }

//         sc.close();
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
04.  Print all even numbers till n.
*/

// import java.util.Scanner;

// class Loops {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter N : ");
//         int n = sc.nextInt();

//         System.out.println("All even numbers till " + n);
        
//         for (int i=1; i<=n; i++){
//             if(i%2 == 0){
//                 System.out.print(i + " ");
//             }
//         }

//         sc.close();
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
05. Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s
marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
*/

// import java.util.Scanner;

// class Loops {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n ;
        
//         do{
//             System.out.println("Enter marks of Student");
//             int marks = sc.nextInt();
//             if(marks >= 90) {
//                 System.out.println("This is Good");
//             } else if (89 >= marks && marks >= 60) {
//                 System.out.println("This is also Good");
//             } else if (59 >= marks && marks >= 0) {
//                 System.out.println("This is Good as well");
//             } 
//             System.out.println("to countinue enter '1', to stop enter '0'");
//             n = sc.nextInt();
//         } while (n == 1);
        

//         sc.close();
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
06. Print if a number is prime or not (Input n from the user).
*/

// import java.util.Scanner;

// class Loops {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n : ");
//         int n = sc.nextInt(); 
//         int count = 0;
//         for (int i=1; i<=n; i++) {
//             if(n % i == 0) {
//                 count++;
//             }
//         }
//         if (count == 2) {
//             System.out.println(n + " is prime");
//         } else {
//             System.out.println(n + " is not prime");
//         }
        
//         sc.close();
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
08. Grade Calculator: Write a program that takes a student's score as input (between 0 and 100) and prints the corresponding grade according to the following scale:

90-100: A
80-89: B
70-79: C
60-69: D
0-59: F
*/

// import java.util.*;

// class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Score of Student : ");
//         int n = sc.nextInt();

//         if (100 >= n && n >= 90) {
//             System.out.println("A");
//         }
//         else if (89 >= n && n >= 80) {
//             System.out.println("B");
//         }
//         else if (79 >= n && n >= 70) {
//             System.out.println("C");
//         }
//         else if (69 >= n && n >= 60) {
//             System.out.println("D");
//         }
//         else if (59 >= n && n >= 0) {
//             System.out.println("F");
//         }
//         else {
//             System.out.println("Invalid Input");
//         }
//         sc.close();
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
09. Factorial Finder: Write a program that takes an integer
    as input and calculates its factorial using a loop. 
*/

// import java.util.*;

// class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter A Natural Number : ");
//         int n = sc.nextInt();
//         int Factorial = 1;

//         if (n <= 0) {
//             System.out.println("Invalid Input");
//         }

//         for (int i=1; i<=n; i++) {
//             Factorial = Factorial * i;
//         }    
        
//         System.out.println("Factorial of " + n + " is : " + Factorial);
//         sc.close();
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
10. Fibonacci Sequence: Write a program that prints the Fibonacci sequence 
up to a given number 'n'. 
    The Fibonacci sequence is a series of numbers in which each number
is the sum of the two preceding ones. The sequence starts with 0 and 1. 
*/

// import java.util.Scanner;

// class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of fibonacci : ");
//         int n = sc.nextInt();
        
//         int fib1 = 0;
//         int fib2 = 1;

//         for (int i=0; i<=n; i++) {
//             System.out.print(fib1 + " ");
//             int sum = fib1 + fib2;
//             fib1 = fib2;
//             fib2 = sum;
//         }
//         sc.close();
//     }
// }




// ** Java Lecture 04 **

// Loops

/*
10. Leap Year Checker: Write a program that checks if a
given year is a leap year or not. 
    A leap year is divisible by 4, but not divisible by 100 
unless it is also divisible by 400. 
*/

// import java.util.Scanner;

// class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter year : ");
//         int n = sc.nextInt();

//         if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) {
//             System.out.println(n + " is a leap year");
//         } 
//         else {
//             System.out.println(n + " is not a leap year");
//         }
        
//         sc.close();
//     }

// }




// ** Swaping **

// import java.util.Scanner;

// class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number a : ");
//         int a = sc.nextInt();
//         System.out.println("Enter number b : ");
//         int b = sc.nextInt();
//         int swap = b;
//         b = a;
//         a = swap;

//         System.out.println("A : " + a);
//         System.out.println("B : " + b);

//         sc.close();
//     }
// }