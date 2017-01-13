package ArrayHelper;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by anastasiia.shvetsova on 1/12/2017.
 */
public class ArrayHelper {
    public static  void main(String args []){
        int arraySize = 5;
        int evenArraySize = 6;
        changeIndexMinMaxValue(createArray(arraySize));
        copyArray(createArray(arraySize),createArray(arraySize));
        countArrayElements(createArray(arraySize));
        averageOfArray(createArray(arraySize));
        maxAverageHalfOfArray(createArray(evenArraySize));
        sumOfArrays(createArray(arraySize),createArray(arraySize));
        splitArray(createArray(evenArraySize),2,4);
    }

    public static int[] createArray(int size){
        int[] array = new int[size];
        int minValue = 25;
        int maxValue = 75;
        Random random = new Random();
        for(int i=0; i<size; i++){
            array[i] = random.nextInt((maxValue-minValue)+1)+minValue;
        }
        System.out.println("input array = " + Arrays.toString(array));
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
        System.out.println("Copy array " + Arrays.toString(newArray));
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

            maxAverageElements = new int[indexOfHalf+1];

            if(averageFirstPart > averageSecondPart){
                for(int i=0, j=0; i<=indexOfHalf; i++, j++){
                    maxAverageElements[j] = array[i];
                }
            }
           else{
                for(int i=indexOfHalf+1, j=0; i<array.length; i++, j++){
                    maxAverageElements[j] = array[i];
                }
            }
        }

        System.out.println("Elements that have the max everage " +Arrays.toString(maxAverageElements));
        System.out.println();
        return maxAverageElements;
    }

    public static int[] sumOfArrays(int[] array1, int[] array2){
        int[] sumArray = new int[array1.length];
        if(array1.length == array2.length){
            for(int i=0, j=0; i<array1.length; i++,j++){
               sumArray[i] = array1[i]+array2[j];
            }
        } else {
            System.out.println("Arrays should have the same length");
        }
        System.out.println("sum of Arrays = " + Arrays.toString(sumArray));
        System.out.println();
        return sumArray;
    }

    public static int[] splitArray(int[] array, int startIndex, int endIndex){

        if(endIndex > array.length-1){
            System.out.println("End index not correct. Try again");
        }
        int[] splitArray = new int[array.length - startIndex - (array.length-1-endIndex)];
        for(int i=startIndex, j=0; i<endIndex+1; i++,j++){
            splitArray[j] = array[i];
        }
        System.out.println("start index = " + startIndex);
        System.out.println("end index = " + endIndex);
        System.out.println("splir array = " + Arrays.toString(splitArray));
        return splitArray;
    }
}
