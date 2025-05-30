package day11;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//测试集合排序
public class TestSort {
    List<Integer> list1=new ArrayList<>();
    List<String> list2=new ArrayList<>();
    List<Emp> list3=new ArrayList<>();
    @Before
    public void before(){
       Integer[] nums={10,3,5,1,9,20,11};
       String[] strs={"abc","aaa","ABC","111"};
       Emp[] emps={
               new Emp(10,"易聪1",8989),
               new Emp(70,"易聪2",8989),
               new Emp(30,"易聪3",9000),
               new Emp(50,"易聪4",9000),
               new Emp(40,"易聪5",7000)
       };
       //都是不可变集合
       list1= Arrays.asList(nums);
       list2= Arrays.asList(strs);
       list3= Arrays.asList(emps);
    }
    @Test
    public void test(){
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println("排序后:");
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);
        //默认是不可以针对于 对象来排序 : 因为没有告诉它
        //根据什么属性排序
        //Collections.sort(list3);
    }
    @Test
    public void test2(){
        //对象 先根据工资降序排序 工资相同 根据员工编号升序
        Collections.sort(list3,(e1,e2)->{
            int result=(int)(e2.sal-e1.sal);
            if(result==0){
                result=e1.id-e2.id;
            }
            return result;
        });
        System.out.println(list3);
    }
}
class Emp{
    Integer id;
    String name;
    double sal;
    public Emp(Integer id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}