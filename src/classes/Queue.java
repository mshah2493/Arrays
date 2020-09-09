package classes;

import java.util.Iterator;

public class Queue<T> extends Array<T>
{
	private int front = -1; 
	
	public Queue() 
	{
		super();
	}
	
	public T pop() 
	{
		if (isEmpty() || array == null)
		{
			throw new IllegalAccessError("The Queue is empty. Nothing to pop.");
		}
		
		--length;
		T value = array[++front];
		array[front] = null;
		
		if (length > 0 && array.length - front == array.length / 4)
		{
			resize(array.length / 2);
		}
		
		return value;
	}
	
	public boolean isEmpty() 
	{
		if (front == top || top == -1)
		{
			return true;
		}
		
		return false;
	}
	
	public void resize(int capacity)
	{
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Object[capacity];
		
		int i = front, j = 0;
		
		while (i < top)
		{
			temp[j++] = array[++i];
		}
		
		array = temp;	
		top -= ++front;
		front = -1;
	}
	
	public Iterator<T> iterator() 
	{ 
		return new ListIterator(); 
	}
	
	public String toString() 
	{
		if (isEmpty())
		{
			throw new NullPointerException("The queue is empty.");
		}
		
		String str = "[";
		
		int i = front == -1 ? 0 : front;
		
		for (; i < length; ++i)
		{
			str += array[i];
			
			if (i + 1 != length)
			{
				str += ", ";
			}
		}
		
		str += "]";
		
		return str;
	}
	
	private class ListIterator implements Iterator<T>
	{
		int temp = front;
		public boolean hasNext() 
		{
			if (temp < top) 
			{
				return true;
			}
			
			return false;
		}

		public T next() 
		{
			if (temp <= top)
			{
				return array[++temp];
			}
			
			return null;
		}
	}
}
