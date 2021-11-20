package serialization;

import java.io.*;

class Account1 implements Serializable
{
    String name= "Pratik";
    transient  String pwd="pratik@123";
    private void writeObject(ObjectOutputStream os) throws Exception
    {
      os.defaultWriteObject();     //writing encrptyed passoword
      String epwd= "123"+pwd;
      os.writeObject(epwd);
    }

    private void readObject(ObjectInputStream is) throws Exception
    {
        is.defaultReadObject();
        String epwd=(String)is.readObject();
        pwd=epwd.substring(3);           //reading original password

    }

}

public class CustmizedSerialization1
{
    public static void main(String [] args)  throws Exception
    {
        Account1 a = new Account1();
        System.out.println(a.name+" "+a.pwd);
        FileOutputStream fos = new FileOutputStream("D:\\javaIO.Custser1.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        //Deserialization
        FileInputStream fis = new FileInputStream("D:\\javaIO.Custser1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account1 a2 = (Account1) ois.readObject();
        System.out.print(a2.name + " " + a2.pwd); //pa

    }

}
