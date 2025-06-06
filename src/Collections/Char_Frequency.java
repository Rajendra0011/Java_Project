package Collections;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

public class Char_Frequency {
	public static void main(String[] args) {



		String input = "RajendraKarhale";

//		char [] p= input.toCharArray();

		Map<Character, Integer> cMap=new HashMap<Character, Integer>();

		for(char ch:input.toCharArray()) {

			cMap.put(ch, cMap.getOrDefault(ch, 0)+1);
		}

		for( Entry<Character, Integer> entry : cMap.entrySet()) {

			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" = "+ entry.getValue());
			}


//			System.out.println(entry.getKey()+" "+ entry.getValue());



		}
	}

}
