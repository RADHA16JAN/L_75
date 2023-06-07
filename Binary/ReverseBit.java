public class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        // run a loop till 32 as we have given 32 unsigned integer
        for (int i = 0; i < 32; i++) {
            //  reverse function will left shift by 1
            rev <<= 1;
            // reverse function will make  make union and add (n&1)
            rev |= (n & 1);
            // n variable will right shift by 1
            n >>= 1;
        }
        return rev;
    }
}

// TC: O(1)
