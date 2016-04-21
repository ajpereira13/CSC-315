package edu.exeter.cs;

public class DieMain {

	public static void main(String[] args) {
	
		//Here we create an instance of the class Die. die1 is an object.
		Die die1 = new Die();
		die1.setFaceValue(5);
		System.out.println(die1.getFaceValue());

	}
	
	public static class Die {
		
		private final int MAX = 6;
		private int faceValue;

		//This function is a constructor.
		public Die(){
			faceValue = 1;
		}

		public int roll(){
			faceValue = (int)(Math.random()*MAX)+1;
			return faceValue;
		}

		//This function is an accessor (getter).
		public int getFaceValue() {
			return faceValue;
		}

		//This function is a mutator (setter).
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

}
