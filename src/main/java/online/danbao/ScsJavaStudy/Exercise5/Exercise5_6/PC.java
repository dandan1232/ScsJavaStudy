package online.danbao.ScsJavaStudy.Exercise5.Exercise5_6;

/**
 * @author: 蛋宝
 * @date: 2022/10/4 22:08
 * @description:
 * PC类要求setCPU（CPU c）将参数c的值赋值给cpu，
 */
public class PC {
    CPU cpu;
    HardDisk HD;
    void setCPU(CPU c) {
        cpu = c;
    }
    void setHardDisk(HardDisk h) {
        HD=h;
    }
    void show() {
        System.out.println("cpu的速度："+cpu.getSpeed());
        System.out.println("硬盘的容量："+HD.getAmount());
    }
}