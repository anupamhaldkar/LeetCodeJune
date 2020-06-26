class Solution {
    public int numTrees(int n) {
        if(n<=1)
            return 1;
        int[] a = new int[n+1];
        a[0]=1 ;
        a[1]=1 ;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++)
                a[i] += a[j] * a[i-j-1];
        }
        return a[n];
    }
}
