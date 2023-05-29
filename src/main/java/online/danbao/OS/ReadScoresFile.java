package online.danbao.OS;

/**
 * @author: 蛋宝
 * @date: 2023/5/29 14:18
 * @description:
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadScoresFile {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("scores.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("无法打开文件或读取数据。");
            e.printStackTrace();
        }
    }
}
