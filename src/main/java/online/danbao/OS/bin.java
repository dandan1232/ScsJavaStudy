package online.danbao.OS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author: 蛋宝
 * @date: 2023/5/29 13:57
 * @description:
 */
public class bin {

    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("scores.bin"))) {

            for (int i = 0; i < 5; i++) {
                Student student = readStudentInfo();
                writeStudentInfo(outputStream, student);
            }

            System.out.println("成绩单已写入 scores.bin 文件。");

        } catch (IOException e) {
            System.out.println("无法打开文件或写入数据。");
            e.printStackTrace();
        }
    }

    private static Student readStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生姓名：");
        String name = scanner.nextLine();

        System.out.print("请输入学号：");
        int studentID = scanner.nextInt();

        System.out.print("请输入数学成绩：");
        int mathScore = scanner.nextInt();

        System.out.print("请输入英语成绩：");
        int englishScore = scanner.nextInt();

        return new Student(name, studentID, mathScore, englishScore);
    }

    private static void writeStudentInfo(DataOutputStream outputStream, Student student) throws IOException {
        outputStream.writeUTF(student.getName());
        outputStream.writeInt(student.getStudentID());
        outputStream.writeInt(student.getMathScore());
        outputStream.writeInt(student.getEnglishScore());
    }
}

class Student2 {
    private String name;
    private int studentID;
    private int mathScore;
    private int englishScore;

    public Student2(String name, int studentID, int mathScore, int englishScore) {
        this.name = name;
        this.studentID = studentID;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }
}