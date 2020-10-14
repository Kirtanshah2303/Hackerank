import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringToken {
    private static int temp;
    static int counter = 0;
    static int counter1 = 0;
    private static int conttemp;
    static ArrayList list = new ArrayList();
    static ArrayList list2 = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] temp1 = new String[s.length()];
//        System.out.println(s);

        for (int i=0;i<s.length();i++) {
            String temp2 = s.substring(i, i + 1);
            temp1[i] = temp2;
        }
        for (int i=0;i<s.length();i++){
            if (temp1[i].equals(" ") || temp1[i].equals("'") || temp1[i].equals("@")|| temp1[i].equals("!")|| temp1[i].equals("?")|| temp1[i].equals("_")|| temp1[i].equals(",")|| temp1[i].equals(".")){
//                System.out.println("true at ="+i);
//                conttemp++;
                list2.add(i);
                String temp = s.substring(counter1,i);
                if (!list2.contains(i-1)){
//                    System.out.println(temp);
                    conttemp++;
                }


                if (i!=0){
                    if (list.contains(i-1)){
                        counter1 = i+1;
                    }else {
                        counter1 = i+1;
                    }
                }
                //  counter = i+1;


            }
            if (i==s.length()-1){
//                System.out.println(s.substring(counter,s.length()));
//                System.out.println(temp);
            }
        }
        System.out.println(conttemp);
        for (int i=0;i<s.length();i++){
            if (temp1[i].equals(" ") || temp1[i].equals("'") || temp1[i].equals("@")|| temp1[i].equals("!")|| temp1[i].equals("?")|| temp1[i].equals("_")|| temp1[i].equals(",")|| temp1[i].equals(".")){
//                System.out.println("true at ="+i);
//                conttemp++;

                list.add(i);
                String temp = s.substring(counter,i);
                if (!list.contains(i-1)){
                    System.out.println(temp);
//                    conttemp++;
                }


                if (i!=0){
                    if (list.contains(i-1)){
                       counter = i+1;
                    }else {
                        counter = i+1;
                    }
                }
              //  counter = i+1;


            }
            if (i==s.length()-1){
                System.out.println(s.substring(counter,s.length()));
//                System.out.println(temp);
            }
        }
//        if (list.contains(6)){
//            System.out.println("Hello Jii");
//        }
//        System.out.println(conttemp);
//        System.out.println(list);
//        System.out.println(Arrays.toString(temp1));
    }
}
