class Solution {
    public boolean containsDuplicate(int[] nums) {
       
      int m=nums.length;
      Arrays.sort(nums);
      for(int i=m-1;i>0;i--){
          if(nums[i]==nums[i-1]){
              return true;
          }
      }
      return false;

    }
}
