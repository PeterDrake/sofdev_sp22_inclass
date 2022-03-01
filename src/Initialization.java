import java.util.ArrayList;

public class Initialization {

    public static void main(String[] args) {
//        Integer[] a = new Integer[100];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = new Integer(0);
//        }
//        System.out.println(a[5].intValue());

        ArrayList<Integer> a = new ArrayList<Integer>(100);
        for (int i = 0; i < 100; i++) {
            a.add(0);
        }
        System.out.println(a.get(0));
    }

}
