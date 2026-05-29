
import java.util.ArrayList;
import java.util.List;

public class CollectionFramework {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Gautam");
        name.add("Ram");
        name.add("Devang");
        name.add("Brishal");
        name.add("Shubham");
        

        // System.out.println(name.get(3));
        for(String n : name){
            System.out.println(n);
        }
        name.set(1,"het");
        System.out.println(name);
        name.remove(4);
        System.out.println(name);
        
    }

}

