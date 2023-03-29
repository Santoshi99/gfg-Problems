class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        // Arrays.sort(arr);
        PriorityQueue<Long> pQueue = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        pQueue.add(arr[i]);
        long total =0;
        while(pQueue.size()>1){
            long first = pQueue.poll();
            long sec = pQueue.poll();
            pQueue.add(first+sec);
            total+=(first+sec);
        }
        return total;
    }
}
