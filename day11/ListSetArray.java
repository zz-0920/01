package day11;

import org.junit.Test;

import java.util.*;

//List和Set和数组相互转换
public class ListSetArray {
    @Test
    public void arrayToListSet() {
        //Array===>list 和 Set
        Integer[] nums = {1, 3, 5, 7, 9};
        List<Integer> list = Arrays.asList(nums);
        Set<Integer> set = new HashSet<>(Arrays.asList(nums));
    }

    @Test
    public void listSetToArray() {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        //list===>Array
        Object[] os = list.toArray();
        Integer[] nums = list.toArray(new Integer[0]);
        //set==>Array
        Integer[] nums2 = set.toArray(new Integer[0]);
    }

    @Test
    public void listToSet() {
        //set==>List
        Set set=new HashSet();
        List list=new ArrayList(set);
        //list==>Set
        Set set2=new HashSet(list);
    }
}