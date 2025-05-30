package day12;
//工厂模式:目标接口
public interface Product {
     public void product();
}
//目标接口几个实现类
class ProductA implements Product{
    public void product() {
        System.out.println("生产A");
    }
}
class ProductB implements Product{
    public void product() {
        System.out.println("生产B");
    }
}
class ProductC implements Product{
    public void product() {
        System.out.println("生产C");
    }
}

