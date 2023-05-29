package online.danbao.OS;

/**
 * @author: 蛋宝
 * @date: 2023/5/29 14:31
 * @description:
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScoreAnalyzer {

    public static void main(String[] args) {
        List<Student> students = readScoresFromFile("scores.txt");

        // 查询最高成绩
        int highestScore = findHighestScore(students);
        System.out.println("最高成绩：" + highestScore);

        // 查询某学生的最高分
        String studentName = "Tom";
        int studentHighestScore = findStudentHighestScore(students, studentName);
        System.out.println(studentName + " 的最高分：" + studentHighestScore);

        // 计算分数低于60的人数
        int below60Count = countScoresBelow(students, 60);
        System.out.println("分数低于60的人数：" + below60Count);

    }


    private static List<Student> readScoresFromFile(String filePath) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int studentID = Integer.parseInt(parts[1]);
                int mathScore = Integer.parseInt(parts[2]);
                int englishScore = Integer.parseInt(parts[3]);

                Student student = new Student(name, studentID, mathScore, englishScore);
                students.add(student);
            }
        } catch (IOException e) {
            System.out.println("无法打开文件或读取数据。");
            e.printStackTrace();
        }

        return students;
    }

    private static int findHighestScore(List<Student> students) {
        int highestScore = Integer.MIN_VALUE;

        for (Student student : students) {
            int maxScore = Math.max(student.getMathScore(), student.getEnglishScore());
            highestScore = Math.max(highestScore, maxScore);
        }

        return highestScore;
    }

    private static int findStudentHighestScore(List<Student> students, String studentName) {
        int highestScore = Integer.MIN_VALUE;

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(studentName)) {
                int maxScore = Math.max(student.getMathScore(), student.getEnglishScore());
                highestScore = Math.max(highestScore, maxScore);
            }
        }

        return highestScore;
    }

    private static int countScoresBelow(List<Student> students, int threshold) {
        int count = 0;

        for (Student student : students) {
            if (student.getMathScore() < threshold || student.getEnglishScore() < threshold) {
                count++;
            }
        }

        return count;
    }
}

class Student4 {
    private String name;
    private int studentID;
    private int mathScore;
    private int englishScore;

    public Student4(String name, int studentID, int mathScore, int englishScore) {
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

