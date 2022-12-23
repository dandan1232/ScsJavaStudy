package online.danbao.Study.Test3;

/**
 * @author: 蛋宝
 * @date: 2022/12/23 15:52
 * @description:
 */
public class HealthRecord {
    private String name;
    private int steps;

    public HealthRecord(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public int getSteps() {
        return steps;
    }
}
