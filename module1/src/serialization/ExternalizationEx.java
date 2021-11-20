package serialization;

import java.io.*;

//the concept of saving  either total or partial part of object to the file
//transient keyword plays a very imp. role in Serialization byt not not in externalization
 class ExternalizationEx implements Externalizable {
    String s;
    int i;
    int j; //i am writing only s and i in writeExternal(), so j will be automatically 0 at final reading

   public ExternalizationEx(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    public ExternalizationEx()
    {
        // System.out.print("no-arg");
    }


    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);

    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {

        s = (String) in.readObject();
        i = in.readInt();

    }


    public static  void main(String []args) throws IOException, Exception
    {
        ExternalizationEx ex=new ExternalizationEx("java",10,20);
        FileOutputStream fos=new FileOutputStream("D:\\javaIO.Exter.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(ex);

        FileInputStream fis=new FileInputStream("D:\\javaIO.Exter.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ExternalizationEx ex1 =(ExternalizationEx )ois.readObject();
        System.out.println(ex1.s+" "+ex1.i+" "+ex1.j);

    }





}
