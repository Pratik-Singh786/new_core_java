package serialization;
import java.io.*;
class Dog
{

}
class Cat
{

}
class Rat
{

}
public class SerializationAcOrder {
    public static void main(String[] args)
    {
        try {
            Dog d1 = new Dog();
            Cat c1 = new Cat();
            Rat r1 = new Rat();
            FileOutputStream fos = new FileOutputStream("D:\\javaIO.abc.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d1);
            oos.writeObject(c1);
            oos.writeObject(r1);

            FileInputStream fis = new FileInputStream("D:\\javaIO.abc.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog d2 = (Dog) ois.readObject();
            Cat c2 = (Cat) ois.readObject();
            Rat r2 = (Rat) ois.readObject();

            //-------------------------------------------------
            //when we dont know the order the objects in serialization

            Object o=ois.readObject();
            if(o instanceof Dog)
            {
                Dog d3=(Dog)o;
                //perform dog specific functionality
            }
            else if(o instanceof Cat)
            {
                Cat c3=(Cat)o;
                //perform dog specific functionality
            }
            else
            if(o instanceof Dog)
            {
                Rat r3=(Rat)o;
                //perform dog specific functionality
            }


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }

}
