class Solution {
public int findDuplicate(int[] nums) {
  //nums = [1,3,4,2,2]
  // first sort array
  // then save num[0] with current
  // then take a variable for ans i.e ans which is equal to current
  // run a loop till arraylength
  //if num[i]==current element return it and break otherwise current =nums[i]
Arrays.sort(nums);
int current=nums[0];
int ans=current;
for(int i=1;i<nums.length;i++){
  if(nums[i]==current){
    ans=nums[i];
    break;
  }
  current=nums[i];
}
return ans;
}
}


