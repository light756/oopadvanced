package plan.attack.StaticVariableTest02;

public class PrintUtil {
    //创建一个方法类，这个方法传入一个整数数组，然后可以依次打印数组内容
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    //方法类中的第二个方法，将数组中的内容求平均数
    static private double sum;
    public static double getAverage(int[] array){
        for (int j : array) {
            sum += j;
        }
        return sum/array.length;
    }
}
