import java.lang.reflect.Array;
        import java.util.ArrayList;
        import java.util.Arrays;

public class Solution {
    public static void main(String[] args){

        int[] array = {1,22,9};

        ArrayList<Integer> conrespondingAns = nextFibonacci(array);

        //print out the ans
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(conrespondingAns.toArray()));


    }
    //return an ArrayList that contain proper ans
    public static ArrayList<Integer> nextFibonacci(int[] array) {
        int max = getTheMaxNumber(array);
        ArrayList<Integer> result = new ArrayList<Integer> ();
        ArrayList<Integer> SequenceOfFibonacciJustGreaterThanMax = getSequenceOfFibonacci(array,max);
        for (int i:array){
            int numberGreater = getnumberGreater(i,SequenceOfFibonacciJustGreaterThanMax);
            result.add(numberGreater);
        }

        return result;
    }

    //to get the number in the sequence just greater than the number in array
    public static int getnumberGreater(int i, ArrayList<Integer> sequenceOfFibonacciJustGreaterThanMax) {
        int numberJustGreater = 1;
        for (Integer element :sequenceOfFibonacciJustGreaterThanMax){
            if (element < i){
                continue;
            }else{
                numberJustGreater = element;
                break;
            }
        }
        return numberJustGreater;
    }


    private static ArrayList<Integer> getSequenceOfFibonacci(int[] array,int max) {
        ArrayList<Integer> sequenceOfFibonacci = new ArrayList<Integer>();
        //intialize the sequenceOfFibonacci
        sequenceOfFibonacci.add(1);
        sequenceOfFibonacci.add(1);
        int size = sequenceOfFibonacci.size();

        while (sequenceOfFibonacci.get(size-1) < max ){
            sequenceOfFibonacci.add(sequenceOfFibonacci.get(size-1) + sequenceOfFibonacci.get(size-2));
            size++;
        }
        return sequenceOfFibonacci;
    }

    public static int getTheMaxNumber(int[] array) {
        int max = Integer.MIN_VALUE;

        for(int number : array){
            if(number > max){
                max = number;
            }
        }
        return max;
    }


}
