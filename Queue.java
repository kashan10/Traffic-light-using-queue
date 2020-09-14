public class Queue{
	
		//Initialize front and rear
		int rear,front;
		
		//Circular Queue
		int size;
		int[] arr;
		
		Queue(int s)
		{
			front = rear = -1;
			size =s;
			arr = new int[s];
			
		}
		
		public void enQueue(int value){
			if((front == 0 && rear == size-1)||(rear == (front-1)%(size-1))){
				
				System.out.println("Queue is Full");
				return;
			}
			
			else if (front == -1) //Insert First Element
			{
				front = rear = 0;
				arr[rear]=value;
			}
			
			else
			{
				rear++;
				arr[rear] = value;
				
			}
		}
		
		public int deQueue(){
			
			if(front == -1)
			{
				println("Queue is Empty");
				return;
			}
			
			int data = arr[front];
			arr[front] = -1;
			
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			
			else if(front == size-1)
				front = 0;
			
			else
				front++;
				
			return data;
		}
		
		//Function displaying the element
		//of circular Queue
		public void displayQueue()
		{
			if (front == -1)
			{
				System.out.println("Queue is Empty");
				return;
			} 
			 
			if (rear >= front)
			{
				
				for(int i = front; i<=rear; i++)
					
					System.out.print(arr[i]);
			}
			
			else
			{
				
				for(int i = front; i < size; i++ )
					
					System.out.print(arr[i]);
					
				for(int i = 0; i <= rear; i++)
					
					System.out.print(arr[i]);
			}
			
		}
}
