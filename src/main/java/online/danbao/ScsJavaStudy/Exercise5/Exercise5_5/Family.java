package online.danbao.ScsJavaStudy.Exercise5.Exercise5_5;

/**
 * @author: 蛋宝
 * @date: 2022/10/4 21:52
 * @description:
 * f)	Family类有一个电视成员变量 homeTV，
 * 三个方法：买电视buyTV(TV  tv)给homeTV赋值；
 * 看电视watchTV(),调用TV的showProgram()方法进行播放；
 * 远程遥控remoteControl(int c)通过调用TV的setChannel方法实现调台；
 */
public class Family {
    TV homeTV;
    void setHomeTV(TV tv) {
        homeTV = tv;
    }
    String getHomeTV() {
        return homeTV.televesion;
    }
    int getHomeTvNumber() {
        return homeTV.tvnumber;
    }
}
