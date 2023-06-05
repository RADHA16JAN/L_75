class Solution {

    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int m=nums.length;
        int current=0;
// nums = [-2,1,-3,4,-1,2,1,-5,4]
        for(int i=0;i<m;i++){
       current=current+nums[i];
          // will add all positive values in max
       if(current>max){    
           max=current;
       }
          // if current value is less than 0, than current value will become 0
        if(current<0){
           current=0;
       }
        }
        return max;
    }
}
