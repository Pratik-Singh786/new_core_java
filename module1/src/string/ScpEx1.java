package string;

public class ScpEx1 {

	public static void main(String[] args) {
		String s1=new String("pratik");//1.object creation in heap 2 .in scp area =>with same content pratik
		String s2=new String("pratik");//object creation in heap area
		String s3="pratik";//no new object creation due to scp area
		String s4="pratik";//no new object creation due to scp area

	}

}
