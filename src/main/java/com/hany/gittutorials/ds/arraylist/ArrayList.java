package com.hany.gittutorials.ds.arraylist;

public class ArrayList {

	private static final int DEFAULTSIZE = 10;
	private int[] array=null;
	private int head=0;	

	public ArrayList() {
		array = new int[DEFAULTSIZE];
	}

	public ArrayList(int size) {
		if (size > 0) {
			array = new int[size];
		}else {
			throw new RuntimeException("Invalid size");
		}
	}

    public int getElement(int index){
        // this is to get an element at given index.
        if(index <0 || index >= array.length){
            throw new RuntimeException("Array index out of bound");
        }
        return array[index];
    }

   
    /*to add the element to the array*/
    public void addElement(int element) {
    	if(element > 0) {
    	array[head++] = element;
    	}else {
    		throw new RuntimeException("Invalid element to add");
    	}
    }

    public void printElement(int index){
        if(index <0 || index >= array.length){
            throw new RuntimeException("Array index out of bound");
        }
        System.out.println(array[index]);
    }

    public int getSize() {
    	return head+1;
    }
}
