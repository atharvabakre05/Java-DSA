import java.util.*;
public class ContainerWithMostWater {

    //Brute Force O(n^2)
    // public static int maxStoreWater(ArrayList<Integer>height){
    //     int maxWater = 0;
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i; 
    //             int currWater = width*ht;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    //TWO POINTERS APPROACH with O(n)
    public static int storeWater(ArrayList<Integer>height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            int h = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int area = h*width;
            maxWater = Math.max(area, maxWater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;   
            }
        }
        return maxWater;
    }

    //Pair Sum-1 BRUTE FORCE
    // public static boolean pairSum1(ArrayList<Integer>list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(target == list.get(i) + list.get(j)){
    //                 System.out.println("The pair is: " + list.get(i) +","+ list.get(j));
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //Pair Sum-1 TWO POINTERS
    public static boolean pairSum1(ArrayList<Integer>list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp!=rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }


    


    public static void main(String[] args){

        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(4);
        height.add(3);
        height.add(7);

        // System.out.print(storeWater(height));
        System.out.print(pairSum1(height, 8));
    }
}
    