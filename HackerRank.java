    //This Program was written by Gibson Green
    //The following program is an integration of skills that have been learned through
    //February 1,2019 (Intro. to Programming) Topics covered include: primitive data
    //types, strings, string concatenation, casting data types, escape sequences)
public class HackerRank {
  public static void main(String[] args) {
    System.out.println("Hello, friend!\n");
    //The following is an explanation of the 8 primitive data types, also includes
    //escape sequences
    //Source: Oracle: Primitive Data Types 
    //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    System.out.println("There are 8 primitive data types in the Java Programming "
        + "language. They are as followed: \n");
    System.out.println("byte: The byte data type is an 8-bit signed two's complement\n"
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

    Boolean lastNameColor = true;
    int myAge = 19;
    double typicalDecimal = 2.0;
    String myMajor = "Software Engineering.";
    // the following variable, final int, can no longer be modified because of the
    // final keyword. The initialized as animalKing and assigned the value 22 can't
    // be changed or modified, rendering it essentially as a constant.
    
    final int animalKing = 22;
    // In the following two lines, an example of casting is present. Casting when
    // you take one data type and essential turn it into another data type. In the
    // following example, a double is casted into an int. Be careful! As you can see
    // in the print out of castingExampleTwo, part of the double value is truncated!
    double castingExampleOne = 75.5;
    int castingExampleTwo = (int) castingExampleOne;

    //Boolean used
    System.out.println("True or False: My last name is a color? " + lastNameColor);
    //int used
    System.out.println("I am currently " + myAge + " years old. That is, until February 5th!");
    //double used
    System.out
        .println("There aren't many doubles that are applicable to interesting facts about me!"
            + typicalDecimal);
    //String used
    System.out.println("In case you were wondering, my Major is " + myMajor);
    //What is a Variable with some escape sequences used
    System.out.println("What is a Variable?\n"
        + "\tA variable is the name given to a memory location. It is the basic unit\n"
        + " of storage in a program. Values stored in variables can be changed\n "
        + "during program execution. A variable is only a name given to a memory\n "
        + "location, all the operation done on the varibel effects that memory\n "
        + "location. All variables must be declared before use. Source:\n "
        + "GeeksforGeeks: Variables in Java");
    //What is Scope
    System.out.println(
        "What is Scope?" + " In Java, scope is the idea that a variable is only accessible in \n"
            + "the method in which it was declared");
    //Final variable printed
    System.out.println(animalKing);
    //Casting example printed
    System.out.println(castingExampleTwo);

    //String and Variable Concatenation that I figure out in here, from Hackerrank
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
    
    
    Car myCar = new Car();
    Car yourCar = new Car();
    Car mysteryMachine = new Car();
    
    myCar.setColor("silver");
    System.out.println(myCar.getColor());
  }
}
