class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int ans= 0;
        
//         if array having one element only
        if(arr.length == 1){
            return arr[0];
            
        }
        
//         now when length is odd  add every individual element becz it will of 1 length which is odd
       
         for(int i=0; i<arr.length; i++){
                ans += arr[i];
            }
        
        if(arr.length%2 == 1){
            
           
            
//             also the whole array will one subarray having odd length
            
            ans += ans;
            
        }
        
            
//             now make a window having 3 size intitally and add all elements inside it 
//             in case when we finish the 3 length array move on to 5 length subarray and keep doing until we are inside array
            int windsize = 3;
            int strtwindow = 0;
            int endwindow = windsize  - 1;
            
            
            while(windsize < arr.length){
                
//               get the sum of window 
                for(int x = strtwindow; x<=endwindow; x++){
                    ans += arr[x];
                }
                
//                 now using the same window size iterate over the whole array
                
                strtwindow++;
                endwindow++;
                
//                 in case we get out/over the array length then we will increase window size means all operaations are done using subaarray having 3 length
                if(arr.length == endwindow){
            
          
  windsize = windsize + 2;
                 strtwindow = 0;
                endwindow = windsize  - 1;
                
            
        }
               
                
                
               
                
               
            }
            
            
            
        
        
        
        
        return ans;
    }

}