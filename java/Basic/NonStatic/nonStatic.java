package NonStatic;

 class nonStatic {
    int a = 10;
    int b;
    static int c = 20;

    static {
        System.out.println("Static Block :");
        nonStatic obj = new nonStatic();
        obj.add(200);
        obj.add(12.201);
        System.out.println(obj.a);

        int c = 1000;
        System.out.println(c);
        System.out.println(nonStatic.c);
        System.out.println(obj.c);
    }

     {
         System.out.println("Non Static Block");
         System.out.println(b);
         b = 20;
         System.out.println(a);
         System.out.println(b);
         add(150);

         //in the nonstatic method and variable it will not work as class name reference.
//        System.out.println(nonStatic.a);
     }
    public void add(int num){
        System.out.println("Non Static Method");
        System.out.println(num);
        // below way we cant do this.
//        nonStatic obj = new nonStatic();
//        System.out.println(obj.c);
    }

     public static void add(double num){
         System.out.println("Static Method");

         System.out.println(num);
     }

    public static void main(String[] args) {
//        int [] arr = new int[50];

        System.out.println("Main Method");
        nonStatic obj = new nonStatic();
        obj.add(200);
        obj.add(12.201);
        System.out.println(obj.a);

        int c = 1000;
        System.out.println(c);
        System.out.println(nonStatic.c);
        System.out.println(obj.c);
    }
}
