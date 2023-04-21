package NonStatic;

public class NonStaticBlock {
    private int x;
    private int y;

    {
        // Non-static initialization block
        x = 10;
        y = 20;
    }

    public NonStaticBlock() {
        // Constructor
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        NonStaticBlock obj = new NonStaticBlock();

    }
}

//    A non-static initialization block in Java is a block of code that is executed when an object of the class is created. Non-static initialization
//    blocks are executed before the constructor for the class, and can be used to initialize fields in the object with custom values. Non-static
//    initialization blocks are useful for performing complex initializations that cannot be easily expressed using the simple assignment syntax allowed
//    in the field declarations or in the constructor. Here is an example of how a non-static initialization block might be used:

//In this example, the non-static initialization block sets the values of the x and y fields to 10 and 20, respectively. These values are then
// used in the constructor to print out the values of the fields. Because the non-static initialization block is executed before the constructor,
// the values of x and y are already set when the constructor is called.
