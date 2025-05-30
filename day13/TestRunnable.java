package day13;
//通过Runnable来实现线程
//实现Runnable接口  实现run()
//什么是线程对象: 和Thread相关的类才是线程 其他都不是
//Runnable Callable只是用于定义线程执行规则的 他们并不是线程对象

public class TestRunnable implements Runnable{
    //统计 1-100之间  偶数和
    public void run() {
        String name=Thread.currentThread().getName();
        int sum=0;
        for(int i=2;i<=100;i+=2){
            sum+=i;
            System.out.println(name+"统计的总和累加:"+sum);
        }
    }

    public static void main(String[] args) {
        //定义线程是什么逻辑来执行
        TestRunnable t=new TestRunnable();
        //定义两个线程对象  让两个线程按照同一个逻辑执行
        Thread th1=new Thread(t,"线程1");
        Thread th2=new Thread(t,"线程2");
        //开启线程
        th1.start();
        th2.start();

//        Runnable r=()->{};
//        Thread th3=new Thread(r,"线程3");
//        th3.start();
        //由于Runnable可以使用lambda表达式 比第一个实现方式 更加灵活
        new Thread(()->{
            String name=Thread.currentThread().getName();
            int sum=0;
            for(int i=2;i<=100;i+=2){
                System.out.println(name+"--"+sum);
            }
        },"线程3").start();
    }
}
