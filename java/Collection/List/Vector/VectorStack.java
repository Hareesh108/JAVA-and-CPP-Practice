package Collection.List.Vector;

import java.util.Stack;

public class VectorStack {
    public static void main(String[] args) {
        Stack obj = new Stack();

        obj.push(10);
        obj.push("Hey");
        obj.push('a');
        System.out.println(obj);

        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj);

//        Homogeneous type
        Stack<String> obj1 = new Stack();
        obj1.push("10");
        obj1.push("Hey");
        obj1.push("a");
        System.out.println(obj.empty());
        System.out.println(obj);

        System.out.println(obj1.pop());
        System.out.println(obj1.peek());
        System.out.println(obj1);
    }
}
