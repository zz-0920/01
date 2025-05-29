package day11;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//测试集合运算
public class TestListMath{
    List<Integer> list1=new ArrayList<>();
    List<Integer> list2=new ArrayList<>();
    @Before
    public void before(){
        list1.add(10);
        list1.add(30);
        list1.add(50);
        list1.add(70);
        list1.add(90);

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
    }
    @Test
    public void test(){
        //1.想获取两个集合相同的元素
        //list1就会保存的时 相同的元素
        //list1.retainAll(list2);
        //System.out.println(list1); //10 30 50

        //2.获取两个合并的结果
        //list1.addAll(list2);
        //System.out.println(list1);//10 ... 90 10...50

        //3.获取两个集合不同的元素
        //list1就会删除 list2相同的元素
        list1.removeAll(list2);
        System.out.println(list1);//70 90
    }
}
