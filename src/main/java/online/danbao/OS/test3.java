package online.danbao.OS;

import java.io.File;

/**
 * @author: 蛋宝
 * @date: 2023/5/29 14:06
 * @description:
 */

public class test3 {

    public static void main(String[] args) {
        String disk = "D:\\Study\\ScsJavaStudy";  // 指定磁盘

        printDirectoryContents(disk);
    }

    private static void printDirectoryContents(String disk) {
        File rootDirectory = new File(disk);

        // 检查磁盘是否存在
        if (!rootDirectory.exists() || !rootDirectory.isDirectory()) {
            System.out.println("磁盘不存在：" + disk);
            return;
        }

        // 获取磁盘下的所有文件和目录
        File[] files = rootDirectory.listFiles();

        // 遍历文件和目录
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // 打印文件名
                    System.out.println("文件：" + file.getName());
                } else if (file.isDirectory()) {
                    // 打印目录名
                    System.out.println("目录：" + file.getAbsolutePath());

                    // 递归调用打印子目录内容
                    printDirectoryContents(file.getAbsolutePath());
                }
            }
        }
    }
}
