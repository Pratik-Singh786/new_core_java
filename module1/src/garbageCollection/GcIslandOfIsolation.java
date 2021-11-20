package garbageCollection;

public class GcIslandOfIsolation
{
    GcIslandOfIsolation i;
    public static void main(String[] args)
    {
        GcIslandOfIsolation gc1=new GcIslandOfIsolation();
        GcIslandOfIsolation gc2=new GcIslandOfIsolation();
        GcIslandOfIsolation gc3=new GcIslandOfIsolation();
        gc1.i=gc2;
        gc2.i=gc3;
        gc3.i=gc1;

        gc1=null;
        gc2=null;
        gc3=null;

        //Even though object having refrences sometimes it is eligible for g.c if all refrences are internal refernces
       //gc3=null is doing the job;






    }


}
