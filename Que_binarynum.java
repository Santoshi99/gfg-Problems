class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        ArrayList<String> bnrynums = new ArrayList<>(N);
        bnrynums.add("1");
        while(!queue.isEmpty()){
            String num = queue.remove();
            
            if(bnrynums.size()!=N)
            {
                bnrynums.add(num.concat("0"));
                queue.add(num.concat("0"));
            }
            else
            break;
            if(bnrynums.size()!=N)
            {
                bnrynums.add(num.concat("1"));
                queue.add(num.concat("1"));
            }
            else
            break;
            
            
        }
        return bnrynums;
    }
    
}
