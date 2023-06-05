class Solution {
    public int[] twoSum(int[] nums, int target) {
        //  for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[j] == target - nums[i]) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }
       Map<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int compliment=target-nums[i];
           if(map.containsKey(compliment)){
               return new int[]{
                   map.get(compliment),i};
           }
           map.put(nums[i],i);
       }
        
        return new int[]{-1,-1};
    }
  
}
