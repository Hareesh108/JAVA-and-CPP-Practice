package AccessModifiers.Private;

//We cannot make class, Static And Non Static block as private

//private class InheritanceCheck extends Parent
//     private {
//
//     }
//    private static {
//        System.out.println("Parent");
//    }
class InheritanceCheck {
    private int a =20;
    private InheritanceCheck(){
//        this(int num);
        System.out.println("Constructor");
    }

    InheritanceCheck(int num){

    }

    private static void test(){
        System.out.println("test");
    }
    public static void main(String[] args) {

    }
}
