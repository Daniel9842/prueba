package edu.escuelaing.arsw.springWeb.picasYfamas;

import java.util.ArrayList;
import java.util.List;

/**
 * this class controls the game picas y famas
 * @author Daniel Santiago Ducuara Ardila
 *
 */
public class Game 
{
	
	private final int LEVEL=4;
	private List<Integer> numbers= new ArrayList<Integer>();
	private List<Integer> numbersCorrection= new ArrayList<Integer>();
	private int picas,famas;
	private boolean win=false;
    private int args[];
    /**
     * this method performs a picas y famas count
     * @param args number sent by the user
     */
	public void numbers( int[] args )
    {
		this.args = args;
		duplicate();
    	for(int i=0;i<args.length;i++) {
        	if(args[i]==numbers.get(i)) {
        		picas+=1;
        		numbers.set(i,-5);
        	}
        }
    	for(int j=0;j<args.length;j++) {
    		int positionNumber = numbers.indexOf(args[j]);
        	if(positionNumber!=-1) {
        		famas=+1;
        	}
        if(picas==4) {
        	win=true;
        }
        	}
    	resetList();
    }
    /**
     * this method creates a random number and stores it in a list
     */
    public void randomNumber() {
    	for(int i=0;i<LEVEL;i++) {
        	numbers.add((int) (Math.random()*8+1));
        }
    }
    /**
     * 
     * @return the picas count
     */
    public int getPicas() {
    	return picas;
    }
    /**
     * this method resets the counters
     */
    public void resetPicasFamas() {
    	picas=0;
    	famas=0;
    }
    /**
     * 
     * @return the famas count
     */
    public int getFamas() {
    	return famas;
    }
    /**
     * 
     * @return the last number sent by the user
     */
    public String getNumbers() {
    	String numberString = "";
    	for(int j=0;j<args.length;j++) {
    		numberString += " "+Integer.toString(args[j]);
    	}
    	return numberString;
    }
    /**
     * 
     * @return if the user won the game
     */
    public boolean getWin() {
    	return win;
    }
    /**
     * reset the list containing the number sent by the user
     */
    public void resetList() {
    	for(int j=0;j<numbers.size();j++) {
    		numbers.set(j,numbersCorrection.get(j));
    	}
    }
    /**
     * this method creates a duplicate of the list containing the number to guess
     */
    public void duplicate() {
    	for(int j=0;j<numbers.size();j++) {
    		numbersCorrection.add(numbers.get(j));
    	}
    }
    /**
     * this method restarts the game
     */
    public void resetGame() {
    	win=false;
    	for(int j=0;j<numbers.size();j++) {
    		numbers.remove(j);
    	}
    	randomNumber();
    }
    
}
