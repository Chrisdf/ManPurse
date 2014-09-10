package manbag;


import java.util.ArrayList;
import java.util.Collections;

public class Purse 
{


   private ArrayList<Coin> purse;
   private int totalValue;

   public Purse()
   {
   	  purse = new ArrayList<Coin>();
   	  totalValue = 0;
   }
   
   public int numberOfCoins()
   {
   		return purse.size();
   } 
   
   public int totalValue()
   {
   	
	
	for(int i = 0; i<purse.size(); i++)
		totalValue = totalValue + purse.get(i).getValue();
   	
   	return totalValue;
   }
  
   public boolean isEmpty()
   {
   	
   	if(purse.size() == 0)
   	return true;
   	
   	else
   	return false;
   	
   }
   
   public String viewCoins() {
	   
	   return purse.toString();
	   
	   
   }
  
   public boolean addCoin( Coin c )
   {
   	
	   
	   
   	purse.add(c);
   	return true;
   }
   
   
   public boolean removeCoint( Coin c )
   {
   	
   	
	purse.remove(0);
   	return true;
   }
   
  
   public String toString()
   {
   	
   	return "The number of coins " + purse.size() + " and total value of the purse is " + totalValue();
   }
   
   public void sortPurse(){
	   
	   Collections.sort(purse);
	   
   }
   
    
}