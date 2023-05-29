package online.danbao.OS;

/**
 * @author: 蛋宝
 * @date: 2023/5/29 14:52
 * @description:
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test5 {

    public static void main(String[] args) {
        List<Student> students = readScoresFromFile("scores.txt");

        // 输入查询条件
        List<Condition> conditions = new ArrayList<>();
        conditions.add(new Condition("math", ">", 80));
        conditions.add(new Condition("english", "<", 70));

        // 可以根据需要添加更多条件
        List<String> matchingStudents = findMatchingStudents(students, conditions);

        if (matchingStudents.isEmpty()) {
            System.out.println("没有符合条件的学生。");
        } else {
            System.out.println("符合条件的学生：");
            for (String student : matchingStudents) {
                System.out.println(student);
            }
        }
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

    private static List<String> findMatchingStudents(List<Student> students, List<Condition> conditions) {
        List<String> matchingStudents = new ArrayList<>();

        for (Student student : students) {
            boolean isMatched = true;

            for (Condition condition : conditions) {
                String subject = condition.getSubject();
                String operator = condition.getOperator();
                int score = condition.getScore();

                int studentScore;

                if (subject.equalsIgnoreCase("math")) {
                    studentScore = student.getMathScore();
                } else if (subject.equalsIgnoreCase("english")) {
                    studentScore = student.getEnglishScore();
                } else {
                    continue;  // 如果输入的科目不匹配，则跳过该学生
                }

                boolean isConditionMatched = false;

                if (operator.equals(">")) {
                    isConditionMatched = studentScore > score;
                } else if (operator.equals("<")) {
                    isConditionMatched = studentScore < score;
                } else if (operator.equals("=")) {
                    isConditionMatched = studentScore == score;
                }

                if (condition.isAndOperator() && !isConditionMatched) {
                    isMatched = false;
                    break;
                }

                if (condition.isOrOperator() && isConditionMatched) {
                    isMatched = true;
                    break;
                }
            }

            if (isMatched) {
                matchingStudents.add(student.getName());
            }
        }

        return matchingStudents;
    }
}

class Student5 {
    private String name;
    private int studentID;
    private int mathScore;
    private int englishScore;

    public Student5(String name, int studentID, int mathScore, int englishScore) {
        this.name = name;
        this.studentID = studentID;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getStudentID() {
        return studentID;
    }
}

class Condition {
    private String subject;
    private String operator;
    private int score;
    private boolean isAndOperator;
    private boolean isOrOperator;

    public Condition(String subject, String operator, int score) {
        this.subject = subject;
        this.operator = operator;
        this.score = score;
        this.isAndOperator = operator.equalsIgnoreCase("and");
        this.isOrOperator = operator.equalsIgnoreCase("or");
    }

    public String getSubject() {
        return subject;
    }

    public String getOperator() {
        return operator;
    }

    public int getScore() {
        return score;
    }

    public boolean isAndOperator() {
        return isAndOperator;
    }

    public boolean isOrOperator() {
        return isOrOperator;
    }
}

