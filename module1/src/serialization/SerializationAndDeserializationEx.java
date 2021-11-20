package serialization;

import java.io.*;

class MyClass implements Serializable
{
    int i=10;
    int j=20;
}

public class SerializationAndDeserializationEx
{
    public static void main(String[] args) throws Exception
    {
        MyClass m=new MyClass();
        FileOutputStream fos =new FileOutputStream("D:\\javaIO.MyClass.ser"); //Serialization
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(m);

        FileInputStream fis =new FileInputStream("D:\\javaIO.MyClass.ser");//Deserialization
        ObjectInputStream ois=new ObjectInputStream(fis);
        MyClass m1=(MyClass)ois.readObject();
        {
            System.out.print(m1.i+" "+m1.j);
        }


    }


}
