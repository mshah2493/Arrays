package classes;

import java.util.Iterator;

public class Stack<T> extends Array<T>
{
	public Stack() 
	{
		super();
	}
	
	public T pop() 
	{
		if (isEmpty() || array == null)
		{
			throw new IllegalAccessError("The Stack is empty. Nothing to pop.");
		}
		
		T value = array[top];
		
		if (length > 0 && top == array.length / 4)
		{
			resize(array.length / 2);
		}
		
		array[top--] = null;
		--length;
		
		return value;
	}
	
	public boolean isEmpty() 
	{
		if (top == -1)
		{
			return true;
		}
		
		return false;
	}
	
	public Iterator<T> iterator() 
	{ 
		return new ListIterator(); 
	}
	
	public String toString() 
	{
		if (array == null)
		{
			throw new NullPointerException("The variable might not have been initialized");
		}
		
		String str = "[";
		
		for (int i = 0; i < length; ++i)
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
		int temp = top;
		public boolean hasNext() 
		{
			if (temp > 0) 
			{
				return true;
			}
			
			return false;
		}

		public T next() 
		{
			if (temp > -1)
			{
				return array[temp--];
			}
			
			return null;
		}
	}
}
