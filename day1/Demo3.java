package day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("JAVA成绩:");
        double java=sc.nextDouble();
        System.out.print("SQL成绩:");
        double sql=sc.nextDouble();
        System.out.print("redis成绩:");
        double redis=sc.nextDouble();
        System.out.println("---------------------");
        System.out.println("java\tsql\tredis");
        System.out.println(java+"\t"+sql+"\t"+redis);
        System.out.println("---------------------");
        double decr=java-sql;
        double sum=java+sql+redis;
        //实现数字格式话 而且保留小数点1位
        DecimalFormat df=new DecimalFormat("#.#");
        double avg=sum/3;
        String result=df.format(avg);
        System.out.println("java和sql成绩差:"+decr);
        System.out.println("三门成绩平均分:"+result);
    }
}
