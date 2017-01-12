package testPackage;
import java.util.Arrays;

/**
 * Created by anastasiia.shvetsova on 1/11/2017.
 */
public class Main {

    public static void main(String[] args){

        //test firstLast6
        int[] firstLast6ArrayTest1 = {1,2,6};
        int[] firstLast6ArrayTest2= {6, 1, 2, 3};
        int[] firstLast6ArrayTest3 = {13, 6, 1, 2, 3};

        System.out.println("test firstLast6");
        firstLast6(firstLast6ArrayTest1);
        firstLast6(firstLast6ArrayTest2);
        firstLast6(firstLast6ArrayTest3);
        System.out.println();

        //test commonEnd
        int[] commonEndArrayTest1 = {1, 2, 3};
        int[] commonEndArrayTest2 = {7, 3};
        int[] commonEndArrayTest3 = {7, 3, 2};
        int[] commonEndArrayTest4 = {1, 3};

        System.out.println("test commonEnd");
        commonEnd(commonEndArrayTest1,commonEndArrayTest2);
        commonEnd(commonEndArrayTest1,commonEndArrayTest3);
        commonEnd(commonEndArrayTest1,commonEndArrayTest4);
        System.out.println();

        //test middleWay
        int[] middleWayArray1 = {1,2,3};
        int[] middleWayArray2 = {4,5,6};
        int[] middleWayArray3 = {1,2,3,4,5};
        int[] middleWayArray4 = {6,7,8,9};

        System.out.println("test middleWay");
        middleWay(middleWayArray1, middleWayArray2);
        middleWay(middleWayArray3, middleWayArray4);
        System.out.println();

        //test no23
        int[] no23Array1 = {4,5};
        int[] no23Array2 = {4,2};
        int[] no23Array3 = {3,5};

        System.out.println("test no23");
        no23(no23Array1);
        no23(no23Array2);
        no23(no23Array3);
        System.out.println();

        //test fix23
        int[] fix23Array1 = {1,2,3};
        int[] fix23Array2 = {2,3,5};
        int[] fix23Array3 = {1,2,1};

        System.out.println("test fix23");
        fix23(fix23Array1);
        fix23(fix23Array2);
        fix23(fix23Array3);
        System.out.println();

        //test makeMiddle
        int[]  makeMiddleArray1 = {1,2,3,4};
        int[]  makeMiddleArray2 = {7, 1, 2, 3, 4, 9};
        int[]  makeMiddleArray3 = {1,2};

        System.out.println("test makeMiddle");
        makeMiddle(makeMiddleArray1);
        makeMiddle(makeMiddleArray2);
        makeMiddle(makeMiddleArray3);
        System.out.println();

        //test midThree
        int[]  midThreeArray1 = {1,2,3,4,5};
        int[]  midThreeArray2 = {8, 6, 7, 5, 3, 0, 9};
        int[]  midThreeArray3 = {1,2,3};

        System.out.println("test midThree");
        midThree(midThreeArray1);
        midThree(midThreeArray2);
        midThree(midThreeArray3);
        System.out.println();

        //test unlucky1
        int[]  unlucky1Array1 = {1, 3, 4, 5};
        int[]  unlucky1Array2 = {2, 1, 3, 4, 5};
        int[]  unlucky1Array3 = {1,1,1};

        System.out.println("test unlucky1");
        unlucky1(unlucky1Array1);
        unlucky1(unlucky1Array2);
        unlucky1(unlucky1Array3);
        System.out.println();

    }

    public static boolean firstLast6(int[] nums) {
        boolean result = false;
        for(int i=0; i<nums.length; i++){
            if(nums[0] == 6  || nums[nums.length-1] == 6 ){
                result = true;
            }
        }
        System.out.println(result);
        return result;

    }

    public static boolean commonEnd(int[] a, int[] b) {
        boolean result = false;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if((a[0] == b[0])||(a[a.length-1] == b[b.length-1])) {
                    result = true;
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] middleArray = new int[a.length-2 + b.length-2];
        for(int i=0; i<a.length-1; i++){
            middleArray[i] = a[i+1];
        }
        for(int i=a.length-2, j=0; i<middleArray.length; i++, j++){
            middleArray[i] = b[j+1];
        }
        System.out.println(Arrays.toString(middleArray));
        return middleArray;

    }

    public static boolean no23(int[] nums) {
        boolean result = true;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3){
                result = false;
            }
        }
        System.out.println(result);
        return result;
    }

    public static int[] fix23(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 2 && nums[i+1] == 3 ){
                nums[i+1] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static int[] makeMiddle(int[] nums) {
        int[] middleArray = {};
        if(nums.length == 2 ){
            for(int i=0; i<nums.length; i++){
                middleArray = new int[2];
                middleArray[i] = nums[i];
                //System.out.println(middleArray[0]);
            }
        }
        if (nums.length > 2){
            if(nums.length%2 == 0 ){
                middleArray = new int[2];
                middleArray[0] = nums[nums.length/2 -1];
                middleArray[1]= nums[nums.length/2 ];
            } else{
                middleArray = new int[1];
                middleArray[0] = nums[(int) Math.floor(nums.length/2)];
            }

        }
        System.out.println(Arrays.toString(middleArray));
        return middleArray;
    }

    public static int[] midThree(int[] nums) {
        int[] midThreeArray = {};
        if(nums.length == 3 ){
            for(int i=0; i<nums.length; i++){
                midThreeArray = new int[3];
                midThreeArray[i] = nums[i];
            }
        }
        if (nums.length > 2){
            if(nums.length%2 == 0 ){
                midThreeArray = new int[2];
                midThreeArray[0] = nums[nums.length/2 -1];
                midThreeArray[1]= nums[nums.length/2 ];
            } else{
                midThreeArray = new int[3];
                midThreeArray[0] = nums[(int) Math.floor(nums.length/2)-1];
                midThreeArray[1] = nums[(int) Math.floor(nums.length/2)];
                midThreeArray[2] = nums[(int) Math.floor(nums.length/2)+1];
            }

        }
        System.out.println(Arrays.toString(midThreeArray));
        return midThreeArray;
    }

    public static boolean unlucky1(int[] nums) {
        boolean result = false;
        if(nums.length ==1 ||nums.length ==0){
            return result;
        }
        for(int i=0; i<nums.length; i++){
            if(((nums[0]==1) && (nums[1]==3)) || ((nums[1]==1) && (nums[2]==3)) || (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)){
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }

}
