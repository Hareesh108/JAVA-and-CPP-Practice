package LambdaExpression;

public interface Food {

    void taste();

    public static void main(String[] args) {
//        We are having one statement so we can write like this
        Food f1 = () -> System.out.println("Salty");

        f1.taste();
        System.out.println(f1.toString());

        Food f4 = new Food()
        {
            public void taste(){
                System.out.println("Salty");
            }
        };
        f4.taste();
        System.out.println(f4);
    }

}
