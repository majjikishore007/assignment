package trees;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static List<String> resoveDuplicates(String[] names) {

		List<String> ans = new ArrayList<String>();
		int index = 0;
		for (String name : names) {
			if (ans.contains(name)) {
				System.out.println(name);
				getNum(name);
			}
			ans.add(name);
		

		}
		return ans;
	}

	public  static int getNum(String s) {
		String res=" ";
		int start=0,end=s.length();
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			if(s.charAt(i) == '(' ) {
				start=i;
				break;
			}
		}
		
		res=s.substring(start);
		System.out.println("result "+res);
		return Integer.parseInt(res);
	}

	public static void main(String[] args) {
		String[] arr = new String[] { "Valorant", "Valorant(1)", "Valorant", "Valorant(2019)" };
		resoveDuplicates(arr);
	}
}
