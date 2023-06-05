class Solution {
    public int maxArea(int[] height) {
       int l=0;
       int r=height.length-1;
       int max=0;
       while(l<r){
         // w is width and h is height
           int w=r-l;  // width will calculate by sub of right -left
           int h=Math.min(height[l],height[r]);// height uski consider hogi jiski height small hogi  between left side and right side
           int area=w*h;// area is l*b which means width into height
           max=Math.max(max,area);// max area will found using maximum of (area and max)

           if(height[l]<height[r]) l++;  // agr left ki height right se km hogi to left++ krna hai
           else if (height[r]<height[l])  r--;// agr right ki height left se km hogi to right++ krna hai
           else {l++; r--;}    // otherwise l++ and r-- krna hai
       }
       return max;
    }
}
