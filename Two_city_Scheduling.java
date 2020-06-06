class Solution {
    public int twoCitySchedCost(int[][] costs) {
       int minCost=0;
        Arrays.sort(costs,(a,b)->{
            return (a[0]-a[1])-(b[0]-b[1]);
        });
        for (int i = 0; i <costs.length/2; i++)
        {  minCost+=costs[i][0];
        minCost+=costs[i+costs.length/2][1];
        }
        
            
        return minCost;
    }
}
