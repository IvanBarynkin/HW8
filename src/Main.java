import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задача №1_______");

        int[] intArr = new int[]{1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        byte[] byteArr = new byte[]{42, 41, 40};
        System.out.println();

        System.out.println("_______Задача №2_______");

        for (int i = 0; i < intArr.length; i++) {

            System.out.print(intArr[i]);
            if (i == intArr.length - 1) {
                System.out.print("");
            } else {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = 0; i < doubleArr.length; i++) {

            System.out.print(doubleArr[i]);
            if (i == doubleArr.length - 1) {
                System.out.print("");
            } else {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = 0; i < byteArr.length; i++) {

            System.out.print(byteArr[i]);
            if (i == byteArr.length - 1) {
                System.out.print("");
            } else {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("_______Задача №3_______");

        for (int i = intArr.length - 1; i >= 0; i--) {

            System.out.print(intArr[i]);
            if (i == 0) {
                System.out.print("");
            } else {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = doubleArr.length - 1; i >= 0; i--) {

            System.out.print(doubleArr[i]);
            if (i == 0) {
                System.out.print("");
            } else {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = byteArr.length - 1; i >= 0; i--) {

            System.out.print(byteArr[i]);
            if (i == 0) {
                System.out.print("");
            } else {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("_______Задача №4_______");

        for (int i = 0; i<intArr.length; i++ ){
            if(intArr[i]%2!=0){
                intArr[i]+=1;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}