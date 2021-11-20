package serialization;

import java.io.*;

class Account implements Serializable
{
    String name= "Pratik";
    transient  String pwd="pratik@123";
}

public class CustomizedSerialization
{
    public static void main(String [] args) throws Exception
    {
        //Serialization
        Account a=new Account();
        FileOutputStream fos=new FileOutputStream("D:\\javaIO.Custser.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);

        //Deserialization
        FileInputStream fis=new FileInputStream("D:\\javaIO.Custser.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
         Account a2=( Account)ois.readObject();
         System.out.print(a2.name+ " "+a2.pwd); //password will print null the default value of String;




    }

}
