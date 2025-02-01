// ** Java Lecture 03 **

// Conditional statements

/*
If Else
*/

// import java.util.*;

// public class LectureClass03 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter age : ");
//         int age = sc.nextInt();

//         if(age >= 18){
//             System.out.println("Adult");
//         } else{
//             System.out.println("Not Adult");
//         }
//         sc.close();
//     }
// }




// ** Java Lecture 03 **

// Conditional statements

/*
If Else
01. Check the given number is odd or even.(number input by user)
*/

// import java.util.*;

// public class LectureClass03 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number : ");
//         int x = sc.nextInt();
        
//         if ((x % 2) == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }

//         sc.close();
//     }
// }




// ** Java Lecture 03 **

// Conditional statements

/*
If Else
02. Take input 2 numbers a and b and check
    If a = b than print a is equal to b,
    If a > b than print a is greater than b, and
    If a < b than print a is less than b.
*/

// import java.util.*;

// public class LectureClass03 {
//     public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a : ");
        // int a = sc.nextInt();
        // System.out.println("Enter b : "); 
        // int b = sc.nextInt();

        // if(a == b) {
        //     System.out.println("a is equal to b");
        // } else {
        //     if(a > b) {
        //     System.out.println("a is greater than b");
        //     } else {
        //         System.out.println("a is less than b");
        //     }
        // }
        
        // sc.close()
//     }
// }




// ** Java Lecture 03 **

// Conditional statements

/*
Else If 
03. Take input 2 numbers a and b and check
    If a = b than print a is equal to b,
    If a > b than print a is greater than b, and
    If a < b than print a is less than b.
*/

// import java.util.*;

// public class LectureClass03 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a : ");
//         int a = sc.nextInt();
//         System.out.println("Enter b : "); 
//         int b = sc.nextInt();

//         if(a == b) {
//             System.out.println("a is equal to b");
//         } 
//         else if(a > b) {
//             System.out.println("a is greater than b");
//         } 
//         else {
//             System.out.println("a is less than b");
//         }
        
//         sc.close();
//     }
// }




// ** Java Lecture 03 **

// Conditional statements

/*
switch 
04. print hello if user input 1,
    print namste if user input 2, and
    print konichiwa if user input 3
*/

// import java.util.*;

// public class LectureClass03 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println
//         ("Enter 1 for hello \nEnter 2 for namste \n" + //
//                 "Enter 3 for konichiwa");
//         int button = sc.nextInt();
//         switch (button) {
//             case 1:
//                 System.out.println("Hello");
//                 break;
//             case 2:
//                 System.out.println("Namste");
//                 break;
//             case 3:
//                 System.out.println("Konichiwa");
//                 break;
        
//             default:
//                 System.out.println("Wrong or invalid input");
//                 break;
//         }
        
//         sc.close();
//     }
// }




// ** Java Lecture 03 **

// Conditional statements

/*
05. Make a Calculator. Take 2 numbers (a & b) from the user and an
   operation as follows :
   ● 1 : + (Addition) a + b
   ● 2 : - (Subtraction) a - b
   ● 3 : * (Multiplication) a * b
   ● 4 : / (Division) a / b
   ● 5 : % (Modulo or remainder) a % b
   Calculate the result according to the operation given and
   display it to the user.
*/

// import java.util.*;

// public class LectureClass03 {
//     public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter '+' || '-' || '*' || '/' || '%'");
//        String choice = sc.next();
//        System.out.println("Enter Number b : ");
//        int b = sc.nextInt();
       
//        switch (choice) {
//         case "+":
//             System.out.println(a + b);
//             break;
//         case "-":
//             System.out.println(a - b);
//             break;
//         case "*":
//             System.out.println(a * b);
//             break;
//         case "/":
//             System.out.println(a / b);
//             break;
//         case "%":
//             System.out.println(a % b);
//             break;
            
//         default: 
//             System.out.println("Invalid input");
//             break;
//        }
//        sc.close();
//     }
// }




// ** Java Lecture 03 **

// Conditional statements

/*
06. Ask the user to enter the number of the month & print the name
    of the month. For eg - For '1' print 'January', '2' print 'February' &
    so on.
*/

// import java.util.Scanner;

// public class LectureClass03 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of the month \n" + 
//         "For eg - For '1' enter 'January', '2' enter 'February' & so on.");
//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("January");
//                 break;
//             case 2:
//                 System.out.println("February");
//                 break;
//             case 3:
//                 System.out.println("March");
//                 break;
//             case 4:
//                 System.out.println("April");
//                 break;
//             case 5:
//                 System.out.println("May");
//                 break;
//             case 6:
//                 System.out.println("June");
//                 break;
//             case 7:
//                 System.out.println("July");
//                 break;
//             case 8:
//                 System.out.println("August");
//                 break;
//             case 9:
//                 System.out.println("September");
//                 break;
//             case 10:
//                 System.out.println("October");
//                 break;
//             case 11:
//                 System.out.println("November");
//                 break;
//             case 12:
//                 System.out.println("December");
//                 break;       
//             default:
//                 System.out.println("Invalid input");
//                 break;
//         }
//         sc.close();
//     }
// }




// ** Java Lecture 03 **

// Conditional statements

/*
07. Ask the user to enter the number of the day & print the name
    of the day. For eg - For '1' print 'Monday', '2' print 'Tuesday' &
    so on.
*/

// import java.util.Scanner;

// public class LectureClass03 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of the day \n" + 
//         "For eg - For '1' enter 'monday', '2' enter 'tuesday' & so on.");
//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;       
//             default:
//                 System.out.println("Invalid input");
//                 break;
//         }
//         sc.close();
//     }
// }