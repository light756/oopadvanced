package plan.attack.StaticVariableTest01;

public class test {
    public static void main(String[] args) {
        Student.teacher="Light";
        System.out.println(Student.teacher);
        Student s1 = new Student("第一人员",15);
        Student s2 = new Student("the_second",100);
        s1.show();
        s2.show();
        s2.teacher="2";
        System.out.println(Student.teacher);
        s1.show();
        s2.show();
    }
}
