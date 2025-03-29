import java.io.*;
import java.util.*;

public class Filetest {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        System.out.println("user details input");
        System.out.printf("your name");
        String name=sc.next();
        System.out.printf("hobbie");
        String hobbie=sc.next();
        File f1=new File("drugdiscovery/genetics/check.csv");
        f1.createNewFile();
        f1.setWritable(true);
        FileWriter f2 = new FileWriter("drugdiscovery/genetics/check.csv",true);
        f2.write(" customer name : "+name+","+"customer hobbie : "+hobbie+"\n");
        f2.close();
        sc.close();
    }
}