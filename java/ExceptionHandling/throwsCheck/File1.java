package ExceptionHandling.throwsCheck;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class File1 {
    public static void main(String[] args) {
        try {
            FileOutputStream obj = new FileOutputStream("D:\\WCCE9JAVA\\File\\file2.text");
            System.out.println(obj);
        }
        catch (FileNotFoundException n){
            System.out.println(n);
        }

        System.out.println("Worked");
    }
}
