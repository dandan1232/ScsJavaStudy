package online.danbao.Exam.Exam11;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author: 蛋宝
 * @date: 2022/11/15 14:08
 * @description:采用缓冲输入输出流完成对一个文件的读写
 */
public class Example10_7 {
    public static void main(String args[]) {
        File fRead = new File("english.txt");
        File fWrite = new File("englishCount.txt");
        try{  Writer out = new FileWriter(fWrite);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader bufferRead =new BufferedReader(in);
            String str = null;
            while((str=bufferRead.readLine())!=null) {
                StringTokenizer fenxi = new StringTokenizer(str);
                int count=fenxi.countTokens();
                str = str+" 句子中单词个数:"+count;
                bufferWrite.write(str);
                bufferWrite.newLine();
            }
            bufferWrite.close();
            out.close();
            in = new FileReader(fWrite);
            bufferRead =new BufferedReader(in);
            String s=null;
            System.out.println(fWrite.getName()+"内容:");
            while((s=bufferRead.readLine())!=null) {
                System.out.println(s);
            }
            bufferRead.close();
            in.close();
        }
        catch(IOException e) {
            System.out.println(e.toString());
        }
    }
}

