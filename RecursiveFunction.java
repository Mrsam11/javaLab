package lab12;
public class RecursiveFunction {
	public int addNumbers(int num) {
		if(num == 0) {
			return 0;
		} else {
			return num + addNumbers(num - 1);
		}
	}
	public static void main(String[] args) {
		RecursiveFunction rf = new RecursiveFunction();
		System.out.println("Sum " + rf.addNumbers(10));
	}
}
