class Solution {
    // nums = [1,2,3,4]
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0)
        return new int[0];

        int [] left=new int[nums.length];
        int [] right=new int[nums.length];

		 left[0]=1;

        //left
         for(int i=1;i<nums.length;i++){
             left[i]=left[i-1]*nums[i-1];
         }

         // right
         right[nums.length-1]=1;
         for(int i=nums.length-2;i>-1;i--){
            right[i]=right[i+1]*nums[i+1];
         }

         // ans
         int ans[]=new int[nums.length];
         for(int i=0;i<nums.length;i++){
             ans[i]=left[i]*right[i];
         }

	// 	for(int i=0;i<nums.length;i++){
	// 	    // for(int j=0;j<nums.length;j++){
    //      ans[i]=p; // ans[]=1,1 ,2 ,6 
    //      p=p*nums[i];       //p=1,2,6,24
    //     }
    //    p=1;
    //   for(int i=nums.length-1;i>=0;i--){
    //       ans[i]=ans[i]*p;// ans[3,2,1,0]=24,8 
    //       p=p*nums[i];//p=4
    //   }



        return ans;
    }
}
