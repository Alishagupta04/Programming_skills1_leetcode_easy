class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1,count=0;
        while(n>0){
            int d=n%10;
            mul*=d;
            count+=d;
            n=n/10;
        } return mul-count;
    }
}