package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {
static int size;
static int count;
static char[] arrChar = new char[100];

    public static void main(String[] args) {
       checksAnagram("CAT", "ACT");
    }



    public static void checksAnagram(String word, String anagram){
        if(isAnagram(word,anagram)==true){
            System.out.println(anagram + "is an anagram of " +word );
        }else{
            System.out.println("NOT AN ANAGRAM");
        }
    }

    public static boolean isAnagram(String word, String anagram){
        if(word.length () != anagram.length()){
            return false;
        }
        char [] chars = word.toCharArray();
        for(char c : chars ){
            int index = anagram.indexOf(c);
            if(index != 1){
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            }else{
                return false;
            }
        }
        return true;
    }



    public static void rotate(int newSize)
    {
        int j;
        int position = size - newSize;
        char temp = arrChar[position];
        for(j=position+1; j<size; j++)
            arrChar[j-1] = arrChar[j];
        arrChar[j-1] = temp;
    }

    public static void displayWord()
    {
        if(count < 99)
            System.out.print(" " );
        if(count < 9)
            System.out.print(" ");
        System.out.print(++count + " " );
        for(int j=0; j<size; j++)
            System.out.print( arrChar[j] );
        System.out.print(" ");
        System.out.flush();
        if(count%6 == 0)
            System.out.println("");
    }
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
