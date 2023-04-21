package InnerClasses.Anonymous;

public class Test {
    public static void main(String[] args) {
        Food f1 = new Food()
        {
            //            Overriding and used only ones
            public void taste(){
                System.out.println("Salty");
            }
        };
        f1.taste();
        System.out.println(f1);
    }
}
