package classes;

import java.util.Iterator;

public class LinkedQueue<T>
{
	int length;
	private Node head = null;
	private Node top = null;
	
	public class Node
	{
		T value;
		Node next;
	}
	
	public LinkedQueue() 
	{ 
		length = 0;
	}

	public void push(T item) 
	{
		Node node = new Node();
		node.value = item;
		node.next = null;
		
		if (isEmpty())
		{
			head = node;
			top = head;
		}
		else
		{
			top.next = node;
			top = top.next;
		}
		
		++length;
	}

	public T pop() 
	{
		if (isEmpty())
		{
			throw new NullPointerException("The LinkedList might not have been initialized");
		}
		
		T rValue = head.value;
		head = head.next;
		
		if (head == null)
		{
			top = null;
		}
		
		--length;
		
		return rValue;
	}

	public boolean isEmpty() 
	{
		return head == null;
	}

	public int size() 
	{
		return length;
	}
	
	public Iterator<T> iterator() 
	{ 
		return new ListIterator(); 
	}
	
	public String toString() 
	{
		if (isEmpty())
		{
			throw new NullPointerException("The LinkedList might not have been initialized");
		}
		
		Node node = head;
		
		String str = "[";
		
		while (node != null)
		{
			str += node.value;
			
			if (node.next != null)
			{
				str += ", ";
			}
			
			node = node.next;
		}
		
		str += "]";
		
		return str;
	}
	
	private class ListIterator implements Iterator<T>
	{
		Node node = head;
		public boolean hasNext() 
		{
			return node != null;
		}

		public T next() 
		{
			if (node != null)
			{
				T value = node.value;
				node = node.next;
				
				return value;
			}
			
			return null;
		}
	}
}
