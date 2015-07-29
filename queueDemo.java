import java.util.LinkedList;
import java.util.Queue;



public class queueDemo {
	public static void main(String[] args){
		Queue<String> q=new LinkedList<String>();
		try{
		q.add("1");
		q.add("2");
		q.add("A");
		q.add("B");
		}catch(IllegalStateException e){
			System.out.println("elements cannot be inserted now");
			
		}
		q.offer("3");
		q.offer("C");
		System.out.println("Elements in the Queue are   "+q);
		System.out.println("Size of the queue is  "+q.size());
		System.out.println("First element in the Queue is  "+q.peek());
		System.out.println("Is element 3 present in the Queue ?  "+q.contains("3"));
		try{
		q.remove();
		}catch(IllegalStateException e){
			System.out.println("Cannot remove Element from queue");
		}
		q.poll();
		System.out.println("Elements in the Queue after deleting  are  "+q);
		System.out.println("Size of the queue is  "+q.size());
		System.out.println("First element in the Queue is  "+q.peek());
		System.out.println("Is element 3 present in the Queue ?  "+q.contains("1"));
		
	}

}
