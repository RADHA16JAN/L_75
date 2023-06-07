class Solution {
    public int getSum(int a, int b) {
    //  while(b!=0){
    //      // using XOr operator as XOr operator gives us add 
    //      int sum=a^b;
          // << is left operator it will left shift 
    //      int carry=(a&b)<<1;
    //      a=sum;
    //      b=carry;
    //  } 
    // return a;  


// using inbuild function
    int sum=Integer.sum(a,b);
     return sum;
    }
}
