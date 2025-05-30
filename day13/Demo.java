package day13;

public class Demo {
    public static void main(String[] args) {
        Thread vip=new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=1;i<=10;i++){
                System.out.println(name+"正在看第"+i+"个");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"vip用户");
        Thread user=new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=1;i<=50;i++){
                System.out.println(name+"正在看第"+i+"个");
                try {
                    Thread.sleep(500);
                    if(i==10) vip.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"普通用户");

        vip.setPriority(Thread.MAX_PRIORITY);
        user.setPriority(Thread.MIN_PRIORITY);

        vip.start();
        user.start();
    }
}
