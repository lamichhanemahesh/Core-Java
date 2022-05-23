import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Mahesh");
		list.add(new Thread());
		list.add(10);
		list.add(new Object());
		
		Object o = list.get(3);
		
		if(o instanceof String) {
			System.out.println("String Object");
		}
		else if(o instanceof Thread) {
			System.out.println("Thread Object");
		}
		else if(o instanceof Integer) {
			System.out.println("Integer Object");
		}
		else if(o instanceof Object) {
			System.out.println("Object Object");
		}

	}

}
