class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;

        // 1 initialisr left =0 and right value=lenh=gth-1
        // 2 make a while loop till l<r and find mid;
        // 3 if nums[mid]==target  return mid;
        //4 else if nums[mid]>=nums[l]{ if(nums[l]<target&&target<nums[mid]){
     //   h=mid-1; }            else l=mid+1;}
     // 5 else{  if(nums[h]>target&&target>nums[mid]){
     //   l=mid+1; }            else  h=mid-1; }}
     // 6 return -1;

        while(l<=h){  
        int mid = l+(h-l)/2;//0
      
        if(nums[mid]==target){ return mid; }

        if(nums[l]<=nums[mid] ){
            if(target>=nums[l] && target<=nums[mid]){   h=mid-1;   }
            else{  l=mid+1;  }
        }
        else{
         if(target>=nums[mid] && target<=nums[h]){   l=mid+1;  }
            else{  h=mid-1; }
        }

        }

        return -1;
    }
}



