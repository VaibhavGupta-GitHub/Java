/* JAVA Lecture 11 */

// **2D Arrays**

/*

*/

// import java.util.*;

// class TwoDArrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number of Rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter Number of colomns");
//         int colomns = sc.nextInt();

//         int number[][] = new int[rows][colomns];

//         //input
//         System.out.println();
//         System.out.println("**Input**");
//         System.out.println();
//         for (int i=0; i<rows; i++) {
//             for (int j=0; j<colomns; j++) {
//                 System.out.println("Enter value at index ("+i+","+j+")");
//                 number[i][j] = sc.nextInt();
//             }
//         }

//         //output
//         System.out.println();
//         System.out.println("**Output**");
//         System.out.println();
//         for (int i=0; i<rows; i++) {
//             for (int j=0; j<colomns; j++) {
//                 System.out.println("Value at index ("+i+","+j+")");
//                 System.out.println(number[i][j]);
//             }
//         }
//         sc.close();
//     }
// }




/* JAVA Lecture 11 */

// **2D Arrays**

/*
01. Take a matrix as input from the user. Search for a given number x
and print the index number at which it occours.
*/

// import java.util.*;

// class TwoDArrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number of Rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter Number of colomns");
//         int colomns = sc.nextInt();

//         int number[][] = new int[rows][colomns];

//         //input
//         System.out.println();
//         System.out.println("**Input**");
//         System.out.println();
//         for (int i=0; i<rows; i++) {
//             for (int j=0; j<colomns; j++) {
//                 System.out.println("Enter value at index ("+i+","+j+")");
//                 number[i][j] = sc.nextInt();
//             }
//         }

//         //Search
//         System.out.println("Enter number to search : ");
//         int x = sc.nextInt();

//         System.out.println();
//         System.out.println("**searching...**");
//         System.out.println();
//         for (int i=0; i<rows; i++) {
//             for (int j=0; j<colomns; j++) {
//                 if (number[i][j] == x) {
//                     System.out.println("Found at index ("+i+","+j+")");
//                 }   
//             }
//         }
//         sc.close();
//     }
// }





// /* JAVA Lecture 11 */

// // **2D Arrays**

// /*
// 02. Print the spiral order matrix as output for a given matrix of numbers.
// */

// import java.util.*;

// class TwoDArrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter Number of Rows");
//         // int n = sc.nextInt();
//         // System.out.println("Enter Number of colomns");
//         // int m = sc.nextInt();

//         int[][] arr = {
//             {1, 2, 3, 13},
//             {4, 5, 6, 14},
//             {7, 8, 9, 15},
//             {10, 11, 12, 16}
//         };

//         int top = 0;
//         int bottom = arr.length - 1;
//         int left = 0;
//         int right = arr[0].length - 1;

//         while  (top <= bottom && left <= right) {
//             //top 
//             for (int i=left; i<=right; i++) {
//                 System.out.print(arr[top][i] + " ");
//             }
//             top++;
//             //right
//             for (int i=top; i<=bottom; i++) {
//                 System.out.print(arr[i][right] + " ");
//             }
//             right--;
//             // Check if there are more rows and columns to print
//             if (top <= bottom && left <= right) {
//                 //bottom
//             for (int i=right; i>=left; i--) {
//                 System.out.print(arr[bottom][i] + " ");
//             }
//             bottom--;
//             //left
//             for (int i=bottom; i>=top; i--) {
//                 System.out.print(arr[i][left] + " ");
//             }
//             left++;
//             }
//         }
//         sc.close();
//     }
// }




// class SpiralMatrix {
//     public static void printSpiralOrder(int[][] matrix) {
//         int top = 0;          // Row index for the top boundary
//         int bottom = matrix.length - 1;  // Row index for the bottom boundary
//         int left = 0;         // Column index for the left boundary
//         int right = matrix[0].length - 1; // Column index for the right boundary

//         while (top <= bottom && left <= right) {
//             // Print top row
//             for (int i = left; i <= right; i++) {
//                 System.out.print(matrix[top][i] + " ");
//             }
//             top++;

//             // Print rightmost column
//             for (int i = top; i <= bottom; i++) {
//                 System.out.print(matrix[i][right] + " ");
//             }
//             right--;

//             // Check if there are more rows and columns to print
//             if (top <= bottom && left <= right) {
//                 // Print bottom row
//                 for (int i = right; i >= left; i--) {
//                     System.out.print(matrix[bottom][i] + " ");
//                 }
//                 bottom--;

//                 // Print leftmost column
//                 for (int i = bottom; i >= top; i--) {
//                     System.out.print(matrix[i][left] + " ");
//                 }
//                 left++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         System.out.println("Spiral Order Matrix:");
//         printSpiralOrder(matrix);
//     }
// }




// /**
//  * Lecture
//  */
// import java.util.*;

// public class Lecture {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[][] = new int[3][3];

//         //input
//         for (int i=0; i<3; i++) //input row
//         {
//             for (int j=0; j<3; j++) //input column
//             {
//                 System.out.println("Enter element at ("+i+", "+j+")");
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         //output
//         for (int i=0; i<3; i++) //output row
//         {
//             for (int j=0; j<3; j++) //output column
//             {
//                 System.out.println("Element at ("+i+", "+j+") is : " + arr[i][j]); 
//             }
//         }
//         sc.close();
//     }
// }

