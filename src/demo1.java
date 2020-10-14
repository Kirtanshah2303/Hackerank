import java.util.Arrays;
import java.util.Scanner;

public class demo1 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] total = new String[s.length()-k+1];

        for (int i=0;i<s.length()-k;i++){
            String temp = s.substring(i,i+k);
            total[i]=temp;
//            System.out.println(total[i]);
        }
        String temp1 = s.substring(s.length()-k,s.length());
//        int temp = total.length;

//        String[] total1 = new String[tot]
        total[s.length()-k] = temp1;

//        Arrays.sort(total);

        for (int i = 0; i < total.length; i++)
        {
            for (int j = i + 1; j < total.length; j++) {
//                if (total[i] > total[j])
                if ((total[i].compareTo(total[j])>0))
                {
                    String tempe;
                    tempe = total[i];
                    total[i] = total[j];
                    total[j] = tempe;
                }
            }
        }

//        System.out.println(Arrays.toString(total));
//
//        System.out.println(total[0]);
//        System.out.println(total[total.length-1]);
        smallest = total[0];
        largest = total[total.length-1];


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

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