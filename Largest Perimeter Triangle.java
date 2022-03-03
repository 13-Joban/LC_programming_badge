class Solution {
    public int largestPerimeter(int[] nums) {
      // int ans = 0;
        
        Arrays.sort(nums);
     
        
        for(int i=nums.length - 1; i>=2; i-- ){
            
           int firside = nums[i];  int seondide = nums[i-1];  int thirside = nums[i-2]; 
            
            if(Satisfytheorem(firside , seondide ,  thirside) == true){
                return firside + seondide + thirside;
            
            }
            
          
        }
        
       
                    return 0;
    }
    
    public boolean Satisfytheorem(int a, int b, int c){
        if(( a + b > c) && (b + c  > a) && (a + c > b)){
            return true;
        }
        else{
            return false;
        }
    }
    
  
    
}