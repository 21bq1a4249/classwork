public class HandleError {
	public static void main(String args[]) {
		int d,a;
		try {
			d=0;
			a=42/d;
			System.out.println("this will not be printed");
		}
		catch (ArithematicException e) {
			System.out.println("division by zero");
		}
		System.out.println("after catch statement");
	}

}
