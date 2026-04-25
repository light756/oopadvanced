package plan.attack.FinalTest;

public class Circle {
    //创建一个圆类,测试final关键字功能
    final double PI=3.14;
    private double radius;
    //构造方法
    public Circle(double radius){
        this.radius=radius;
    }
    //设置与输出的方法（set/get）
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double findS(){
        return PI*radius*radius;
    }
    public double findC(){
        return 2*PI*radius;
    }

}
