package online.danbao.ScsJavaStudy.Chapter1_3;

import java.util.Scanner;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 9:55
 * @description:编程实现：定义一个长度为10的整数数组，用折半查找法查找某个整数x（由用户输入）是否在数组中，并返回结果。
 */
public class IfInArray {
    public static void main(String[] args) {

        int start = 0;
        int end;
        int middle;
        int sort[] = {10, 23, 45, 63, 13, -39, 0, 12, 83, 10};
        int Num = sort.length;
        //将数组排序
        for (int i = 0; i < Num; i++) {
            for (int j = i + 1; j < Num; j++) {
                if (sort[j] < sort[i]) {
                    int temp = sort[j];
                    sort[j] = sort[i];
                    sort[i] = temp;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入整数，程序判断该数是否在数组中：");
        int number = scanner.nextInt();
        int count = 0;
        end = Num;
        middle = (start + end) / 2;
        while (number != sort[middle]) {
            if (number > sort[middle]) {
                start = middle;
            } else if (number < sort[middle]) {
                end = middle;
            }
            middle = (start + end) / 2;
            count++;
            if (count > Num / 2) {
                break;
            }
        }
        if (count > Num / 2) {
            System.out.printf("%d不在数组中。\n", number);
        } else {
            System.out.printf("%d在数组中。\n", number);
        }
    }
}