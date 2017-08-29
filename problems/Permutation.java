package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {
    permutation("", "ABC");

    }

    public static void permutation (String prefix, String str){
        int n = str.length();
        if(n==0){
            System.out.println(prefix);
        }else{
            for(int i = 0; i<n; i++){
                permutation(prefix +str.charAt(i), str.substring(0,1)+str.substring(i+1, n));
            }
        }
    }

}

