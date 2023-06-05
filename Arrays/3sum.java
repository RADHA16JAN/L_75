class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      Set<List<Integer>> ans=new HashSet<>();
     
     for(int i=0;i<nums.length-2;i++){
         int v1=i+1;
         int v2=nums.length-1;

         while(v1<v2){
             int sum=nums[i]+nums[v1]+nums[v2];
             if(sum==0){
                 ArrayList<Integer> as=new ArrayList<>();
                 as.add(nums[i]);
                 as.add(nums[v1]);
                 as.add(nums[v2]);

                 ans.add(as);
                 v1++;
             }
             else if(sum<0){v1++;}
             else{v2--;}
         }
     }
     return new ArrayList<>(ans);

    }

}
