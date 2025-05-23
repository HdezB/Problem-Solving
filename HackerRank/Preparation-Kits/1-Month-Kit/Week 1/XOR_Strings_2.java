// Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
// To know more about XOR Click Here
// Debug the given function strings_xor to find the XOR of the two given strings appropriately. 

import java.util.*;

public class XOR_Strings_2 {

    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res = res + "0";
            else
                res = res + "1";
        }

        return res;
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }

}