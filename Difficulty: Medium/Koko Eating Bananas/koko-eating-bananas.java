class Solution {
    
    public static int calculateHour(int[] arr, int s){
        int totalHours=0;
        for (int i=0;i<arr.length;i++){
            totalHours+=(arr[i]+s-1)/s;
        }
        return totalHours;
    }
    public int kokoEat(int[] arr, int k) {
        int low=1;
        int high=0;
        for (int i=0;i<arr.length;i++){
            high=Math.max(high, arr[i]);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int requiredHours=calculateHour(arr,mid);
            if (requiredHours>k){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    
    }
}
