package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {

    }


    public static int factUsingRecursion(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factUsingRecursion(n - 1);
    }
     public static int factUsingIterative(int n ){

        int product =1;
        for(int i =1; i<n; i++){
            product= product *i;
        }
        return product;
     }

}


