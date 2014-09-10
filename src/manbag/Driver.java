package manbag;


import java.util.ArrayList;


public class Driver {

	
	public static void main(String args[]){
		
	ArrayList<Purse> purseVault = new ArrayList<Purse>();
	int randomPurse = (int)(Math.random()*20);
	
		
	for(int i = 0; i<20; i++){
		purseVault.add(new Purse());
		
	int randomCoins = (int)(Math.random()*20);	
	for(int d = 0; d<randomCoins; d++){
		
		int coinValue = (int)(Math.random()*5);
		purseVault.get(i).addCoin(new Coin(coinValue));
		}
		
	}	

	System.out.println(purseVault.get(randomPurse).viewCoins());
	
	
	
	
	
	
	
	
	}
	
	
	
}
