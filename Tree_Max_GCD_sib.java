class Solution {
    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        // code here
        if(N==0||N==1)
        return 0;
        Collections.sort(arr, new Comparator<ArrayList<Integer>>(){
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2){
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        int root = arr.get(0).get(0);
        int sibling1 = arr.get(0).get(1);
        int gcd=0;
        for(int i=1;i<N-1;i++){
            if(root == arr.get(i).get(0)){
                int sibling2 = arr.get(i).get(1);
                int temp = gcd;
                gcd = findGCD(sibling1,sibling2);
                gcd = (gcd >temp) ? gcd: temp;
            }
            root = arr.get(i).get(0);
            sibling1 = arr.get(i).get(1);
        }
        
        return gcd;
    }
    static int findGCD(int s1, int s2){
            if(s1==s2)
            return s1;
            if(s1>s2)
            return findGCD(s1-s2,s2);
            
            return findGCD(s1,s2-s1);
            
        }
};
