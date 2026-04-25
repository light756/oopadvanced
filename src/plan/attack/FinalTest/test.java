package plan.attack.FinalTest;

public class test {
    static void main() {
        //测试圆类
        Circle c1 = new Circle(10);
        c1.setRadius(10);
        System.out.println("c1的半径为："+c1.getRadius());
        System.out.println("c1的面积为："+c1.findS());
        System.out.println("c1的周长为："+c1.findC());

    }
}
