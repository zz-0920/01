package day9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

//计算促销日,输入一个生产日期,再输入一个保质期(天)
// 促销日 是该商品过期时间的前两周的周三
//计算出 促销日是什么
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入生产日期(年-月-日)");
        String time=sc.next();
        System.out.println("在输入保质期");
        int day=sc.nextInt();
        //String==>Date  借助于SimpleDateFormat
        //String==>LocalDate 借助于parse()
        LocalDate product=LocalDate.parse(time);
        System.out.println("生产日期:"+product);
        LocalDate overdue=product.plusDays(day);
        System.out.println("过期时间:"+overdue);
        //减去两周
        overdue=overdue.minusWeeks(2);
        //通过枚举类型 设置日期 是周三
        overdue=overdue.with(DayOfWeek.WEDNESDAY);
        System.out.println("促销日:"+overdue);



    }
}
