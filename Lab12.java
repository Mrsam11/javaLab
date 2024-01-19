package lab12;
#Basic calculation
public class Lab12 {
	public boolean checkEven(int number) {
		if(number%2==0) {
			return true;
		}
		return false;
	}
	public boolean checkOdd(int number) {
		if(number%2 != 0) {
			return true;
		}
		return false;
	}
	public boolean checkPrime(int number) {
		if(number <= 1) {
			return false;
		} else {
			for(int i =2; i< number/2;i++) {
				if(i % 2 == 0) {
					return false;
				}
				break;
			}
		}
		return true;
	}
	public int factorial(int number) {
		int fact = 1;
		for(int i = 1; i<= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Lab12 obj = new Lab12();
		System.out.println(obj.factorial(5));
	}
}
