package week6;

import acm.program.ConsoleProgram;

public class ExpandableArray extends ConsoleProgram {
	
	private Object[] arr;
		
	public ExpandableArray() {
		arr = new Object[0];
	}
	
	public void set(int index, Object value) {
		if(index >= arr.length) {
			Object[] tempArr = new Object[index + 1];
			
			for(int i = 0; i < arr.length; i++) {
				tempArr[i] = arr[i];
			}
		}
		arr[index] = value;
	}
	
	public Object get(int index) {
		if(index > arr.length) return null; 
		return arr[index];
	}
	
}
