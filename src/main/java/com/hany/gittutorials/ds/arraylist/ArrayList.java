package com.hany.gittutorials.ds.arraylist;

public class ArrayList {

	private static final int DEFAULTSIZE = 10;
	private int[] array=null;
	
    public ArrayList(){
        array = new int[DEFAULTSIZE];
    }
    
    public ArrayList(int size) {
    	array = new int[size];
    }
}
