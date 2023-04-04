import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * Variables are used to store certain type of data.
        * There are primitive and non-primitive variables.
        * The primitive are:
        *  byte, short, int, long, float, double, boolean, and char
        * */


        //By default, the int data type is a 32-bit signed two's complement integer.

        //Declaring int variable:
        int integerVariable;

        //Definition of int variable - a value is assigned to a variable:
        int i = 12;

        //Once declared, the value of the variable could be changed,
        // without declaring it again.
        integerVariable = 82;
        integerVariable = 1234;

        //Value of other variable could be assigned to a variable;
        integerVariable = i;
        int newVariable = integerVariable;

        //printing the variable's value into the console:
        System.out.println(integerVariable);
        System.out.println("The value of integerVariable is: " + integerVariable);


        //The byte data type is an 8-bit signed two's complement integer.
        // It has a minimum value of -128 and a maximum value of 127 (inclusive).
        byte b = 12;

        //The short data type is a 16-bit signed two's complement integer.
        //It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
        short s = 19000;

        //The long data type is a 64-bit two's complement integer.
        // L is a specific suffix, used to for long
        long maxLongValue = 9223372036854775807L;

        //The float data type is a single-precision 32-bit floating point.
        // The f suffix is used for float
        float f = 288.988f;

        // The double data type is a double-precision 64-bit floating point.
        double d = 82.2;
        double d2 = 1.23d;

        // The boolean data type has only two possible values: true and false
        boolean boolVariable = true;
        boolVariable = false;

        // The char data type is a single 16-bit Unicode character
        char symbol = 'a';
        symbol = '8';
        symbol = '$';
        symbol = '\n'; // this is the symbol for the end of a line


        /*By using Wrapper classes,primitive data types (int, boolean, etc..) could be used as objects.
            byte	 ->   Byte
            short	 ->   Short
            int	     ->   Integer
            long	 ->   Long
            float	 ->   Float
            double	 ->   Double
            boolean	 ->   Boolean
            char	 ->   Character
         */

        Integer integer = 99;
        Long aLong = integer.longValue();
        //When working with Collections, wrapper classes, should be used:
        List<Integer> list = new ArrayList<>();


        // OPERATIONS
        int a1 = 33;
        int b1 = 902;
        int sumOfA1andB1 = a1 + b1;
        System.out.println("The sum of " + a1 + " and " + b1 + " is: " + sumOfA1andB1);
        System.out.println("a1 - b1 = " + (a1 - b1));
        System.out.println("a1 * b1 = " + (a1 * b1));
        System.out.println("a1 / b1 = " + (a1 / b1));
        System.out.println("b1 / a1 = " + (b1 / a1));
        System.out.println("b1 % a1 = " + (b1 % a1));
        System.out.println("b1*1.0 / a1 = " + (b1*1.0 / a1));


        //incrementing/decrementing value:
        int newIntVariable = 0;
        System.out.println("new variable with value 0");

        newIntVariable++;
        System.out.println("after incrementing: " + newIntVariable);

        newIntVariable = newIntVariable + 1; // this is equal to ++;
        newIntVariable++;
        System.out.println("after incrementing two times: " + newIntVariable);


        /*
        * The Equality and Relational Operators
        *    ==      equal to
        *    !=      not equal to
        *    >       greater than
        *    >=      greater than or equal to
        *    <       less than
        *    <=      less than or equal to
        * */

        System.out.println("12 > 3 is " + (12 > 3));
        System.out.println("12 < 3 is " + (12 < 3));
        System.out.println("12 != 3 is " + (12 != 3));
        System.out.println("12 == 12 is " + (12 == 12));
        int var1 = 12;
        int var2 = 76;
        System.out.println("var1 > var2 is " + (var1 > var2));


        /* Conditional Operators
        *    && Conditional-AND
        *    || Conditional-OR
        * */
        System.out.println("(12 == 12) && (12 > 9) is " + ((12 == 12) && (12 > 9)));
        System.out.println("(12 == 12) && (12 > 99) is " + ((12 == 12) && (12 > 99)));
        System.out.println("(12 == 12) || (12 > 99) is " + ((12 == 12) || (12 > 99)));
        System.out.println("true || false is " + (true || false));

        //inverting value of a boolean:
        boolean flag = false;
        System.out.println("Current value of flag is: " + flag + ", !flag is " + !flag);


        //TYPE CASTING

        //Widening or implicit casting. Widening casting is done automatically:
        // byte -> short -> char -> int -> long -> float -> double
        int j = 99;
        //automatically converts int type to long type. No data loss
        long y = j;
        double d3 = y;

        //Narrowing type casting or explicit casting:
        d3 = 166.66;
        //converting double data type into long data type
        long l = (long)d3;
        //converting long data type into int data type
        int i1 = (int)l;
    }
}