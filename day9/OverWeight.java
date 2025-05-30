package exception;

import java.util.Scanner;

//比如:输入:
//199        输出:  目前装载了199吨货物
//400        输出:  目前装载了599吨货物
//300        输出:  目前装载了899吨货物
//300        输出:  超重
public class OverWeight {
    double sum=1000;
    double weight;
    public void input(double n) throws OverWeightException {
        if(n<0){
            System.out.println("物品重量不能为负数");
        }else if(weight+n<=sum){
            weight+=n;
            System.out.println("目前装载了"+weight+"吨");
        }else{
            throw new OverWeightException("超重");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        OverWeight over=new OverWeight();
        //无论是否超重 都需要正点启航
        try {
            for(int i=0;i<30;i++){
                System.out.println("请输入装箱重量");
                int n=sc.nextInt();
                over.input(n);
            }
        } catch (OverWeightException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("开始正点启航");
        }

    }
}
class OverWeightException extends Exception{
    public OverWeightException(String msg){
        super(msg);
    }
}