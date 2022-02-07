package Dao;

public interface DBConnector<T> {
	
	
	public void add(T item);
	
	public void update(T item);
	
	public void delete(int ID);
	
	public T get(int ID);
	
	public String errorText();
	
	
}
