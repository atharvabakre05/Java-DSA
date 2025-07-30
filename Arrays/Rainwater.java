import java.util.*;
    public class RainWater {

        public static void trappedWater(int height[]) {
            int n = height.length;
            int leftMax[] = new int[height.length];

            leftMax[0] = height[0];
            for(int i=1; i<height.length;i++) {
                leftMax[i] = Math.max(height[i], leftMax[i-1]);
            }
            int rightMax[] = new int[n];
            rightMax[n-1]  = height[n-1];
            for(int i=1; i<=height.length; i++)
        }
        public static void main(String[] args) {
            int height[] = {20, 10, 11,35, 100, 21, 210};

        }
    }

