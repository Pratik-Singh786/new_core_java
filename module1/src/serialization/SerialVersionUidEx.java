package serialization;

import java.io.*;

//This can be achieved by  running three independent classes
class Demo implements Serializable
{
    private static final long serialVersionUID=1L;
    int i=10;
    int j=20;

}
class Sender
{
    public static void main(String [] args) throws Exception
    {
        Demo d1 =new Demo();
        FileOutputStream fos=new FileOutputStream("D:\\javaIO.serialVersionUID");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(oos);



    }

}
class Receiver
{
    public static void main(String [] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("D:\\javaIO.serialVersionUID");
        ObjectInputStream ois=new ObjectInputStream(fis);
         Demo d2=(Demo)ois.readObject();



    }

}



public class SerialVersionUidEx
{
}
