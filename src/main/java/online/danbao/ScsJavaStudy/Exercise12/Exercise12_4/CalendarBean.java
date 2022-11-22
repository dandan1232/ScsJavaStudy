package online.danbao.ScsJavaStudy.Exercise12.Exercise12_4;

import java.util.Calendar;

/**
 * @author: 蛋宝
 * @date: 2022/11/22 14:40
 * @description:
 * 编写一个应用程序，有一个窗口，该窗口为BorderLayout布局。
 * 窗口的中心添加一个Panel容器：pCenter，pCenter的布局是7行7列的GriderLayout布局，pCenter中放置49个标签，
 * 用来显示日历。窗口的北面添加一个Panel容器pNorth，其布局是FlowLayout布局，pNorth放置两个按钮：nextMonth和previousMonth，单击nextMonth按钮，
 * 可以显示当前月的下一月的日历；单击previousMonth按钮，
 * 可以显示当前月的上一月的日历。窗口的南面添加一个Panel容器pSouth，其布局是FlowLayout布局，
 * pSouth中放置一个标签用来显示一些信息。
 */
public class CalendarBean
    {
        String  day[];
        int year=2018,month=0;
        public void setYear(int year)
        {
            this.year=year;
        }
        public int getYear()
        {
            return year;
        }
        public void setMonth(int month)
        {
            this.month=month;
        }
        public int getMonth()
        {
            return month;
        }
        public String[] getCalendar()
        {   String a[]=new String[42];
            Calendar 日历=Calendar.getInstance();
            日历.set(year,month-1,1);
            int 星期几=日历.get(Calendar.DAY_OF_WEEK)-1;
            int day=0;
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            {
                day=31;
            }
            if(month==4||month==6||month==9||month==11)
            {
                day=30;
            }
            if(month==2)
            {  if(((year%4==0)&&(year%100!=0))||(year%400==0))
            {
                day=29;
            }
            else
            {
                day=28;
            }
            }
            for(int i=星期几,n=1;i<星期几+day;i++)
            {
                a[i]=String.valueOf(n) ;
                n++;
            }
            return a;
        }
    }