package edu.exeter.cs;

public class DieMain {

	public static void main(String[] args) {
	
		//Here we create an instance of the class Die. die1 is an object.
		Die die1 = new Die();
		Die die2 = new Die();
		die1.roll();
		die1.roll();
		die1.roll();
		die2.roll();
		die2.roll();
		System.out.println(die1.getRoll());
		die1.setRoll(0);
		System.out.println(die1.getRoll());
	}
	
	public static class Die {
		
		private final int MAX = 6;
		private int faceValue;
		private static int count = 0;

		//This function is a constructor.
		public Die() {
			faceValue = 1;
		}

		//This function generates a pseudorandom number between 1 and 6.
		public int roll() {
			faceValue = (int)(Math.random()*MAX)+1;
			count++;
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
		
		//This function gets the count.
		public int getRoll() {
			return count;
		}
		
		//This function sets the count.
		public void setRoll(int n) {
			count = n;
		}

		//This function returns the faceValue of the die a string so it can be printed.
		public String toString() {
			String result = Integer.toString(faceValue);
			return result;
		}
		
	}

}
