/* JAVA Lecture 10 */

// **Arrays**

/*

*/

// class Arrays {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 95;
//         marks[1] = 99;
//         marks[2] = 91;

//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         for (int i=0; i<=3; i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }




/* JAVA Lecture 10 */

// **Arrays**

/*

*/

// class Arrays {
//     public static void main(String[] args) {
//         int[] marks = {95, 99, 91};

//         System.out.println(marks[0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//     }
// }




/* JAVA Lecture 10 */

// **Arrays**

/*

*/

// import java.util.*;

// class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array : ");
//         int size = sc.nextInt();
//         int number[] = new int[size];

//         for (int i=0; i<size; i++) {
//             System.out.println("Enter number [" + i + "] position");
//             number[i] = sc.nextInt();
//         }

//         for (int i=0; i<size; i++) {
//             System.out.println("Number ["+i+"] is "+number[i]);
//         }

//         sc.close();
//     }
// }




/* JAVA Lecture 10 */

// **Arrays**

/*
01. Take an array as input from the user. Search for a given number x
and print the index at which it occours.  
*/

// /* JAVA Lecture 10 */

// // **Arrays**

// /*
// 01. Take an array as input from the user. Search for a given number x
// and print the index at which it occours.  
// */

// import java.util.*;

// class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array : ");
//         int size = sc.nextInt();
//         int number[] = new int[size];

//         for (int i=0; i<size; i++) {
//             System.out.println("Enter number [" + i + "] position");
//             number[i] = sc.nextInt();
//         }
        
//         System.out.println("Enter x : ");
//         int x = sc.nextInt();
//         System.out.println("Searching "+x+" in given Array .....");

//         for (int i=0; i<number.length; i++) {
//             if (number[i] == x) {
//                 System.out.println(x+ " found at index "+i);
//             } 
//         }
        
//         sc.close();
//     }
// }




/* JAVA Lecture 10 */

// **Arrays**

/*
02. Take an array of names as input from the user and print them on the screen.  
*/

// import java.util.*;

// class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array");
//         int size = sc.nextInt();
//         String names[] = new String[size];

//         for (int i=0; i<names.length; i++) {
//             System.out.println("Enter name at index" + i);
//             names[i] = sc.next();
//         }

//         for (int i=0; i<size; i++) {
//             System.out.println(names[i]);
//         }
//         sc.close();
//     }
// }




/* JAVA Lecture 10 */

// **Arrays**

/*
03. Take an array of numbers as input and check if it is an array sorted in
ascending order.
*/

// import java.util.*;

// class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int size = sc.nextInt();
//         int number[] = new int[size];

//         //input
//         for (int i=0; i<size; i++) {
//             System.out.println("Enter number at index "+i);
//             number[i] = sc.nextInt();
//         }

//         //check
//         boolean isAscending = true;
//         for (int i=0; i<size-1; i++) {
//             if (number[i]>number[i+1]) {
//                 isAscending = false;
//                 System.out.println("given array is not sorted in ascending order");
//                 break;
//             }
//         }
//         if (isAscending) {
//             System.out.println("given array is sorted in ascending order");
//         }

//         sc.close();
//     }
// }