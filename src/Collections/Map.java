package Collections;
import java.util.HashMap;

public class Map {

	public static void main(String[] args) {


		HashMap<Integer, Character> hm = new HashMap<Integer,Character>();
			hm.put(101, 'R');
			hm.put(102, null);
			hm.put(103, 'D');
			hm.put(null, null);
			hm.put(null, 'P');
			hm.put(null, 'D');

			System.out.println(hm.get(101));
			System.out.println(hm.keySet());
			System.out.println(hm.entrySet());
			System.out.println(hm.remove(102, null));
			System.out.println(hm.values());
			System.out.println(hm.entrySet());
			System.out.println(hm.containsKey(101));
			System.out.println(hm.containsValue('R'));



	}

}
