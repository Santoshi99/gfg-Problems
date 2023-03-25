class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int i =0;
        while(i<n){
            if(i+k<=n){
                reverseSubArr(arr,i,i+k-1);
                i=i+k;
            }
            else{
                reverseSubArr(arr,i,n-1);
                i=n;
            }
            
        }
    }
    void reverseSubArr(ArrayList<Integer> arr, int start, int end){
        while(start<end){
           Integer temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            
            start++;
            end--;
        }
    }
}
