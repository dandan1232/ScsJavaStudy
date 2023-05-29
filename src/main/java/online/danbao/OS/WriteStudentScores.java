package online.danbao.OS;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author: 蛋宝
 * @date: 2023/5/29 14:14
 * @description:
 */

public class WriteStudentScores {

    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("scores.txt"))) {

            for (int i = 0; i < 5; i++) {
                Student student = readStudentInfo();
                writeStudentInfo(writer, student);
            }

            System.out.println("成绩单已写入 scores.txt 文件。");

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

    private static void writeStudentInfo(PrintWriter writer, Student student) {
        writer.println(student.getName() + "," + student.getStudentID() + "," +
                student.getMathScore() + "," + student.getEnglishScore());
    }
}

class Student {
    private String name;
    private int studentID;
    private int mathScore;
    private int englishScore;

    public Student(String name, int studentID, int mathScore, int englishScore) {
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
