package enumeration;
enum  Flowers
{
    ROSE(70),LILY(80),MOGRA(90),JASMINE;
     int price;
    Flowers(int price)
    {
        this.price=price;
    }
    Flowers()
    {
        this.price=65;
    }
    public int getPrice()
    {
        return price;
    }




}

public class EnumConstructor1
{
    public static void main(String [] args)
    {
        Flowers[]f =Flowers.values();
        for(Flowers f1: f)
        {
          System.out.println(f1+" "+f1.getPrice());
        }
    }


}
