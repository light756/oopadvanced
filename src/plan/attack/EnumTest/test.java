package plan.attack.EnumTest;

public class test {
    public static void main(String[] args) {
        //测试枚举类
        State s1=State.ATTACK;
        System.out.println(s1.getName());
        s1.setName("atk");
        //测试values()方法
        State[] states=State.values();
        for (State state : states) {
            System.out.println(state.getName());
        }
        //测试valueOf()方法
        State s2=State.valueOf("DEFENSE");
        System.out.println(s2.getName());
    }
}
