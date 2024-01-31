package week2;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrrayList1 {
    public static int sum(ArrayList<Integer> arrIn){
        int total=0;
        for (int x=0; x<arrIn.size(); x++){
            total+=arrIn.get(x);
        }
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int x=0;x<4;x++){
            arr1.add(x+4);
        }
        System.out.println(arr1);
        int temp=sum(arr1);
        System.out.println(temp);
        HashMap<String,Integer> bills=new HashMap<>();
        bills.put("Allen",17);
        bills.put("Diggs",14);
        bills.put("Knox",88);
        bills.put("Bass",7);
        System.out.println(bills);
        for (String key : bills.keySet()){
            System.out.println(key);
        }
        for (Integer num : bills.values()){
            System.out.println(num);
        }
        for (String key : bills.keySet()){
            System.out.println(key+": "+bills.get(key));
        }
        for (Integer vals : arr1){
            System.out.println(vals);
        }
    }
}
