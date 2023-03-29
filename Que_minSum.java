class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        PriorityQueue<Integer> pQue = new PriorityQueue<>();
        for(int i=0;i<n;i++)
        pQue.add(arr[i]);
        int count=0;
        String s1="0",s2="0";
        while(!pQue.isEmpty())
        {
            String s;
            if(count%2==0)
            {
                s = String.valueOf(pQue.remove());
                s1=s1+s;
               // System.out.println(s+" "+s1);
            }
            else
            {
                s = String.valueOf(pQue.remove());
                s2=s2+s;
            }
            count++;
        }
        
        return Long.valueOf(s2)+Long.valueOf(s1);
    }
}
