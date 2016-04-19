package edu.exeter.cs;

public class Die {
	
	private final int MAX = 6;
	private int faceValue;

	public Die(){
		faceValue = 1;
	}

	public int roll(){
		faceValue = (int)(Math.random()*MAX)+1;
		return faceValue;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int value) {
		if (value > 0 && value <= MAX) {
			faceValue = value;
		} else {
			faceValue = -1;
			System.out.println("Please assign an integer value between [1,6]");
		}
	}

	public String toString(){
		String result = Integer.toString(faceValue);
		return result;
	}
	
}
