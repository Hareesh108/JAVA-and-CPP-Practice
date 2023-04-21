package InnerClasses.Anonymous;

public class Check {
    public static void main(String[] args) {

        Thread obj = new Thread()
        {
            public void test(){
                for(int i=0; i<155;i++){
                    System.out.println("Child");
                }
            }
        };
        obj.start();

        for(int i=0; i<115;i++){
            System.out.println("Parent");
        }

    }
}
