// /* JAVA Lecture 06 */

// // Advanced Patterns

// /*
// 1. Print star patern (Butterfly Pattern)
//    *      *
//    **    **
//    ***  ***
//    ********
//    ********
//    ***  ***
//    **    **
//    *      *    
// */

// class Solutions_1 {
//     public static void main(String[] args) {
//         int n=4;
//         //outter loop for upper pattern
//         for (int i=1; i<=n; i++) {
//             //inner loop for 1st pattern
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             //inner loop for spaces
//             for (int j=1; j<=(n-i)*2; j++) {
//                 System.out.print(" ");
//             }
//             //inner loop for 2nd pattern
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //outter loop for lower pattern
//         for (int i=n; i>=1; i--) {
//             //inner loop for 1st pattern
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             //inner loop for spaces
//             for (int j=1; j<=(n-i)*2; j++) {
//                 System.out.print(" ");
//             }
//             //inner loop for 2nd pattern
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }      
//     }
// }




// /* JAVA Lecture 06 */

// // Advanced Patterns

// /*
// 2. Print the number pyramid
//         1
//        2 2
//       3 3 3
//      4 4 4 4 
//     5 5 5 5 5        
// */

// class Solutions_2 {
//     public static void main(String[] args) {
//         int n=5; 
//         for (int i=1; i<=n; i++) {
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }        
//     }
// }




// /* JAVA Lecture 06 */

// // Advanced Patterns

// /*
// 3. Print the  palindromic number pyramid
//         1
//        212
//       32123
//      4321234
//     543212345   
// */

// class Solutions_3 {
//     public static void main(String[] args) {
//         int n=5; 
//         for (int i=1; i<=n; i++) {
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j=i; j>=1; j--) {
//                 System.out.print(j);
//             }
//             for (int j=2; j<=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }       
//     }
// }




// /* JAVA Lecture 06 */

// // Advanced Patterns

// /*
// 4. Print the diamond star pattern
//        *
//       ***
//      *****
//     *******
//     *******
//      *****
//       ***
//        *            
// */

// class Solutions_4 {
//     public static void main(String[] args) {
//         int n=4;
//         //upper part 
//         for (int i=1; i<=n; i++) {
//             //spaces
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             //upper firt half
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             //upper second half
//             for (int j=2; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //lower part
//         for (int i=n; i>=1; i--) {
//             //spaces
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             //lower first half
//             for (int j=i; j>=1; j--) {
//                 System.out.print("*");
//             }
//             //lower second half
//             for (int j=1; j<=i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }        
//     }
// }




// /* JAVA Lecture 06 */

// // Advanced Patterns

// /*
// 5. Print the rohmbus star pattern
//        *****
//       *****
//      *****
//     *****          
// */

// class Solutions_5 {
//     public static void main(String[] args) {
//         int n=4;
//         for (int i=1; i<=n; i++) {
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }    
//     }
// }




// /* JAVA Lecture 06 */

// // Advanced Patterns

// /*
// 6. Print the hollow diamond star pattern
//    *      *
//    **    **
//    * *  * *
//    *  **  *
//    *  **  *
//    * *  * * 
//    **    **
//    *      *        
// */

// class Solutions_6 {
//     public static void main(String[] args) {
//         int n=4;
//         //first half 
//         for (int i=1; i<=n; i++) {
//             for (int j=1; j<=n; j++) {
//                 if (j==1 || j==i) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             for (int j=n; j>=1; j--) {
//                 if (j==1 || j==i) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         //second half 
//         for (int i=n; i>=1; i--) {
//             for (int j=1; j<=n; j++) {
//                 if (j==1 || j==i) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             for (int j=n; j>=1; j--) {
//                 if (j==1 || j==i) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }    
//     }
// }