package by.it.galushka.jd01_05;

import by.it.galushka.jd01_05.taskC.TaskC1;
import by.it.galushka.jd01_05.taskC.TaskC2;

public class TaskC {
    public static void main(String[] args) {

        //taskC1();

        taskC2();

    }

    private static void taskC1() {
        double[] array = new double[37];
        TaskC1.getArrayA(array);
        TaskC1.printArrayA(array);
        TaskC1.getArrayB(array);
        TaskC1.printArrayB(array);
        TaskC1.findGeoAvr(array);
    }

    private static void taskC2() {
        int[] arrayA = new int[31];
        TaskC2.getArrayA(arrayA);
        int[] arrayB = TaskC2.getArrayB(arrayA);
        TaskC2.sort(arrayB);
        TaskC2.print(arrayA);
        //TaskC2.print(arrayB);
    }

}
