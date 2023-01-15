package ExceptionHandling.throwsCheck;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class File {

    public static void main(String[] args) throws FileNotFoundException
    {
        FileOutputStream obj = new FileOutputStream("D:\\WCCE9JAVA\\File\\file.text");
        System.out.println(obj);
    }
}
