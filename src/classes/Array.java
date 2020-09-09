package classes;
import java.util.Arrays;

public abstract class Array<T> implements IArray<T>
{
	protected T[] array = null;
	protected int top;
	protected int length;
	
	@SuppressWarnings("unchecked")
	public Array()
	{				
		array = (T[]) new Object[10];		
		length = 0;
		top = -1;
	}
	
	public void push(T item)
	{
		if (array == null)
		{
			throw new NullPointerException("The array is null. Please initialize it before pushing values.");
		}
		
		if (isFull())
		{
			resize((array.length * 3 / 2) + 1);
		}
		
		++length;
		array[++top] = item;
	}
	
	public boolean isFull() 
	{
		if (array.length - 1 == top)
		{
			return true;
		}
		
		return false;
	}

	public int size() 
	{
		if (array == null)
		{
			throw new NullPointerException("The variable might not have been initialized");
		}
		
		return length;
	}
	
	public void resize(int capacity)
	{
		array = Arrays.copyOf(array, capacity);
	}
}
