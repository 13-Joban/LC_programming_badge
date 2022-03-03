public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;

    while(n != 0){
        int rbmask = (n & (~(n) + 1));
        
        n = n - rbmask;
        count++;
    }
        
        return count;
    }

}