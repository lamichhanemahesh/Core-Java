package implementation.of.set.by.hashset;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//duplicate not allowed and insertion order not preserved
		HashSet set = new HashSet();
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("Z");
		set.add(null);
		set.add(10);
		System.out.println(set.add("Z"));
		System.out.println(set);

	}

}
