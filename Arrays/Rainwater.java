import java.util.*;
    public class RainWater {

        public static int rainTrappedWater(int height[]) {
            int n = height.length;
            int leftMax[] = new int[height.length];

            leftMax[0] = height[0];
            for(int i=1; i<height.length;i++) {
                leftMax[i] = Math.max(height[i], leftMax[i-1]);
            }

            int rightMax[] = new int[n];
            rightMax[n-1]  = height[n-1];
            for(int i=n-2; i>=0; i--) {
                rightMax[i] = Math.max(height[i], rightMax[i+1]);
            }
            int waterLevel = 0;
            int trappedWater = 0;

            for(int i=0; i<height.length; i++) {
      
                //Calculating WaterLevel
                waterLevel = Math.min(leftMax[i], rightMax[i]);
                //Calculating Trapped water
                trappedWater += waterLevel - height[i];
            }

            return trappedWater;


        }


        public static void main(String[] args) {
            int height[] = {20, 10, 11, 35, 100, 21, 210};
            System.out.println(rainTrappedWater(height));
        }
    }