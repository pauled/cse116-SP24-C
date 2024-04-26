package week13;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static ArrayList<Integer> splitArrayList(
            ArrayList<Integer> numbers,int start,int end){
        ArrayList<Integer> out=new ArrayList<>();
        for (int i=start; i<end; i++){
            out.add(numbers.get(i));
        }
        return out;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> left,
                                           ArrayList<Integer> right){
        ArrayList<Integer> sorted=new ArrayList<>();
        int leftPtr=0;
        int rightPtr=0;
        while (leftPtr<left.size() && rightPtr<right.size()){
            if (left.get(leftPtr)<right.get(rightPtr)){
                sorted.add(left.get(leftPtr));
                leftPtr++;
            } else {
                sorted.add(right.get(rightPtr));
                rightPtr++;
            }
        }
        while (leftPtr<left.size()) {
            sorted.add(left.get(leftPtr));
            leftPtr++;
        }
        while (rightPtr<right.size()) {
            sorted.add(right.get(rightPtr));
            rightPtr++;
        }
        return sorted;
    }
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> numbers){
        if (numbers.size()<2){
            return numbers;
        } else {
            int mid=numbers.size()/2;
            ArrayList<Integer> left=splitArrayList(numbers,0,mid);
            ArrayList<Integer> right=splitArrayList(numbers,mid,numbers.size());
            ArrayList<Integer> leftSorted=mergeSort(left);
            ArrayList<Integer> rightSorted=mergeSort(right);
            ArrayList<Integer> sorted=merge(leftSorted,rightSorted);
            return sorted;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(
                6,3,5,7,8,9,0,6,4,4,3,2,2,1,5
        ));
        ArrayList<Integer> sorted=mergeSort(numbers);
        System.out.println(sorted);
    }
}
