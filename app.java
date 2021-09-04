package Collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Create vector1
		Vector vector1 = new Vector();
		vector1.add(20);
		vector1.add("String2");
		vector1.add("False");
		System.out.println(vector1);
		System.out.println(vector1.size());
		vector1.remove(0);
		System.out.println(vector1);
		System.out.println(vector1.size());

		// Create vector2
		Vector vector2 = new Vector(2);
		vector2.add(30);
		vector2.add("String3");
		vector2.add("True");
		System.out.println(vector2);
		System.out.println(vector2.size());
		vector2.remove(0);
		System.out.println(vector2);
		System.out.println(vector2.size());

	}

}
