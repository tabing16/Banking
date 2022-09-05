import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> strArrayList  = new ArrayList<String>();
        strArrayList.add("Tim");

        Integer integer = Integer.valueOf(54);
        Double myDouble = Double.valueOf(12.50);;

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            intArrayList.add((i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(intArrayList.get(i));
        }
    }
}
