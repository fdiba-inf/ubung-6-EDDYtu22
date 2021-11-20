package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int p;
        int number = input.nextInt();
        String sNumber = Integer.toString(number);

        for (int i = 0; i < sNumber.length(); i++) {
            for (p = sNumber.length() - 1; p >= 0; p--) {

                if (sNumber.charAt(i) == sNumber.charAt(p) ) {
                    flag = true;
                }else if (sNumber.charAt(i) != sNumber.charAt(p)){
                    flag = false;
                }
            }

                if(i == sNumber.length() - 1 && flag ) {
                    System.out.println("Palindrome: true");
                } else if (i == sNumber.length() - 1 && !flag) {
                    System.out.println("Palindrome: false");
                }
            }
    }
}

