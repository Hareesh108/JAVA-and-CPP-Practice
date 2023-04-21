package InnerClasses.Anonymous;

public class InterfaceCheck {
    public static void main(String[] args) {
//    We will get mixed output
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<155;i++){
                    System.out.println("Runnable");
                }
            }
        };
        Thread obj = new Thread(r);
        obj.start();

        for(int i=0; i<115;i++){
            System.out.println("Parent");
        }

    }
}
