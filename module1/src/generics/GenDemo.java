package generics;
class Gen<T>
{
    T obj;
    Gen( T obj)
    {
        this.obj=obj;
    }
    public void show()
    {
        System.out.println("This type obj"+obj.getClass().getName());
    }
    public T getObj()
    {
        return obj;
    }





}

public class GenDemo
{
    public static void main(String [] args)
    {
        Gen<String> g1=new Gen<String>("durga");
        g1.show();
        System.out.println(g1.getObj());
        
        Gen<Integer> g2=new Gen<Integer>(10);
        g2.show();
        System.out.println(g2.getObj());

        Gen<Double> g3=new Gen<Double>(10.5);
        g3.show();
        System.out.println(g3.getObj());


    }

}
