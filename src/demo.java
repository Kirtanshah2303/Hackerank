import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class demo {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> list = new ArrayList<>();

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 0; i < s.length()-k; i++) {
            for (int j = i; j < i+k; j++) {
                String temp=s.substring(i, i+3);
                list.add(temp);
            }
        }
        String temp1 = s.substring(s.length()-k,s.length());
        list.add(temp1);
        Collections.sort(list);

        smallest = list.get(0);
        largest = list.get(list.size()-1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}