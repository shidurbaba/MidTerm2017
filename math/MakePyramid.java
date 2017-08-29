package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here
    int row = 6;

    for(int i = 0; i < row; i++){
        for(int j = 0; j < row - i; j++){
            System.out.println(" ");
        }
        for(int k = 0; k <=1; k++){
            System.out.println("* ");
        }
        System.out.println();
    }

    }
        }


