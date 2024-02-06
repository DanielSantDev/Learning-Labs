//Simple Java exercises
//access this list in: w3schools.com/java/exercise.asp
public class Main {

//__________________________________________________________________
        //Java methods
//    Insert the missing part to call myMethod from main.
//    static void myMethod() {
//        System.out.println("I just got executed!");
//    }

//    Insert the missing part to call myMethod from main two times.
//    static void myMethod() {
//        System.out.println("I just got executed!");
//    }

//    Add a fname parameter of type String to myMethod, and output "John Doe".
//        static void myMethod(String fname) {
//            System.out.println(fname + " Doe");
//        }

//    Insert the missing part to print the number 8 in main, by using a specific keyword inside myMethod:
//        static int myMethod(int x) {
//            return 5 + x;
//        }

//    Follow the comments to insert the missing parts of the code below:
//    Create a checkAge() method with an integer variable called age
        static void checkAge(int age) {
            // If age is less than 18, print "Access denied"
            if (age < 18) {
                System.out.println("Access denied");

            // If age is greater than, or equal to, 18, print "Access granted"
            } else {
                System.out.println("Access granted");
            }
        }

    public static void main(String[] args) {

        //Java Sytax 1,2
//        System.out.println("Hello World");

        //This is a single-line comment
        /*This is a multi-line comment*/
//__________________________________________________________________
        //Java Variables 3,4,5,6,7
//        String carName = "Volvo";

//        int maxSpeed = 120;

//        int x = 5;
//        int y = 10;
//        System.out.println(x + y);

//        int x = 5;
//        int y = 10;
//        int z = x + y;
//        System.out.println(z);

//        int x = 5, y = 6, z = 50;
//        System.out.println(x + y + z);
//__________________________________________________________________
        //Java Data Types 8, 9, 10
//        int myNum = 9;
//        float myFloatNum = 8.99f;
//        char myLetter = 'A';
//        boolean myBool = true;
//        String myText = "Hello World";

        //byte, short, int, long, float, double, boolean and char are called:
//        primitive data types

        //Type Casting
//        double myDouble = 9.78d;
//        int myInt = (int) myDouble;
//        System.out.println(myInt);
//__________________________________________________________________
        //Java Operators 11,12,13,14
//        System.out.println(10 * 5);
//
//        System.out.println(10 / 5);
//
//        int x = 10;
//        ++x;

//        int x = 10;
//        x += 5;
//__________________________________________________________________
        //Java Strings
//        String greeting = "Hello";

//        String txt = "Hello";
//        System.out.println(txt.length());

//        String txt = "Hello";
//        System.out.println(txt.toUpperCase());

//        String firstName = "John ";
//        String lastName = "Doe";
//        System.out.println(firstName + lastName);

//        String firstName = "John ";
//        String lastName = "Doe";
//        System.out.println(firstName.concat(lastName));

//        String txt = "Hello Everybody";
//        System.out.println(txt.indexOf("e"));
//__________________________________________________________________
        //Java math
//        int x = 5;
//        int y = 10;
//        System.out.println(Math.max(x,y));

//        int x = 16;
//        System.out.println(Math.sqrt(x));

//        System.out.println(Math.random());
//__________________________________________________________________
        //Java booleans
//        boolean isJavaFun = true;
//        boolean isFishTasty = false;
//        System.out.println(isJavaFun);
//        System.out.println(isFishTasty);

//        int x = 10;
//        int y = 9;
//        System.out.println(y<x);
//__________________________________________________________________
        //Java If...Else
//        int x = 50;
//        int y = 10;
//        if (x > y){
//            System.out.println("Hello World");
//        }

//        int x = 50;
//        int y = 50;
//        if (x == y){
//            System.out.println("Hellor World");
//        }

//        int x = 50;
//        int y = 50;
//        if (x == y) {
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }

//        int x = 50;
//        int y = 50;
//        if (x == y){
//            System.out.println("1");
//        } else if (x > y) {
//            System.out.println("2");
//        } else {
//            System.out.println("3");
//        }

//        int time = 20;
//        String result = (time < 18) ? "Good Day.": "Good Evening.";
//        System.out.println(result);
//__________________________________________________________________
        //Java switch
//        int day = 2;
//        switch (day) {
//            case 1:
//                System.out.println("Saturday");
//                break;
//            case 2:
//                System.out.println("Sunday");
//                break;
//        }

//        int day = 4;
//        switch (day){
//            case 1:
//                System.out.println("Saturday");
//                break;
//            case 2:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Weekend");
//        }
//__________________________________________________________________
        //Java Loops

//        Print i as long as i is less than 6.
//        int i = 1;
//        while(i<6) {
//            System.out.println(i);
//            i++;
//        }

//        Use the do/while loop to print i as long as i is less than 6.
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<6);

//        Use a for loop to print "Yes" 5 times:
//        for (int i=0;i<=4;i++) {
//            System.out.println("Yes");
//        }

//        Loop through the items in the cars array.
//        String[] cars = {"Volvo", "BMW", "Ford"};
//        for (String i: cars) {
//            System.out.println(i);
//        }

//        Stop the loop if i is 5.
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }

//        In the loop, when the value is "4", jump directly to the next value.
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                continue;
//            }
//            System.out.println(i);
//        }
//__________________________________________________________________
        //Java arrays
//        Create an array of type String called cars.
//        String[] cars = {"Volvo", "BMW", "Ford"};

//        Print the second item in the cars array.
//        String[] cars = {"Volvo", "BMW", "Ford"};
//        System.out.println(cars[1]);

//        Change the value from "Volvo" to "Opel", in the cars array.
//        String[] cars = {"Volvo", "BMW", "Ford"};
//        cars[0] = "Opel";
//        System.out.println(cars[0]);

//        Find out how many elements the cars array have.
//        String[] cars = {"Volvo", "BMW", "Ford"};
//        System.out.println(cars.length);

//        Loop through the items in the cars array.
//        String[] cars = {"Volvo", "BMW", "Ford"};
//        for (String i: cars ) {
//            System.out.println(i);
//        }

//        Insert the missing parts to create a two-dimensional array.
//        int [][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//__________________________________________________________________
        //Java methods
//        myMethod();

//        myMethod();
//        myMethod();

//        myMethod("John");

//        System.out.println(myMethod(3));

        // Call the checkAge method and pass along an age of 20
        checkAge(20);
    }
}