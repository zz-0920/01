package day12;

import java.time.DayOfWeek;
import java.time.LocalDate;

//枚举测试类
public enum MyEnum {
    //枚举提供的三个常量  最后也只会调用三次构造方法
    ONE,TWO,THREE;
    //枚举构造必须私有
    private MyEnum(){}
    String name;  //成员变量
    public void test(){}
    public static void test2(){}

    public static void main(String[] args) {
        MyEnum my1=MyEnum.ONE;
        MyEnum my2=MyEnum.TWO;
        MyEnum my3=MyEnum.THREE;
    }
}
enum MyEnum2{
    //AAA调用有参构造  BBB默认调用无参构造
    //但是最终 只会调用两次构造
    AAA(10,"java"),BBB;
    private MyEnum2(){
        System.out.println("无参");
    }
    private MyEnum2(int a,String b){
        System.out.println("有参");
    }

    public static void main(String[] args) {
        MyEnum2 m1=MyEnum2.AAA;
        MyEnum2 m2=MyEnum2.AAA;
        MyEnum2 m3=MyEnum2.BBB;
        MyEnum2 m4=MyEnum2.BBB;

        //枚举还支持Switch
//        switch (m4){
//            case AAA: ???;
//            case BBB: ???;
//        }
        LocalDate ld=LocalDate.now();
        DayOfWeek dw=ld.getDayOfWeek();
        switch (dw){
            case MONDAY: System.out.println("周一");break;
            case SATURDAY: System.out.println("周六");break;
        }
    }
}
