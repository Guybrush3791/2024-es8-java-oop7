import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        collectionTest();
    }

    public static void collectionTest() {

        String[] strArray = new String[5];

        List<String> strs = new ArrayList<>();
        List<String> strs2 = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();

        strs.add("Hello");
        strs.add("World");
        strs.add("Java");
        strs.add("Collections");
        strs.add("Framework");

        strs2.add("Ciao");
        strs2.add("Mondo");
        strs2.add("Java");
        strs2.add("Collezioni");
        strs2.add("Framework");

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        System.out.println("-------------------------------------------------------");

        System.out.println(strs);

        System.out.println("-------------------------------------------------------");

        System.out.println(strs2);

        System.out.println("-------------------------------------------------------");

        System.out.println(ints);

        System.out.println("-------------------------------------------------------");

        strs2.addAll(strs);
        strs2.addAll(strs);
        System.out.println(strs2);

        System.out.println("-------------------------------------------------------");

        strs2.addFirst("Test");
        System.out.println(strs2);

        System.out.println("-------------------------------------------------------");

        strs2.clear();
        System.out.println("-------------------------------------------------------");

        boolean isWordPresent = strs.contains("Word");
        System.out.println("Is Word present: " + isWordPresent);

        System.out.println("-------------------------------------------------------");

        strs2.addAll(strs);
        boolean isStrsIsPresent = strs2.containsAll(strs);
        System.out.println("Is strs present: " + isStrsIsPresent);

        System.out.println("-------------------------------------------------------");

        String value0 = strs2.get(0);
        System.out.println("Value at index 0: " + value0);

        System.out.println("-------------------------------------------------------");

        int indexOfJava = strs2.indexOf("Java");
        System.out.println("Index of Java: " + indexOfJava);

        System.out.println("-------------------------------------------------------");

        System.out.println(strs2);
        strs2.remove("Hello");
        System.out.println(strs2);
        strs2.remove(0);
        System.out.println(strs2);

        System.out.println("-------------------------------------------------------");

        List<String> revStrs = strs2.reversed();
        System.out.println(revStrs);

        System.out.println("-------------------------------------------------------");

        int size = strs2.size();
        System.out.println("Size of strs2: " + size);

        System.out.println("-------------------------------------------------------");

        List<String> subStrs = strs2.subList(0, 2);
        System.out.println(subStrs);

        System.out.println("-------------------------------------------------------");

        String[] values = strs2.toArray(new String[0]);
        System.out.println(strs2);
        System.out.println(Arrays.toString(values));
    }
}
