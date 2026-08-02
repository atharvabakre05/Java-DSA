import java.util.*;
public class majorityElement{

    public static void main(String[] args){
        int arr[] = {1,3,2,5,1,3,1,5,1}; 
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int i=0; i<arr.length; i++){
        //     int nums = arr[i];
        //     if(hm.containsKey(nums)){
        //         hm.put(nums, hm.get(nums) + 1);
        //     }else{
        //         hm.put(nums, 1);
        //     }
        // }

        for(int i=0; i<n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        //Iteration Loop
        for(Integer key : hm.keySet()){
            if(hm.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
}