public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            int lastbit = n & 1;
            count+=lastbit;
            n=n>>>1;
        } return count;
    }
}