class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> s = new Stack<>();
        int rem = q.size()-k;
        while(k>0){
            s.push(q.remove());
            k--;
        }
        while(!s.empty()){
            q.add(s.pop());
        }
        for(int i=0;i<rem;i++)
          {
         // System.out.println(q.size()-k);
          q.add(q.remove());
          }
        return q;
    }
}
