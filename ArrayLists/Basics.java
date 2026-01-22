import java.util.*;
    public class Basics{


        public static void swap(ArrayList<Integer> list, int idx1, int idx2){
            int temp = list.get(idx1);
            list.set(idx1, list.get(idx2));
            list.set(idx2, temp);
        
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+ " ");
            }
        }   

        public static void main(String[] args) {
            // ArrayList <Integer> list = new ArrayList<>();
            // ArrayList <String> list2= new ArrayList<>();
            // ArrayList <Boolean> list3 = new ArrayList<>();
            

            // //Add Function O(1)
            // list.add(2);
            // list.add(4);
            // list.add(9);
            // list.add(6);
            // list.add(05);

            // list.add(2,99); //O(n)
            // System.out.println(list);   


            //size function of ArrayList
            // System.out.println(list.size());


            //To print the elements of ArrayList
            // for(int i=0; i<list.size(); i++){
            //     System.out.print(list.get(i) + " ");
            // }


            //Print Reverse of an ArrayList
            // int n = list.size()-1;
            // for(int i=n; i>=0; i--){
            //     System.out.print(list.get(i)+ " ");
            // }

            //FIND MAXIMUM IN AN ARRAYLIST
            // int max = Integer.MIN_VALUE;
            // for(int i=0; i<list.size(); i++){
            //     // if(max<list.get(i)){
            //     //     max = list.get(i);
            //     // }
            //     max = Math.max(max, list.get(i));
            // }
            // System.out.print("The maximum integer in the arrayList is: " + max);


            //SWAPPING
            // ArrayList<Integer> list = new ArrayList<>();
            // list.add(44);
            // list.add(1, 55);
            // list.add(33);
            // list.add(26);

            
            // for(int i=0; i<list.size(); i++){
            //     System.out.print(list.get(i)+ " ");
            // }
            
            // int idx1 = 2;
            // int idx2 = 0;
            // System.out.println();
            // swap(list, idx1, idx2);


            //Sorting in ArrayList
            // ArrayList<Integer> list = new ArrayList<>();
            // list.add(2);
            // list.add(55);
            // list.add(99);
            // list.add(21);

            // // System.out.print(list);
            // Collections.sort (list); //ascending
            // System.out.print(list);
            // System.out.println();

            // //descending order
            // Collections.sort(list, Collections.reverseOrder());
            // System.out.print(list);



            //MultiDimensional ArrayList
            // ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
            // ArrayList<Integer>list = new ArrayList<>();
            // list.add(4);
            // list.add(66);
            // list.add(32);
            // list.add(33);

            // ArrayList<Integer>list2 = new ArrayList<>();
            // list2.add(55);
            // list2.add(22);
            // list2.add(19);
            // list2.add(2);

            // Collections.sort(list2);
            // Collections.sort(list);

            // mainList.add(list);
            // mainList.add(list2);

            // for(int i=0; i<mainList.size(); i++){
            //     ArrayList<Integer>currList = mainList.get(i);

            //     for(int j=0; j<currList.size();j++){
            //         System.out.print(currList.get(j) + " ");
            //     }
            //     System.out.println();
            // } 
            // System.out.print(mainList);


            //MULTIDIMENSIONAL ARRAYLIST QUESTION

            ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
            ArrayList<Integer>list1 = new ArrayList<>();
            ArrayList<Integer>list2 = new ArrayList<>();
            ArrayList<Integer>list3 = new ArrayList<>();
            

            for(int i=1; i<=5; i++){
                list1.add(i*1);
                list2.add(i*2);
                list3.add(i*3);
            }

            
            mainList.add(list1);
            mainList.add(list2);
            mainList.add(list3);

            System.out.print(mainList);

            System.out.println();

            for(int i=0; i<mainList.size(); i++){
                ArrayList<Integer>currList = mainList.get(i);
                for(int j=0; j<currList.size(); j++){
                    System.out.print(currList.get(j)+ " ");
                }
                System.out.println();
            }


            //Get Function O(1)
            // int element = list.get(0);
            // System.out.println(element);

            //Remove Function O(n)
            // list.remove(1);
            // System.out.println(list);

            //Set element at particular index O(n)
            // list.set(2,10);
            // System.out.println(list);

            //Used to check whether the list contains element O(n)
            // System.out.println(list.contains(1));
            // System.out.println(list.contains(11));
        }
    }