package serialization;

import java.io.*;

class AnimalKingdom
{
    int i=10;
}
class Loin extends AnimalKingdom implements Serializable  //child class Serialized
{
    int j=20;
}


public class SerializationInheritance1
{
    public static void main(String [] args) throws Exception
    {


        Loin l = new Loin();
        l.i=888;
        l.j=999;
        System.out.println(l.i + " "+l.j);
        FileOutputStream fos=new FileOutputStream("D:\\javaIO.Serinhe1.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(l);

        FileInputStream fis=new FileInputStream("D:\\javaIO.Serinhe1.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Loin l2=(Loin)ois.readObject();
        System.out.println(l2.i+" "+l2.j);
        // =================================


    }

}
