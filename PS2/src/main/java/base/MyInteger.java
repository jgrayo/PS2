package base;

public class MyInteger {

	public MyInteger() {
	}

	public static void main(String[] args) {
	}

	// int data field that stores int object
	private int iValue;

	// constructor that creates a MyInteger object for the specified iValue
	
	public MyInteger(int inputValue) {
		iValue = inputValue;
	}

	// get method that returns iValue
	public int getValue() {
		return iValue;
	}

	private boolean isEven() {
		return isEven(this.iValue);
		}

	private boolean isOdd() {
		return !isEven(this.iValue);
		
	}

	private boolean isPrime() {
		return isPrime(this.iValue);
		
	}

	public static boolean isEven(int num) {
		return (num%2==0);
	}

	public static boolean isOdd(int num) {
		return (num % 2 != 0);

	}

	public static boolean isPrime(int num) {
		for (int i = 2; 2 * i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger iValue){
		return isEven(iValue.getValue());
	
	}
	
	 public static boolean isOdd(MyInteger iValue){
		 return isOdd(iValue.getValue());
	 }
	 public static boolean isPrime(MyInteger iValue){
		 return isPrime(iValue.getValue());
	 }    
	public boolean equals(int iValue){
			return (this.iValue == iValue);
			}
	public boolean equals(MyInteger iValue){
			return equals(iValue.getValue());
			}
}