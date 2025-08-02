import java.util.*;

public class Assignment {

    // Q1: Repeats
    public static boolean repeatValues(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Q2: Search in rotated array
    public static int search(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (num[mid] == key) {
                return mid;
            }

            if (num[start] <= num[mid]) {
                if (key >= num[start] && key < num[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (key <= num[end] && key > num[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // Q3: Max stock profit
    public static int stocks(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (price[i] < buyPrice) {
                buyPrice = price[i];
            } else {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

    // Q4: Trapped rain water
    public static int rainWater(int height[]) {
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    // Q5: Triplets sum = 0
    public static List<List<Integer>> triplets(int num[]) {
        int n = num.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        List<Integer> triplet = Arrays.asList(num[i], num[j], num[k]);
                        result.add(triplet);
                    }
                }
            }
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {

        // Example usage of Q5: Triplets
        int num[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> triplets = triplets(num);

        if (triplets.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            for (List<Integer> t : triplets) {
                System.out.println(t);
            }
        }
    }
}
