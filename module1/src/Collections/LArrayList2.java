package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LArrayList2 {
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        List l1= Collections.synchronizedList(al); //serialized version of ArrayList similarly for set and Map;

    }
}
