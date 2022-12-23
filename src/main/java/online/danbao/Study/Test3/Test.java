package online.danbao.Study.Test3;
import java.util.Scanner;
/**
 * @author: 蛋宝
 * @date: 2022/12/23 15:53
 * @description:
 */


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int minSteps = scanner.nextInt();
        int avgSteps = scanner.nextInt();

        HealthRecord[] records = new HealthRecord[days];
        for (int i = 0; i < days; i++) {
            String name = scanner.next();
            int steps = scanner.nextInt();
            records[i] = new HealthRecord(name, steps);
        }

        HealthAssessment assessment = new HealthAssessment(days, minSteps, avgSteps, records);
        System.out.println("平均步数：" + assessment.getAverageSteps());
        System.out.println("运动合格的天数：" + assessment.getQualifiedDays());
        System.out.println("综合评价：" + assessment.getOverallAssessment());
    }
}
