import java.io.*;
public class test {
    public static void main(String[] args) throws IOException {
        try{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
        dos.writeInt(2333);
        dos.writeDouble(23.43);
        dos.writeUTF("Hello");
        dos.close();
        System.out.println("Finished Reading");
        DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));
        System.out.println("Integer: "+dis.readInt());
        System.out.println("Double: "+dis.readDouble());
        dis.close();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}