package day08;

public class Array2DEx {
    public static void main(String[] args) {
        int[][] arrs = {{90, 70, 90}, {100, 90, 100}, {30, 90, 70}};

        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("===============================");

        for (int i = 0; i < arrs.length; i++) {
            System.out.println(i + 1);
            int total = 0;
            for (int j = 0; j < arrs[0].length; j++) {
                System.out.println("%t%d", arrs[i][j]);
                total += arrs[i][j];
            }
            System.out.printf("\t%d\t%d", total, total / 3);
            System.out.println();
        }


        System.out.println("===============================");
    }
}
