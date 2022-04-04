package day08;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];

//        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
        System.out.println(arr[3].length);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i][0]);
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = count++;
                System.out.println(arr[i][j]);
            }
        }

        System.out.println(Arrays.deepToString(arr));


    }
}
