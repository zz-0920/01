package day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//实现 观察者模式:
//属于观察者的抽象类
public abstract class AbstractObServer {
    String name; //观察者对象的姓名
    //更新方法  如果一的一方数据更新了
    //这些观察者对象也要更新数据
    public abstract void update(String msg);
}
//观察者对象具体实现类  表示多的一方
class Person extends AbstractObServer{
    public Person(String name){
        super.name=name;
    }
    public void update(String msg) {
        System.out.println(name+"" +
                "观察者发现猫的状态发生改变,收到新的通知:"+msg);
    }
}
//定义猫的主题
interface CatTopic{
    void add(AbstractObServer os);//添加关注
    void remove(AbstractObServer os);//取消关注
    //猫更新状态的方法  还要负责将关注的人也收到通知
    void update(String msg);
}
//猫对象
class Cat implements CatTopic{
    //定义观察者的集合 保存关注了猫对象的人
    Set<AbstractObServer> set=new HashSet<>();
    public void add(AbstractObServer os) {
        set.add(os);
        System.out.println(os.name+"添加关注");
    }
    public void remove(AbstractObServer os) {
        set.remove(os);
        System.out.println(os.name+"取消关注");
    }
    public void update(String msg) {
        System.out.println("猫的状态改变了:"+msg);
        //同时还要给关注的人 发送通知
        for(AbstractObServer os:set){
            os.update(msg);
        }
    }
}
class TestObServer{
    public static void main(String[] args) {
        //定义一的一方
        CatTopic cat=new Cat();
        //定义多的一方
        AbstractObServer user1=new Person("易聪");
        AbstractObServer user2=new Person("建勇");
        AbstractObServer user3=new Person("子康");
        //添加关注  用于建立依赖关系
        cat.add(user1);
        cat.add(user2);
        cat.add(user3);
        //更新状态  多的一方也会有通知
        cat.update("我饿了");
        //取消关注  取消依赖关系
        cat.remove(user3);
        //更新状态
        cat.update("我死了");
    }
}