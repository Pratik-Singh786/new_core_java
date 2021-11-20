package serialization;

import java.io.*;

//when you serialize an object the set of all object reachable from it will also be serialized
class Dog1 implements Serializable
{
    Cat1 c=new Cat1();

}
class Cat1 implements Serializable
{
 Rat1 r=new Rat1();
}
class Rat1 implements Serializable
{
    int j=20;

}
public class SerializationObjectGraph
{
    public static void main(String [] args) throws Exception
    {
            Dog1 dg =new Dog1();
            FileOutputStream fos1=new FileOutputStream("D:\\javaIO.Sog.ser");
            ObjectOutputStream oos1=new ObjectOutputStream(fos1);
            oos1.writeObject(dg);

            FileInputStream fis1=new FileInputStream("D:\\javaIO.Sog.ser");
            ObjectInputStream ois1=new ObjectInputStream(fis1);
            Dog1 d4= (Dog1)ois1.readObject();
            System.out.println(d4.c.r.j);// dog serialize  cat ,cat serialize rat and rat serialize j;


    }


}
