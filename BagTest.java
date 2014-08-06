/** This will test the Bag implementations */

public class BagTest {

	public static void main(String [] args) {
		LinkedBag<String> obj_bag = new LinkedBag<String>();
		System.out.println(obj_bag.getCurrentSize()); //prints 0
		System.out.println(obj_bag.isEmpty()); //prints true
		//String r_obj = obj_bag.remove();
		//System.out.println(r_obj == null); //prints true

		obj_bag.add("Brian");
		obj_bag.add("Dad");
		obj_bag.add("Casey");
		obj_bag.add("Molly");
		obj_bag.add("Otis");
		obj_bag.add("Anthony");
		obj_bag.add("Kyle"); 
		System.out.println(obj_bag.getCurrentSize()); // r_ 7
		displayState(obj_bag);
		obj_bag.remove();
		obj_bag.remove("Brian");
		//should now contain 4 names
		

		obj_bag.add("Brian");
		obj_bag.add("Brian");
		displayState(obj_bag);
		System.out.println(obj_bag.getFrequencyOf("Brian")); //2
		System.out.println(obj_bag.getFrequencyOf("Casey")); //1
		System.out.println(obj_bag.getFrequencyOf("Jamie")); //0

		System.out.println(obj_bag.contains("Casey"));
		System.out.println(obj_bag.contains("Jamie"));

		obj_bag.clear();
		System.out.println(obj_bag.isEmpty());
		System.out.println(obj_bag.getCurrentSize());


	}

	public static String[] toStringArray(Object [] obj_array) {
		String [] r_array = new String [obj_array.length];
		for(int i = 0; i < obj_array.length; i++) {
			r_array [i] = (String)obj_array[i];
		}
		return r_array;
	}

	public static void printArray(String[] arr) {
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	public static void displayState(LinkedBag<String> obj_bag) {
		Object[] obj_array = obj_bag.toArray();
		String[] str_array = toStringArray(obj_array);
		printArray(str_array);
	}
}