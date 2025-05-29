package day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args) {
        String s="sex";
        if(s!=null){
            int len=s.length();
            System.out.println(len);
        }else{
            System.out.println("s是空");
        }
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            a[i]=100;
        }

        SimpleDateFormat sdf=
                new SimpleDateFormat("yyyy-MM-dd");
        //编译报错   try-catch 或 抛出来解决
        //Date d=sdf.parse("2012-10-20");
        //FileInputStream fis=new FileInputStream("");
    }
}
