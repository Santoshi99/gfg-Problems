class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode curr = new QueueNode(a);
        if(rear==null)
        {
            rear = curr;
            front= curr;
            return;
        }
        rear.next = curr;
        rear = curr;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==rear&&rear==null)
        return -1;
        int ele = front.data;
        front = front.next;
        if(front==null)
        rear=null;
        return ele;
	}
}




