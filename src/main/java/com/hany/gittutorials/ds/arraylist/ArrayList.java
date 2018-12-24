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

    public int getElement(int index){
        // this is to get an element at given index.
        if(index <0 || index >= array.length){
            throw new RuntimeException("Array index out of bound");
        }
        return array[index];
    }
}
