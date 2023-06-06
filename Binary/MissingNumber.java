class Solution {
    public int missingNumber(int[] nums) {
        int result=0;
        int n=nums.length;
        // formula by carl gauss to find sum of n no is (n*(n+1))/2
        int exceptedSum=(n*(n+1))/2;
       // nums = [3,0,1]

     // we calculate sum of array present or given
        for(int i=0;i<n;i++){
            result+=nums[i];
        }

        int missing =exceptedSum-result;
        return missing;
    }
}
