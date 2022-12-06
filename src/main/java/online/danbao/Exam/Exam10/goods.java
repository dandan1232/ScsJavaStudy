package online.danbao.Exam.Exam10;

import java.util.Date;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 23:57
 * @description:
 */
    public class goods {
        private String number;
        private String name;
        private Date madeTime;
        private Integer price;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMadeTime() {
        return madeTime;
    }

    public void setMadeTime(Date madeTime) {
        this.madeTime = madeTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
        public String toString() {
            return "goods{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    ", madeTime='" + madeTime + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }


    }