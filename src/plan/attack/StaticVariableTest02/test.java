package plan.attack.StaticVariableTest02;

public class test {
    public static void main(String[] args) {
        //静态方法知识运用实验
        //新建一个数组
        int[] arr={4,2,5,1,8,9};
        PrintUtil.printArray(arr);
        double average=PrintUtil.getAverage(arr);
        System.out.println(average);
    }
}
