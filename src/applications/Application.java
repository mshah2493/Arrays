package applications;
import java.util.Iterator;

import classes.LinkedQueue;
import classes.LinkedStack;
import classes.Queue;
import classes.Stack;

public class Application {

	public static void main(String[] args) 
	{
		System.out.println("============================Stack============================");
		
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("size : " + stack.size());
		
		for(int i = 0; i < 10; ++i)
		{
			stack.push(i);
		}
		
		Iterator it = stack.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("size : " + stack.size());
		System.out.println("Full : " + stack.isFull());
		
		System.out.print("Popping : ");
		for(int i = 0; i < 5; ++i)
		{
			System.out.print(stack.pop() + " ");
		}
		
		System.out.println("\nsize : " + stack.size());
		
		for(int i = 0; i < 10; ++i)
		{
			stack.push(i);
		}
		
		System.out.println("Stack : " + stack.toString());
		System.out.println("size : " + stack.size());
		System.out.println("Full : " + stack.isFull());
		System.out.println("Empty : " + stack.isEmpty());
		
		System.out.print("Popping : ");
		
		for(int i = 0; i < 12; ++i)
		{
			System.out.print(stack.pop() + " ");
		}
		System.out.print(stack.pop() + " ");
		
		System.out.println("\nsize : " + stack.size());
		System.out.println("Full : " + stack.isFull());
		System.out.println("Empty : " + stack.isEmpty());
		
		System.out.println("============================Queue============================");
		
		Queue<String> queue = new Queue<String>();
		System.out.println("size : " + queue.size());
		
		for(int i = 0; i < 10; ++i)
		{
			queue.push(String.valueOf((char)(i + 65)));
		}
		
		System.out.println("Strack : " + queue.toString());
		System.out.println("size : " + queue.size());
		System.out.println("Full : " + queue.isFull());
		
		System.out.print("Popping : ");
		for(int i = 0; i < 5; ++i)
		{
			System.out.print(queue.pop() + " ");
		}
		
		System.out.println("\nsize : " + queue.size());
		
		it = queue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(int i = 0; i < 10; ++i)
		{
			queue.push(Character.toString((char) (i + 65)));
		}
		
		System.out.println("size : " + queue.size());
		System.out.println("Full : " + queue.isFull());
		System.out.println("Empty : " + queue.isEmpty());
		
		for(int i = 0; i < 12; ++i)
		{
			System.out.print(queue.pop() + " ");
		}
		System.out.print(queue.pop() + " ");
		
		System.out.println("\nsize : " + queue.size());
		System.out.println("Full : " + queue.isFull());
		System.out.println("Empty : " + queue.isEmpty());
		
		System.out.println("============================LinkedQueue============================");
		
		LinkedQueue<Integer> linkedQueue = new LinkedQueue<Integer>();
		System.out.println("size : " + linkedQueue.size());
		
		for(int i = 0; i < 10; ++i)
		{
			linkedQueue.push(i);
		}
		
		System.out.println("LinkedQueue : " + linkedQueue.toString());
		System.out.println("size : " + linkedQueue.size());
		
		@SuppressWarnings("rawtypes")
		Iterator it1 = linkedQueue.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next() + " ");
		}
		
		System.out.println("\nsize : " + linkedQueue.size());
		
		
		
		System.out.println("============================LinkedStack============================");
		
		LinkedStack<String> linkedStack = new LinkedStack<String>();
		System.out.println("size : " + linkedStack.size());
		
		for(int i = 0; i < 10; ++i)
		{
			linkedStack.push(String.valueOf((char)(i + 65)));
		}
		
		System.out.println("LinkedStack : " + linkedStack.toString());
		System.out.println("size : " + linkedStack.size());
		
		it1 = linkedStack.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next() + " ");
		}
		
		System.out.println("\nsize : " + linkedStack.size());
	}
}
