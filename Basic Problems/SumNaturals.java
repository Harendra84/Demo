class SumNaturals{
    static int findSum(int n){
        int sum = 0;
        
      // iterating over all the numbers 
      // between 1 to n
      
        for (int x = 1; x <= n; x++) 
            sum = sum + x;
        return sum;
    }
    
    public static void main(String args[])
    {
        int n = 5;
        System.out.println("Sum Naturals : " + findSum(n));
    } 
}