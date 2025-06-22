package logical_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateElementArrays_HashMap {

	public static void main(String[] args) {

		int nums[]= {1,5,7,4,9,7,5,6,8,1,5};

		HashMap<Integer, Integer> hmMap=new HashMap<Integer, Integer>();

		for(int i=0;i<nums.length;i++) {

			int num = nums[i];

			hmMap.put(num,hmMap.getOrDefault(num, 0)+1);
		}

		for(Entry<Integer, Integer> entry:hmMap.entrySet()) {

			if(entry.getValue()>1) {

				System.out.println(entry.getKey()+" appears : "+entry.getValue()+" times");

			}

		}

	}

}
