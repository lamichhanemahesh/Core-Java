package multiple.catch_block.progrm.flow;

public class Test {

	public static void main(String[] args) throws ArithmeticException {
		
		try {
//			System.out.println(10/0);
			int x = 10;
			x = (Integer) null;
			System.out.println(x);
		}
		catch(ArithmeticException e) {
			System.out.println("arithemetic exception block");
		}
		catch(Exception e) {
			System.out.println("exception block");
		}
		

	}

}
