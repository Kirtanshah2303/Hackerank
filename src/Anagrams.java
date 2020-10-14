import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String x = a.toLowerCase();
        String y = b.toLowerCase();
        String[] strings1 = new String[a.length()];
        String[] strings2 = new String[b.length()];
        for (int i=0;i<a.length()-1;i++){
            String temp = x.substring(i,i+1);
            strings1[i] = temp;
        }
        String temp2 = x.substring(a.length()-1,a.length());
        strings1[a.length()-1] = temp2;
        for (int i=0;i<b.length()-1;i++){
            String temp = y.substring(i,i+1);
            strings2[i] = temp;
        }
        String temp3 = y.substring(b.length()-1,b.length());
        strings2[b.length()-1] = temp3;
//        System.out.println(Arrays.toString(strings2));

        for (int i = 0; i < strings1.length; i++)
        {
            for (int j = i + 1; j < strings1.length; j++) {
//                if (total[i] > total[j])
                if ((strings1[i].compareTo(strings1[j])>0))
                {
                    String tempe;
                    tempe = strings1[i];
                    strings1[i] = strings1[j];
                    strings1[j] = tempe;
                }
            }
        }
//        System.out.println(Arrays.toString(strings1));
        for (int i = 0; i < strings2.length; i++)
        {
            for (int j = i + 1; j < strings2.length; j++) {
//                if (total[i] > total[j])
                if ((strings2[i].compareTo(strings2[j])>0))
                {
                    String tempe;
                    tempe = strings2[i];
                    strings2[i] = strings2[j];
                    strings2[j] = tempe;
                }
            }
        }
//        System.out.println(Arrays.toString(strings2));
        /*System.out.println(Arrays.toString(strings1));
        System.out.println(strings2.toString());

        if (strings1.equals(strings2)){
            return true;
        }else{
            return false;
        }*/
        int temp1 = 0;
        if (strings1.length == strings2.length)
        {
            for (int i = 0; i < strings1.length; i++)
            {
                if (strings1[i].equals(strings2[i]))
                {
                    ++temp1;
                }else {

                }
            }
        }
        return temp1 == strings1.length;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
