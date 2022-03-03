class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ans = 0;
        
        for(int i=0; i<accounts.length; i++){
            int getmoney = 0;
            for(int j=0; j<accounts[0].length; j++){
                getmoney += accounts[i][j];
            }
            
            ans = Math.max(ans, getmoney);
        }
        
        return ans;
    }
}