package classes;
/**
 * 
 */

/**
 * @author meets
 *
 */
public interface IArray<T> 
{
	void push(T item);
	
	T pop();
	
	boolean isFull(); 
	
	boolean isEmpty();
	
	int size();
	
	void resize(int capacity);
	
	String toString();
}
