package array2;

import java.util.Arrays;

/**
 * Created by anastasiia.shvetsova on 1/13/2017.
 */
public class Array2 {
    public static void main(String arg[]) {
        testCountEvens();
        testSum13();
        testLucky13();
        testFizzArray();
        testNo14();
        testMatchUp();
        testModThree();
        testShiftLeft();
    }

    public static int countEvens(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Number of even ints = " + counter);
        return counter;
    }

    public static void testCountEvens() {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};

        countEvens(array1); //3
        countEvens(array2); //3
        countEvens(array3); //0
    }

    public static int sum13(int[] nums) {
        int sumOfArrayElements = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sumOfArrayElements = sumOfArrayElements + nums[i];
            } else {
                i++;
            }

        }
        System.out.println("sum of the numbers in the array " + sumOfArrayElements);
        return sumOfArrayElements;
    }

    public static void testSum13() {
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {1, 1};
        int[] array3 = {1, 2, 2, 1, 13};

        sum13(array1); //6
        sum13(array2); //2
        sum13(array3); //6
    }

    public static boolean lucky13(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                result = false;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void testLucky13() {
        int[] array1 = {0, 2, 4};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};

        lucky13(array1); //6
        lucky13(array2); //2
        lucky13(array3); //6
    }

    public static int[] fizzArray(int n) {
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = i;
        }
        System.out.println("new Array = " + Arrays.toString(newArray));
        return newArray;
    }

    public static void testFizzArray() {
        int n = 4;
        int n1 = 1;
        int n2 = 10;

        fizzArray(n);  //[0, 1, 2, 3]
        fizzArray(n1); //[0]
        fizzArray(n2); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    public static boolean no14(int[] nums) {
        boolean result = true;
        int counter1 = 0;
        int counter4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter1++;
            }
            if (nums[i] == 4) {
                counter4++;
            }
            if (counter1 > 0 && counter4 > 0) {
                result = false;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void testNo14() {
        int[] array1 = {1, 2, 3};    //true
        int[] array2 = {1, 2, 3, 4}; //false
        int[] array3 = {1, 1, 1, 1}; //true

        no14(array1); //6
        no14(array2); //2
        no14(array3); //6
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;
        int diff;
        for (int i = 0; i < nums1.length; i++) {
            diff = Math.abs(nums2[i] - nums1[i]);
            if( (diff<2 || diff==2) &&(diff !=0)){
                counter++;
            }
        }
        System.out.println("counter " + counter);
        return counter;
    }

    public static void testMatchUp() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 10};
        int[] array3 = {2, 3, 5};
        int[] array4 = {2, 3, 3};

        matchUp(array1, array2);
        matchUp(array1, array3);
        matchUp(array1, array4);
    }

    public static boolean modThree(int[] nums) {
        boolean result = false;
        for(int i=0; i<nums.length-2; i++){
            if(((nums[i]%2 == 0)&&(nums[i+1]%2== 0)&&(nums[i+2]%2 == 0))||
                    ((nums[i]%2 != 0)&&(nums[i+1]%2 != 0)&&(nums[i+2]%2 != 0)))
                result=true;
        }
        System.out.println(result);
        return result;
    }

    public static void testModThree() {
        int[] array1 = {2, 1, 3, 5};    //true
        int[] array2 = {2, 1, 2, 5}; //false
        int[] array3 = {2, 4, 2, 5}; //true

        modThree(array1);
        modThree(array2);
        modThree(array3);
    }

    public static int[] shiftLeft(int[] nums){
        if(nums.length>0){
            int first = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = first;
        }
        System.out.println("new array = " + Arrays.toString(nums));
        return nums;
    }
    public static void testShiftLeft(){
        int[] array1 = {6, 2, 5, 3};
        int[] array2 = {1, 2};
        int[] array3 = {1};

        shiftLeft(array1);
        shiftLeft(array2);
        shiftLeft(array3);
    }


}

