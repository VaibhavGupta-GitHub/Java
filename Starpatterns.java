// ** Java Lecture 05 **

// Starpatterns

/*
01. Print star patern
    *****
    *****
    *****
    *****
*/

class Starpatterns_1 {
    public static void main(String[] args){
        for (int i=1; i<=4; i++) {
            for (int j=1; j<=5; j++) {
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}




// ** Java Lecture 05 **

// Starpatterns

/*
02. Print star patern
    *
    **
    ***
    ****
    *****
*/

class Starpatterns_2 {
    public static void main(String[] args){
        int n = 5;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




// ** Java Lecture 05 **

// Starpatterns

/*
03. Print star patern
    *****
    ****
    ***
    **
    *
*/

class Starpatterns_3 {
    public static void main(String[] args){
        int n = 1;

        for (int i=5; i>=n; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




// ** Java Lecture 05 **

// Starpatterns

/*
04. Print star patern
       *
      **
     ***
    ****  
*/

class Starpatterns_4 {
    public static void main(String[] args){
        int n = 4;

        //Outer loop
        for (int i=1; i<=n; i++) {

            // inner loop spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // inner loop stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
}




// ** Java Lecture 05 **

// Starpatterns

/*
05. Print star patern 
    1
    12
    123
    1234
    12345 
*/

class Starpatterns_5 {
    public static void main(String[] args){
        int n = 5;

        //Outer loop
        for (int i=1; i<=n; i++) {
            int count = 1;

            // inner loop 
            for (int j=1; j<=i; j++) {
                System.out.print(count);
                count++;
            }

            // next line
            System.out.println();
        }
    }
}




// ** Java Lecture 05 **

// Starpatterns

/*
06. Print star patern
    12345
    1234
    123
    12
    1
*/

class Starpatterns_6 {
    public static void main(String[] args){
        int n = 5;

        //Outer loop
        for (int i=n; i>=1; i--) {
            int count = 1;

            // inner loop 
            for (int j=1; j<=i; j++) {
                System.out.print(count);
                count++;
            }

            // next line
            System.out.println();
        }
    }
}




// ** Java Lecture 05 **

// Starpatterns

/*
07. Print star patern
    1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15
*/

class Starpatterns_7 {
    public static void main(String[] args){
        int n = 5;
        int count = 1;

        //Outer loop
        for (int i=1; i<=n; i++) {
            

            // inner loop 
            for (int j=1; j<=i; j++) {
                System.out.print(count + " ");
                count++;
            }

            // next line
            System.out.println();
        }
    }
}




// ** Java Lecture 05 **

// Starpatterns

/*
08. Print star patern
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/

class Starpatterns_8 {
    public static void main(String[] args){
        int n = 5;

        //Outer loop
        for (int i=1; i<=n; i++) {
            
            // inner loop 
            for (int j=1; j<=i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                } 
            }

            // next line
            System.out.println();
        }
    }
}




// ** Java Lecture 05 **

// Starpatterns

/*
09. Print star patern
    *****
    *   *
    *   *
    *****
*/

class Starpatterns_9 {
    public static void main(String[] args){
        int n = 4;
        int m = 5;

        //Outer loop
        for (int i=1; i<=n; i++) {
            
            // inner loop 
            for (int j=1; j<=m; j++) {
                 if (i==1 || i==n || j==1 || j==m) {
                    System.out.print("*");
                 } else {
                    System.out.print(" ");
                 }
            }

            // next line
            System.out.println();
        }
    }
}