package plan.attack.StaticVariableTest01;

public class Student {
    //静态变量知识运用实验
    //学生javabean类——静态变量为同一个老师
    public static String teacher;
    public String name;
    public int age;
    private  Student(){};
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("姓名："+name+"  年龄："+age+"  老师："+teacher);
    }

}
