package serialization;

import java.io.*;

class Account2 implements Serializable
{
    String username="pratik";
    transient String  pwd="pratik@123";
    transient int pin=1234;

    private void writeObject(ObjectOutputStream os)throws Exception
    {
        os.defaultWriteObject();
        String epwd="123"+pwd;
        int epin=4444+123;
        os.writeObject(epwd);
        os.writeInt(epin);

    }
    private void readObject(ObjectInputStream is)throws Exception
    {
        is.defaultReadObject();
        String epwd=(String)is.readObject();
        pwd=epwd.substring(3);
        int epin=is.readInt();
        pin=epin-4444;

    }


}

public class CustomizedSerialization2 implements Serializable
{
    public static void main(String [] args) throws Exception
    {
        Account2 a = new Account2();
        System.out.println(a.username + " " + a.pwd+" "+ a.pin);
        FileOutputStream fos = new FileOutputStream("D:\\javaIO.Custser2.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        //Deserialization
        FileInputStream fis = new FileInputStream("D:\\javaIO.Custser2.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account2 a2 = (Account2) ois.readObject();
        System.out.print(a2.username + " " + a2.pwd+" "+a.pin);
    }

}
