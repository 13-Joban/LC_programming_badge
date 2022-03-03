class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minindex = -1;
        int mindis  = Integer.MAX_VALUE;
        for(int ind =0; ind<points.length; ind++){
            
            if(points[ind][0] == x ){
              int dis = Math.abs(x - points[ind][0]) + Math.abs( y - points[ind][1]);
                
              
               if(mindis > dis){
                   minindex = ind;
                   mindis = dis;
               }
                else  if(mindis == dis){
                   minindex = Math.min(ind, minindex);
                  
                }
             
                
              
            }
            else   if(points[ind][1] == y ){
                int dis = Math.abs(x - points[ind][0]) + Math.abs( y - points[ind][1]);
               
                
               if(mindis > dis){
                   minindex = ind;
                   mindis = dis;
               }
                else  if(mindis == dis){
                   minindex = Math.min(ind, minindex);
                  
                }
               
            }
            
        }
        
     return minindex;
            
        }
    
}