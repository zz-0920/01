package day4;
//2.定义一个类 Draw ， 在 类 中 提供 3 个 方
//法：输出直角三角形（drawTrian()） 、 输
//出矩形（drawRec()） 及平行四边形（drawPra()） 。通
//过方法可以输出由“*” 组成的一个图形 。最后在测试类中进行调用
public class Draw {
    public void drawTrian(){ //直角三角形
        //外层循环控制:行数
        //*    j=0  -->1
        //***  j=1  -->3
        //*****
        //*******
        //*********
        for(int j=0;j<5;j++) {
            //内层循环控制:每行的内容
            for (int i = 0; i <2*j+1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawRec(){ //矩形
        //外层循环控制:行数
        for(int j=0;j<3;j++) {
            //内层循环控制:每行的内容
            for (int i = 0; i < 10; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawPra(){ //平行四边形
        //外层循环控制:行数
        //******
        //#******
        //##******
        //###******

        for(int j=0;j<4;j++) {
            //内层循环控制:每行的内容
            for(int i=0;i<j;i++){
                System.out.print(" ");
            }
            for (int i = 0; i < 6; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void testRec(){
        for(int i=0;i<6;i++){
            System.out.print("*");
        }
        System.out.println();
        //外层控制行数
        for(int i=0;i<4;i++){
            System.out.print("*");
            for(int j=0;j<4;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<6;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Draw d=new Draw();
        d.drawRec();
        d.drawTrian();
        d.drawPra();
        d.testRec();
    }
}
