package testPackage;

/**
 * Created by anastasiia.shvetsova on 1/11/2017.
 */
public class Main {

    public static void main(String[] args){

        //test firstLast6
        int[] firstLast6ArrayTest1 = {1,2,6};
        int[] firstLast6ArrayTest2= {6, 1, 2, 3};
        int[] firstLast6ArrayTest3 = {13, 6, 1, 2, 3};

        boolean firstLast6Res1 = firstLast6(firstLast6ArrayTest1);
        boolean firstLast6Res2 = firstLast6(firstLast6ArrayTest2);
        boolean firstLast6Res3 = firstLast6(firstLast6ArrayTest3);
        System.out.println("test firstLast6");
        System.out.println(firstLast6Res1);
        System.out.println(firstLast6Res2);
        System.out.println(firstLast6Res3);
        System.out.println();

        //test commonEnd
        int[] commonEndArrayTest1 = {1, 2, 3};
        int[] commonEndArrayTest2 = {7, 3};
        int[] commonEndArrayTest3 = {7, 3, 2};
        int[] commonEndArrayTest4 = {1, 3};

        boolean commonEndRes1 = commonEnd(commonEndArrayTest1,commonEndArrayTest2);
        boolean commonEndRes2 = commonEnd(commonEndArrayTest1,commonEndArrayTest3);
        boolean commonEndRes3 = commonEnd(commonEndArrayTest1,commonEndArrayTest4);

        System.out.println("test commonEnd");
        System.out.println(commonEndRes1);
        System.out.println(commonEndRes2);
        System.out.println(commonEndRes3);

    }

    public static boolean firstLast6(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[0] == 6  || nums[nums.length-1] == 6 ){
                return true;
            }
        }
        return false;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if((a[0] == b[0])||(a[a.length-1] == b[b.length-1])) {
                    return true;
                }
            }
        }
        return false;
    }

}
