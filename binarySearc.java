class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        return binarySearchele(arr, 0, n-1, k);
    }
    int binarySearchele(int arr[], int sInd, int eInd, int k){
        if(sInd<=eInd){
            int mid = sInd+(eInd-sInd)/2;
            if(arr[mid]==k)
            return mid;
            else if(arr[mid]>k)
            return binarySearchele(arr, sInd, mid-1, k);
            else
            return binarySearchele(arr,  mid+1, eInd, k);
            
        }
        return -1;
    }
}
