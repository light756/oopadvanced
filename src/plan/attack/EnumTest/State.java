package plan.attack.EnumTest;

public enum State {
    //枚举类实验
    ATTACK("攻击"),
    DEFENSE("防御"),
    TRAIN("训练"),
    MOVE("移动");
    private State(String name){
        this.name = name;
        System.out.println("发生构造! "+"枚举类"+name);
    }
    private String name;
    //get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
