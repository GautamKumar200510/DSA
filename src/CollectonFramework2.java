import java.util.ArrayList;
import java.util.List;

public class CollectonFramework2 {
    public static void main(String[] args) {

        List<Integer> studentId = new ArrayList<>();

        studentId.add(101);
        studentId.add(102);
        studentId.add(103);
        studentId.add(104);
        studentId.add(105);

        
        for (Integer id : studentId) {
            System.out.println(id);
        }

        studentId.set(1, 200);

        System.out.println(studentId);

        studentId.remove(4);

        System.out.println(studentId);
    }

}
