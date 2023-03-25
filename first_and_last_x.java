class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        return findFaL(arr,0,n-1,x);
    }
    public ArrayList<Long> findFaL(long arr[], int sInd, int eInd, int x){
         ArrayList<Long> newArr = new ArrayList<Long>();
        
        if(sInd<=eInd){
            int  mid  = sInd+(eInd-sInd)/2;
            
            if(arr[mid]==x){
                
                int i=mid,j=mid;
                while(i>=0){
                    if(arr[i]!=x){
                        break;
                    }
                    i--;
                }
                newArr.add((long)i+1);
                while(j<=arr.length-1){
                    if(arr[j]!=x){
                         break;
                    }
                    j++;
                }
                newArr.add((long)j-1);
             return newArr;  
            }
            else if (arr[mid]>x){
                return findFaL(arr,sInd,mid-1,x);
            }
            else{
                return findFaL(arr,mid+1,eInd,x);
            }
        }
        newArr.add((long)-1);
        newArr.add((long)-1);
        return newArr;
    }
}
