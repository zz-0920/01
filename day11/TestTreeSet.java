package day11;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

//测试TreeSet
public class TestTreeSet {
    @Test
    public void test(){
        Set<Integer> set1=new TreeSet<>();
        Set<String>  set2=new TreeSet<>();
        set1.add(10);
        set1.add(8);
        set1.add(5);
        set1.add(20);
        set1.add(15);
        //底层是红黑树 这个是有顺序的  添加好了
        //红黑树就会按照升序来保存  元素重复了默认去重
        //8-8==0  认为相同
        System.out.println(set1);
        set2.add("java");
        set2.add("jdbc");
        set2.add("mysql");
        set2.add("jdbc");
        //"jdbc".compareTo("jdbc") ==0
        //treeset就会认为是相同的
        //元素重复了默认去重  并排序
        System.out.println(set2);
        Set<Emp> set3=new TreeSet<>((e1,e2)->
                (int)(e2.sal-e1.sal)
        );
        //为什么少个对象 TreeSet底层不是根据元素去重
        //而是根据排序规则 =0去重的
        set3.add(new Emp(10,"朱家骏1",5000));
        set3.add(new Emp(30,"朱家骏2",5000));
        set3.add(new Emp(20,"朱家骏3",6000));
        set3.add(new Emp(40,"朱家骏4",7000));
        System.out.println(set3);



    }
}
