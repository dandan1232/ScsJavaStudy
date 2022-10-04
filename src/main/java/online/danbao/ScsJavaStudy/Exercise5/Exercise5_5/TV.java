package online.danbao.ScsJavaStudy.Exercise5.Exercise5_5;

/**
 * @author: 蛋宝
 * @date: 2022/10/4 21:51
 * @description: e)	TV类有一个成员变量channel表示频道，三个方法
 * 设置频道setChannel、获取频道getChannel、播放节目showProgram。
 * （假设电视目前5个台，从1-5分别对应经济频道、体育频道、综艺频道、新闻频道、电影频道）
 */
public class TV {
    String televesion;
    int tvnumber;

    void setTelevesion(int number) {
        switch (number) {
            case 1:
                televesion = "综合频道";
                tvnumber = 1;
                break;
            case 2:
                televesion = "经济频道";
                tvnumber = 2;
                break;
            case 3:
                televesion = "文艺频道";
                tvnumber = 3;
                break;
            case 4:
                televesion = "国际频道";
                tvnumber = 4;
                break;
            case 5:
                televesion = "体育频道";
                tvnumber = 5;
                break;
        }
    }

    String getTV(String televesion) {
        return televesion;
    }

    int getTvNumber() {
        return tvnumber;
    }
}
