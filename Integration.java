// Gibson Green
// A program integrating skills learned in COP 2006.

// this is a header
// public is an access modifier
// void is the return type, meaning this method doesn't return anything
// method names should be in lowerCamelCase and be named with a verb
public class Integration {
  public static void main(String[] args) {
    System.out.println("Hello, friend!");

    //The following is an explanation of the 8 primitive data types, Source: Oracle
    //Prim. Data Types
    //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    System.out.println("There are 8 primitive data types in the Java Programming "
        + "language. They are as followed: \n");

    System.out.println("byte: The byte data type is an 8-bit signed two's complement"
        + " integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).\n"
        + "The byte data type can be useful for saving memory in large arrays\n"
        + "where the memory savings actually matters. They can also be used in\n"
        + "place of int where their limits help to clarify your code; the fact\n"
        + "that a variable's range is limited can serve as a form of documentation.\n");
    System.out.println("short:  The short data type is a 16-bit signed two's complement integer.\n"
        + "It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).\n"
        + "As with byte, the same guidelines apply: you can use a short to save memory in\n"
        + "large arrays, in situations where the memory savings actually matters.\n");
    System.out.println("int:By default, the int data type is a 32-bit signed two's complement\n"
        + "integer, which has a minimum value of -231 and a maximum value of 231-1.\n"
        + "In Java SE 8 and later, you can use the int data type to represent an unsigned\n"
        + "32-bit integer, which has a minimum value of 0 and a maximum value of 232-1.\n"
        + "Use the Integer class to use int data type as an unsigned integer.\n"
        + "See the section The Number Classes for more information. Static methods\n"
        + "like compareUnsigned, divideUnsigned etc have been added to the Integer class\n"
        + "to support the arithmetic operations for unsigned integers.\n");
    System.out.println("long: The long data type is a 64-bit two's complement integer. The signed\n"
        + "long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8\n"
        + "and later, you can use the long data type to represent an unsigned 64-bit long,\n"
        + "which has a minimum value of 0 and a maximum value of 264-1. Use this data type\n"
        + "when you need a range of values wider than those provided by int. The Long class\n"
        + "also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic\n"
        + "operations for unsigned long.\n");
    System.out.println("float: The float data type is a single-precision 32-bit IEEE 754 floating\n"
        + "point. Its range of values is beyond the scope of this discussion, but is specified\n"
        + "in the Floating-Point Types, Formats, and Values section of the Java Language\n"
        + "Specification. As with the recommendations for byte and short, use a float\n"
        + "(instead of double) if you need to save memory in large arrays of floating point\n"
        + "numbers. This data type should never be used for precise values, such as currency.\n"
        + "For that, you will need to use the java.math.BigDecimal class instead. Numbers\n"
        + "and Strings covers BigDecimal and other useful classes provided by the Java platform.\n");
    System.out.println(
        "double: The double data type is a double-precision 64-bit IEEE 754 floating point.\n"
            + "Its range of values is beyond the scope of this discussion, but is specified in the\n"
            + "Floating-Point Types, Formats, and Values section of the Java Language Specification.\n"
            + "For decimal values, this data type is generally the default choice. As mentioned\n"
            + "above, this data type should never be used for precise values, such as currency.\n");
    System.out
        .println("boolean: The boolean data type has only two possible values: true and false.\n"
            + "Use this data type for simple flags that track true/false conditions. This data type\n"
            + "represents one bit of information, but its \"size\" isn't something that's precisely defined.\n");
    System.out
        .println("char: The char data type is a single 16-bit Unicode character. It has a minimum\n"
            + "value of '\\u0000' (or 0) and a maximum value of '\\uffff' (or 65,535 inclusive).");
    System.out.println(
        "Source for Data Types: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html");

    // String and Variable Concatenation that I figure out in here, from Hackerrank
    int int1 = 2;
    double double1 = 2.0;
    String string1 = "2";

    /* Declare and initialize second integer, double, and String variables. */
    int int2 = 2;
    double double2 = 2.0;
    String string2 = "2";

    /* Print the sum of both integer variables on a new line. */
    System.out.println("The result of + with ints is " + (int1 + int2));

    /* Print the sum of the double variables on a new line. */
    System.out.println("The result of + with doubles is " + (double1 + double2));

    /* Concatenate and print the String variables on a new line. */
    System.out.println("The result of + with Strings is " + (string1 + string2));
  
    double num1 = 5;
    double num2 = 10;
    //this is a call, in the parentheses is an argument
    double squared = squareIt(num1, num2, "Hello"); //in parentheses= argument list
    double sqyaredPlus1 = squareIt(num1) +1;
    System.out.println(squareIt(num1));
  }
  
  public static double squareIt(double n1 double n2, String greeeting) //parameter list in parentheses {
  //body  of squareIt method is everything in the curly braces
    return squared = n1*n1;
  }
  
}


