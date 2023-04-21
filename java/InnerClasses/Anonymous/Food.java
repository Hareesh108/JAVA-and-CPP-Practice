package InnerClasses.Anonymous;

public class Food {

    public void taste(){
        System.out.println("Sweet");
    }

    public static void main(String[] args) {

        Food f = new Food();
        f.taste();
        System.out.println(f);

        Food f1 = new Food()
        {
//            Overriding and used only ones
            public void taste(){
                System.out.println("Salty");
            }
        };
        f1.taste();
        f1.taste();
        System.out.println(f1);

        Food f4 = new Food()
        {
            //            Overriding and used only ones
            public void taste(){
                System.out.println("Salty");
            }
        };
        f4.taste();
        System.out.println(f4);
    }

}
