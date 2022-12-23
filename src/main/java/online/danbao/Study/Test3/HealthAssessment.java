package online.danbao.Study.Test3;

/**
 * @author: 蛋宝
 * @date: 2022/12/23 15:53
 * @description:
 */
public class HealthAssessment {
    private int days;
    private int minSteps;
    private int avgSteps;
    private HealthRecord[] records;

    public HealthAssessment(int days, int minSteps, int avgSteps, HealthRecord[] records) {
        this.days = days;
        this.minSteps = minSteps;
        this.avgSteps = avgSteps;
        this.records = records;
    }

    public double getAverageSteps() {
        int totalSteps = 0;
        for (HealthRecord record : records) {
            totalSteps += record.getSteps();
        }
        return (double) totalSteps / days;
    }

    public int getQualifiedDays() {
        int qualifiedDays = 0;
        for (HealthRecord record : records) {
            if (record.getSteps() >= minSteps) {
                qualifiedDays++;
            }
        }
        return qualifiedDays;
    }

    public String getOverallAssessment() {
        double avgSteps = getAverageSteps();
        int qualifiedDays = getQualifiedDays();
        if (avgSteps < this.avgSteps) {
            return "运动的总量不足";
        } else if (qualifiedDays < days) {
            return days + "天偷懒了哦";
        } else {
            return "非常好";
        }
    }
}
