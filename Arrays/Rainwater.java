import java.util.*;

public class RainWater {
    public static int trappedRainWater(int height[]) {
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        // Calculating leftMax bar's height for each bar height
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        // Calculating rightMax bar's height for each bar height
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Calculating value of waterLevel
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Calculating value of trappedWater
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = {5, 9, 2, 0, 1, 100, 22};
        System.out.println(trappedRainWater(height));
    }
}
