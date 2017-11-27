import java.io.*;
import java.util.Properties;

/**
 * Created by longjinwen on 23/11/2017.
 */
public class HelloGit {
    public static void main(String[] args) throws IOException {
        System.out.println("hello Git!!");
        Properties properties = new Properties();
       // InputStream in = new FileInputStream(new File("test.properties"));
        InputStream in = HelloGit.class.getClassLoader().getResourceAsStream("test.properties");
        properties.load(in);
        // add test char
        System.setProperties(properties);
        System.out.println(System.getProperty("asdf"));
    }
}
