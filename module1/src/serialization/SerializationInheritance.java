package serialization;

import java.io.*;

class Animal implements Serializable
{
    int i=10;
}
class Tiger extends Animal
{
    int j=20;
}


public class SerializationInheritance
{
    public static void main(String [] args) throws Exception
    {


        Tiger t = new Tiger();
        System.out.println(t.j + " "+t.i);
        FileOutputStream fos=new FileOutputStream("D:\\javaIO.Serinhe.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(t);

        FileInputStream fis=new FileInputStream("D:\\javaIO.Serinhe.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Tiger t2=(Tiger)ois.readObject();
        System.out.println(t2.j+" "+t2.i);
      // =================================


    }

}
