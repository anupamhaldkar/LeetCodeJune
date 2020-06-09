class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n>0){
           int a= n&(n-1);
        if(a==0){
            return true;
        }
      }
        
        
        return false;
    }
}
