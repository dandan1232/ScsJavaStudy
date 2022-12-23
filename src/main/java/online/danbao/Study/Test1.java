package online.danbao.Study;

import java.util.Scanner;

/**
 * @author: 蛋宝
 * @date: 2022/12/23 14:06
 * @description:从键盘读入一个M行N列(M、N均定义为整型常量)的double型矩阵A计算矩阵A的转置矩阵C，并输出矩阵C.
 */

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入矩阵的行数和列数：");
        int m = input.nextInt();
        int n = input.nextInt();

        double[][] A = new double[m][n];

        System.out.println("请输入矩阵 A 的值：");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = input.nextDouble();
            }
        }
        double[][] C = transpose(A);
        System.out.println("矩阵 C 的值为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static double[][] transpose(double[][] A) {
        double[][] C = new double[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[j][i] = A[i][j];
            }
        }
        return C;
    }
}
