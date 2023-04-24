class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length;
        double exsalary=0;
        int exn=0;
        for(int i=1;i<n-1;i++){
            exsalary+=salary[i];
            exn++;
        }
        return exsalary/exn;
    }
}