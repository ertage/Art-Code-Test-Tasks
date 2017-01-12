package ArrayHelper;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by anastasiia.shvetsova on 1/12/2017.
 */
public class ArrayHelper {
    public static  void main(String args []){
        int arraySize = 5;
        //changeIndexMinMaxValue(createArray(arraySize));
       // copyArray(createArray(arraySize),createArray(arraySize));
       // countArrayElements(createArray(arraySize));
       // averageOfArray(createArray(arraySize));
        int[] a = {1,2,3, 4,1,5};
        maxAverageHalfOfArray(a);
    }

    public static int[] createArray(int size){
        int[] array = new int[size];
        Random random = new Random();
        for(int i=0; i<size; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static  int changeIndexMinMaxValue(int[] array){
        int minValue = array[0];
        int maxValue = 0;
        int minIndex = 0;
        int maxIndex = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]<minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        for(int i=0; i<array.length; i++){
            if(array[i]>maxValue){
                maxValue = array[i];
                maxIndex = i;

            }

        }
        array[maxIndex] = minValue;
        array[minIndex] = maxValue;
        System.out.println("new array " + Arrays.toString(array));
        System.out.println("Min value = " + minValue);
        System.out.println("Max value = " + maxValue);
        System.out.println();
        return minValue;
    }

    public static int[] copyArray(int[] a, int[] b){
        int[] newArray = new int[a.length + b.length];

        for(int i=0; i<a.length; i++){
            newArray[i] =  a[i];
        }
        for(int i=a.length, j=0; i<newArray.length; i++, j++){
            newArray[i] =  b[j];
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println();
        return newArray;
    }

    public static int countArrayElements(int[] array){
        int count = 0;
        for (int i=0; i<array.length; i++){
            count++;
        }
        System.out.println("count of array " + count);
        System.out.println();
        return count;
    }

    public static int averageOfArray(int[] array){
        int count = 0;
        int sum = 0;
        int average;
        for (int i=0; i<array.length; i++){
            sum = array[i] + sum;
            count++;
        }
        average = sum/count;

        System.out.println("average of array " + average);
        System.out.println();
        return average;
    }

    public static int[] maxAverageHalfOfArray(int[] array){
        int averageFirstPart = 0;
        int averageSecondPart = 0;
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        int[] maxAverageElements ={};
        int counter = 0;
        int halfCounter = 0;
        int indexOfHalf = 0;


        if(array.length%2 == 0){
            indexOfHalf = array.length/2-1;
            for(int i=0; i<array.length; i++){
                counter++;
                if(i<=indexOfHalf){
                    sumFirstPart = array[i] + sumFirstPart;
                } else{
                    sumSecondPart = array[i] + sumSecondPart;
                }

            }
            halfCounter = counter/2;
            averageFirstPart = sumFirstPart/halfCounter;
            averageSecondPart = sumSecondPart/halfCounter;

            maxAverageElements = new int[indexOfHalf];

            if(averageFirstPart > averageSecondPart){
                for(int i=0; i<=indexOfHalf; i++){
                    maxAverageElements[i] = array[i];
                }
            }
           else{
                for(int i=indexOfHalf+1; i<array.length; i++){
                    maxAverageElements[i] = array[i];
                }
            }
        }

        System.out.println(Arrays.toString(maxAverageElements));
        return maxAverageElements;
    }
}
