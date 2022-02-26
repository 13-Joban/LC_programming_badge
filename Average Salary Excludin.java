class Solution {
    public double average(int[] salary) {
        
        int minsalary=Integer.MAX_VALUE, maxsalary=Integer.MIN_VALUE;
        double avg = 0;  int total = 0;
        
        for(int val: salary){
            total += val;
            
            minsalary = Math.min(val, minsalary);
            maxsalary = Math.max(val, maxsalary);
            
        }
        
        double afterexluding = total - (minsalary  + maxsalary);
    
        int persons = salary.length - 2;
        avg = (afterexluding)/persons;
        
        return avg;
    }
}