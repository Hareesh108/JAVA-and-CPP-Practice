package Interfaces;

import java.lang.constant.ConstantDesc;
import java.lang.constant.Constable;
//import java.lang.constant.Descriptors;
import static java.lang.constant.ConstantDesc.*;

public class IntegerValueMakeConstant {

//    The main use of Constable interface is to provide a way for classes to indicate to the compiler that their
//    instances can be used in constant expressions. When a constant expression uses an instance of a class that
//            implements Constable, the compiler can optimize the code by replacing the reference to the instance
//                    with the constant value, which can result in better performance.
    private final int value;

    public IntegerValueMakeConstant(int value) {
        this.value = value;
    }

//    @Override
//    public ConstantDesc value() {
//        return ConstantDesc.ofNumeric(value, Descriptors.INT);
//    }
    public static void main(String[] args) {

    }
}
