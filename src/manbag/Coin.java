package manbag;


public class Coin implements Comparable
{
	private int value;
	static int lastID = 0;
	private int currentID;
	
    public Coin()
    {
    	value = 5;
    	lastID++;
    	currentID = lastID;
    	
    }
    public Coin( int v )
    {
    	value = v;
    	lastID++;
    	currentID = lastID;
    }
    public int getValue()
    {
    	
    	
    	return value;
    }
    
    public int compareTo(Object c){
    	
    	return value - ((Coin)c).getValue();
    	
    	
    }
    
    public String toString(){
    	
    	
    	return value + " " + currentID;
    }
    
    
}