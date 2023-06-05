class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int m=nums.length;
        int current=1;

//      nums = [2,3,-2,4]
        for(int i=0;i<m;i++){
            current=current*nums[i];
             max = Math.max(max,current);

           if(current==0){
           current=1;
            }
       }
        current=1;
        for(int j=m-1;j>=0;j--){
        current*=nums[j];
        max = Math.max(max,current);
         if(current==0){
           current=1;
            }
        }
    //    if(current<0){
    //        current=0;
    //        //current=current*nums[i];
    //    }
    //     }
        return max;
        
    }
}
