package LambdaExpression;

@FunctionalInterface
interface MyFunction {
    void apply(int x, int y);


    public static void main(String[] args) {
        MyFunction add = (x, y) -> System.out.println(x + y);

        add.apply(50,55);
    }
}


