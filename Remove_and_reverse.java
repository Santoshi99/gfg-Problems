class Solution 
{ 
    String removeReverse(String S) 
    { 
        // code here
        int dupArr[] = new int[26];
        for( int i =0;i<S.length();i++){
            int index = S.charAt(i)-97;
            dupArr[index]++;
        }
        boolean flag =true;
        char ch;
        String beg="",end="";
        int i=0,j=S.length()-1,count=0;
       while(i<=j){
           if(flag) ch = S.charAt(i++);
           else ch = S.charAt(j--);
           if(dupArr[ch-97]>1){
               dupArr[ch-97]--;
               count++;
               flag = !flag;
           }
           else
           {
               if(flag) beg+=ch;
               else end=ch+end;
           }
       }
       StringBuffer sbS=new StringBuffer(beg+end);
        
        if(count%2==1) sbS.reverse();
       return sbS.toString();
    }
} 
