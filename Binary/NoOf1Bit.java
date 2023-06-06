public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt=0;
    // run a loop till 32 and then make & of n with 1 ,if result==1 then cnt++ and
     // right shift 
       for(int i=0;i<32;i++){
            if((n&1)==1) cnt++;
            n>>=1;
        }
            // cnt = cnt + (n & 1);
            // n=n>>1;
        
        return cnt;
        

        
    }
}
