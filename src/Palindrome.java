import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("Enter any String = ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        StringBuilder input1 = new StringBuilder();
        StringBuilder input2 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(s1);
        input2.append(s1);



        // reverse StringBuilder input1
        input1 = input1.reverse();
        String string2 = String.valueOf(input1);

        // print reversed String
//        System.out.println(input1);
        if ((s1.equals(string2))){
            System.out.println("Yes");
        }
    }
}
