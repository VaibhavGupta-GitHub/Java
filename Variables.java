// ** Java Lecture 02 **

// Variables declaration and usage

// class LectureClass02{
//     public static void main(String[] args){
//         int a = 1;
//         String name = "vaibav gupta";
//         char ch = 'A';
//         float f = 3.14f;

//         System.out.println("int = " + a);
//         System.out.println("String = " + name);
//         System.out.println("char = " + ch);
//         System.out.println("float = " + f);
//     }
// }




// ** Java Lecture 02 **

// Input from user and Output

// import java.util.*;

// class LectureClass02{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in); // basic syntax for scanner (scanf)
//         String name = sc.nextLine();         // to take input of string type
//         System.out.println(name);            // to output or print (printf)
//         sc.close();
//     }
// }




// ** Java Lecture 02 **

// Input from user and Output

/*
01. Take two variables a and b and print their sum. 
*/

// import java.util.*;

// class FirstClass02{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//         sc.close(); 
//     }
// }




// ** Java Lecture 02 **

/*
02. Try to declare meaningful variables of each type. Eg - a variable
    named age should be a numeric type (int or float) not byte. 
*/

// class LectureClass02{
//     public static void main(String[] args) {
//         //students info
//         String name = "Ram Lakhan";
//         int age = 12;
//         float cgpa = 9.5f;
//         char section = 'A';
//         System.out.println("Student name : " + name);
//         System.out.println("Student age : " + age);
//         System.out.println("Student cgpa : " + cgpa);
//         System.out.println("Student section : " + section);
//     }
// }




// ** Java Lecture 02 **

/*
03. Make a program that takes the radius of a circle as input,
    calculates its Circumference and Area and prints it as output to the user.
*/

// import java.util.*;

// class LectureClass02{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter radius of circle : ");
//         double radius = sc.nextDouble();
//         double circumference = 2 * 3.14 * radius;
//         double area = 3.14 * radius * radius;
//         System.out.println("Circumference of circle : " + circumference);
//         System.out.println("Area of circle : " + area);
//         sc.close();
//     }
// }




// ** Java Lecture 02 **

/*
04. Make a program that takes the side of a square as input,
    calculates its perimeter and area and prints it as output to the user.
*/

// import java.util.*;

// class LectureClass02{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter side of Square : ");
//         int side = sc.nextInt();
//         int perimeter = 4 * side;
//         int area = side * side;
//         System.out.println("Perimeter of square : " + perimeter);
//         System.out.println("Area of square : " + area);
//         sc.close();
//     }
// }




// ** Java Lecture 02 **

/*
05. Make a program that takes the width and height of a rectangle as input,
    calculates its perimeter and area and prints it as output to the user.
*/

// import java.util.*;

// class LectureClass02{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter width of Rectangle : ");
//         int width = sc.nextInt();
//         System.out.println("Enter height of Rectangle : ");
//         int height = sc.nextInt();
//         int perimeter = 2 * (width + height);
//         int area = width * height;
//         System.out.println("Area of Rectangle : " + area);
//         System.out.println("Perimeter of Rectangle : " + perimeter);
//         sc.close();
//     }
// }




// ** Java Lecture 02 **

/*
06. Make a program that prints the table of a number that is input by
    the user.
*/

// import java.util.*;

// class LectureClass02{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number x : ");
//         int number = sc.nextInt();
//         System.out.println("Table of number x : ");
//         System.out.println(number*1);
//         System.out.println(number*2);
//         System.out.println(number*3);
//         System.out.println(number*4);
//         System.out.println(number*5);
//         System.out.println(number*6);
//         System.out.println(number*7);
//         System.out.println(number*8);
//         System.out.println(number*9);
//         System.out.println(number*10);
//         sc.close();
//     }
// }