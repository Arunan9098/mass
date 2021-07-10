package org.sam;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test1 {
public static void main(String[] args) {
	Map<Integer, String> s= new HashMap<>();
	s.put(1, "kira");s.put(3, "aru");s.put(4, "lkjun");s.put(5, "poiuun");
	s.put(2, "arun");
	System.out.println(s);
	Set<Integer> a= s.keySet();
	System.out.println(a);
	//for (Integer integer : a) {
		//System.out.println(integer);
	//}
	
}
}
