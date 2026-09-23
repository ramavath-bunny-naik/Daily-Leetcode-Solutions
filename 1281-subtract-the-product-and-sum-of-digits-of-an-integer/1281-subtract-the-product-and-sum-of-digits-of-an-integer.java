class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            mul=mul*d;
              sum=sum+d;
            n=n/10;
        }
int res=mul-sum;
        return res;
    }
}