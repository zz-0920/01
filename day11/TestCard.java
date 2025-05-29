package day11;

import org.junit.Test;

import java.util.*;

//定义扑克牌(♣10  ♠10  ♦K  ♥J  ♥A  ♦3 ....)
//让你按照 整理牌的顺序 对这个数据进行排序
//规则:相同的在一起  2最大  3最小 ...
public class TestCard {
    //🃏  🃏
    String[] color={"♣","♠","♥","♦"};
    String[] num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
    @Test
    public void test(){
        //保存52张牌
        List<Card> list=new ArrayList<>();
        for(String c:color){
            for(int i=0;i<num.length;i++){
               list.add(new Card(c+num[i],i));
            }
        }
        System.out.println(list);
        System.out.println("洗牌....");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("抽16张牌....");
        Set<Card> set=new TreeSet<>((c1,c2)->{
            //先根据面值排序
            int result=c2.n-c1.n;
            //如果面值一样 再根据花色排序 否则 相同的面值会 去重
            if(result==0) result=c1.str.compareTo(c2.str);
            return result;
        });
        for(int i=0;i<16;i++){
            set.add(list.get(i));
        }
        System.out.println(set);
    }

}
class Card{
    String str;//牌的内容 ♣5  ♠A
    int n;//牌的大小   K<A<2
    public Card(String str, int n) {
        this.str = str;
        this.n = n;
    }
    public String toString() {
        return str;
    }
}