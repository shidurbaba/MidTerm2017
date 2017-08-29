package problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
String word = "Racecar";

checkPalindrome(word);


    }

    public static void checkPalindrome(String word){
        String actual = word.toLowerCase();
        String reverse = "";

        for(int i = actual.length() - 1; i >= 0; i--){
            reverse = reverse + actual.charAt(i);
        }

        if(actual.equals(reverse)){
            System.out.println("Is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }



    }


