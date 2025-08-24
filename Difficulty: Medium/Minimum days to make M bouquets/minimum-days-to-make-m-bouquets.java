class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        int n = arr.length;
        if ((long) m * k > n) {  
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int bloom : arr) {
            low = Math.min(low, bloom);
            high = Math.max(high, bloom);
        }

        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMake(arr, mid, k, m)) { 
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean canMake(int[] arr, int day, int k, int m) {
        int bouquets = 0;
        int flowers = 0;

        for (int bloom : arr) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0; 
                }
            } else {
                flowers = 0; 
            }
        }
        return bouquets >= m;
    }
} 